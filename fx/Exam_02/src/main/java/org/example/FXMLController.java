package org.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class FXMLController implements Initializable {

    @FXML
    private Pane pane1, pane2, pane3, pane1small, b_1, pane3small, b_2, paneDownloads, b_Close;

    @FXML
    private void entered(MouseEvent event) {

        if (event.getTarget() == b_1) {
            pane1.setBackground(new Background(new BackgroundFill(Color.rgb(58,61,66), CornerRadii.EMPTY, Insets.EMPTY)));
            pane2.setVisible(true);
            pane1small.setVisible(true);

        }
        if (event.getTarget() == pane2) {
            pane1.setBackground(new Background(new BackgroundFill(Color.rgb(58,61,66), CornerRadii.EMPTY, Insets.EMPTY)));
            pane2.setVisible(true);
            pane1small.setVisible(true);
        }
        if (event.getTarget() == b_2) {
            pane3.setBackground(new Background(new BackgroundFill(Color.rgb(58,61,66), CornerRadii.EMPTY, Insets.EMPTY)));
            pane3small.setVisible(true);
        }
    }
    @FXML
    private void exited(MouseEvent event) {

        if (event.getTarget() == b_1) {
            pane1.setBackground(new Background(new BackgroundFill(Color.rgb(83,87,93), CornerRadii.EMPTY, Insets.EMPTY)));
            pane2.setVisible(false);
            pane1small.setVisible(false);
        }
        if (event.getTarget() == pane2) {
            pane1.setBackground(new Background(new BackgroundFill(Color.rgb(83,87,93), CornerRadii.EMPTY, Insets.EMPTY)));
            pane2.setVisible(false);
            pane1small.setVisible(false);
        }
        if (event.getTarget() == b_2) {
            pane3.setBackground(new Background(new BackgroundFill(Color.rgb(83,87,93), CornerRadii.EMPTY, Insets.EMPTY)));
            pane3small.setVisible(false);
        }
    }
    @FXML
    private void click(MouseEvent event) {

        if (event.getTarget() == b_2) {
            paneDownloads.setVisible(true);
        }
        if (event.getTarget() == b_Close) {
            paneDownloads.setVisible(false);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
