package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import calculatorEngine.MyCalculator;
import calculatorEngine.MyCalculatorImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class FXMLController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField, textFieldMessage, textFieldUserName, textFieldHost, textFieldPort;
    @FXML
    private WebView webview;
    @FXML
    private Pane paneA, paneB, paneC, paneD;
    @FXML
    private AnchorPane paneHome, paneChat, paneChat1, paneChat2, paneCalculator, paneSettings;

    // paneHome.................................

    @FXML
    private void inVisible(MouseEvent event) {

        if (event.getTarget() == paneA) {
            paneHome.setVisible(true);
            paneChat.setVisible(false);
            paneCalculator.setVisible(false);
            paneSettings.setVisible(false);
        }
        if (event.getTarget() == paneB) {
            paneHome.setVisible(false);
            paneChat.setVisible(true);
            paneCalculator.setVisible(false);
            paneSettings.setVisible(false);
        }
        if (event.getTarget() == paneC) {
            paneHome.setVisible(false);
            paneChat.setVisible(false);
            paneCalculator.setVisible(true);
            paneSettings.setVisible(false);
        }
        if (event.getTarget() == paneD) {
            paneHome.setVisible(false);
            paneChat.setVisible(false);
            paneCalculator.setVisible(false);
            paneSettings.setVisible(true);
        }

    }

    @FXML
    void facebook(ActionEvent event) {

        final WebEngine engine = webview.getEngine();
        String webUrl = "http://www.facebook.com";
        engine.load(webUrl);
    }

    @FXML
    void google(ActionEvent event) {

        final WebEngine engine = webview.getEngine();
        String webUrl = "http://www.google.com";
        engine.load(webUrl);
    }

    @FXML
    void simpsons(ActionEvent event) {

        final WebEngine engine = webview.getEngine();
        String webUrl = "http://www.simpsonsua.tv";
        engine.load(webUrl);
    }

    @FXML
    void youtube(ActionEvent event) {

        final WebEngine engine = webview.getEngine();
        String webUrl = "https://www.youtube.com/watch?v=J4t4pMZBXZg";
        engine.load(webUrl);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        final WebEngine engine = webview.getEngine();
        String webUrl = "http://www.google.com";
        engine.load(webUrl);

    }

    // paneCalculator...........................

    @FXML
    void calculatorButton(ActionEvent event) {

        Button button = (Button) event.getSource();
        String textButton = button.getText();
        String currentText = textField.getText();
        textField.setText(currentText + textButton);
    }

    @FXML
    void calculatorRes(ActionEvent event) {

        MyCalculator myCalculator = new MyCalculatorImpl();
        String text = textField.getText();

        if (text.contains("+")) {
            int i = text.indexOf("+");
            String aText = text.substring(0, i);
            String bText = text.substring(i + 1, text.length());

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.add(a, b);
            textField.setText(text + " = " + res);
        } else if (text.contains("-")) {
            int i = text.indexOf("-");
            String aText = text.substring(0, i);
            String bText = text.substring(i + 1, text.length());

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.subtract(a, b);
            textField.setText(text + " = " + res);
        } else if (text.contains("*")) {
            int i = text.indexOf("*");
            String aText = text.substring(0, i);
            String bText = text.substring(i + 1, text.length());

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.product(a, b);
            textField.setText(text + " = " + res);
        } else {
            int i = text.indexOf("+");
            String aText = text.substring(0, i);
            String bText = text.substring(i + 1, text.length());

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.add(a, b);
            textField.setText(text + " = " + res);

        }
    }


    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    // paneChat.................................

    @FXML
    void connect(ActionEvent event){

        paneChat.setVisible(true);
        paneChat1.setVisible(false);
        paneChat2.setVisible(true);
    }
}