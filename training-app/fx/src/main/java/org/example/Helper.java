package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Helper {

    public static void showError(Exception ex) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(ex.getMessage());
        alert.showAndWait();

        ex.printStackTrace();
    }


    public static void showErrorWithDetails(Exception ex) {
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            PrintStream ps = new PrintStream(out);
            ex.printStackTrace(ps);
            byte[] data = out.toByteArray();
            String errorMessage = new String(data);


            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(ex.getMessage());
            alert.setContentText(errorMessage);

            alert.showAndWait();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
