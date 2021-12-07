package org.example;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import CalculatorEngine.MyCalculator;
import CalculatorEngine.MyCalculatorImpl;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class FXMLController implements Initializable {

    @FXML
    private Pane paneMenu, paneTime, paneDate, pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    @FXML
    private Pane paneProgrammes, pane1P, pane2P, pane3P, b1P, b2P, b3P, bCloseCalculator;
    @FXML
    private Pane paneGames, pane1G, pane2G, b1G, b2G;
    @FXML
    private Pane paneSettings1, pane1S, pane2S, b1S, b2S;
    @FXML
    private Pane paneSettings2, pane1S2, pane2S2, pane3S2, pane4S2, b1S2, b2S2, b3S2, b4S2, bCloseSettings2;
    @FXML
    private Pane paneCalculator, paneOpacity, paneGoogle, paneChat, paneChat1, paneChat2;
    @FXML
    private Pane paneBar, paneSlider, paneImages1, paneImages2, paneImages3, bImages3, bImages1, bClose, paneSettings3;
    @FXML
    private ImageView image1, image2, image3, image4;
    @FXML
    private TextField textFieldCalculator, textFieldName, textFieldHost, textFieldPort, textFieldMessage;
    @FXML
    private Button bConnect, bEnterChat;
    @FXML
    private TextArea textArea;
    @FXML
    private WebView webView;
    @FXML
    private Label labelTime, labelTime1, labelTime2;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private Slider slider;

    private WebEngine engine;
    private volatile boolean stop = false;


    @FXML
    private void enteredBar(MouseEvent event) {

        if (event.getTarget() == bImages1) {
            paneMenu.setVisible(true);
            paneSettings2.setVisible(false);
            paneSettings3.setVisible(false);
            paneImages1.setBackground(new Background(new BackgroundFill(Color.rgb(84, 89, 95, 1), new CornerRadii(5), Insets.EMPTY)));
            paneImages1.setEffect(new InnerShadow(12.0, Color.rgb(221, 212, 218)));
        }
        if (event.getTarget() == bClose) {
            paneImages2.setBackground(new Background(new BackgroundFill(Color.rgb(84, 89, 95, 1), new CornerRadii(50), Insets.EMPTY)));
            paneImages2.setEffect(new InnerShadow(12.0, Color.rgb(221, 212, 218)));
        }
        if (event.getTarget() == labelTime) {
            paneMenu.setVisible(false);
            paneProgrammes.setVisible(false);
            paneSettings1.setVisible(false);
            paneSettings2.setVisible(false);
            paneGames.setVisible(false);
            paneSettings3.setVisible(false);
        }
        if (event.getTarget() == paneBar) {
            paneMenu.setVisible(false);
            paneProgrammes.setVisible(false);
            paneSettings1.setVisible(false);
            paneSettings2.setVisible(false);
            paneGames.setVisible(false);
            paneSettings3.setVisible(false);
        }
        if (event.getTarget() == image1) {
            paneMenu.setVisible(false);
            paneProgrammes.setVisible(false);
            paneSettings1.setVisible(false);
            paneSettings2.setVisible(false);
            paneGames.setVisible(false);
            paneSettings3.setVisible(false);
        }
        if (event.getTarget() == image2) {
            paneMenu.setVisible(false);
            paneProgrammes.setVisible(false);
            paneSettings1.setVisible(false);
            paneSettings2.setVisible(false);
            paneGames.setVisible(false);
            paneSettings3.setVisible(false);
        }
        if (event.getTarget() == image3) {
            paneMenu.setVisible(false);
            paneProgrammes.setVisible(false);
            paneSettings1.setVisible(false);
            paneSettings2.setVisible(false);
            paneGames.setVisible(false);
            paneSettings3.setVisible(false);
        }
        if (event.getTarget() == image4) {
            paneMenu.setVisible(false);
            paneProgrammes.setVisible(false);
            paneSettings1.setVisible(false);
            paneSettings2.setVisible(false);
            paneGames.setVisible(false);
            paneSettings3.setVisible(false);
        }
        if (event.getTarget() == paneChat1) {
            paneMenu.setVisible(false);
            paneProgrammes.setVisible(false);
            paneSettings1.setVisible(false);
            paneSettings2.setVisible(false);
            paneGames.setVisible(false);
            paneSettings3.setVisible(false);
        }
        if (event.getTarget() == bImages3) {
            paneImages3.setBackground(new Background(new BackgroundFill(Color.rgb(84, 89, 95, 1), new CornerRadii(5), Insets.EMPTY)));
            paneImages3.setEffect(new InnerShadow(12.0, Color.rgb(221, 212, 218)));
        }
        if (event.getTarget() == paneSlider) {
            paneSlider.setBackground(new Background(new BackgroundFill(Color.rgb(84, 89, 95, 1), new CornerRadii(50), Insets.EMPTY)));
            paneSlider.setEffect(new InnerShadow(12.0, Color.rgb(221, 212, 218)));
        }
        if (event.getTarget() == slider) {
            paneSlider.setBackground(new Background(new BackgroundFill(Color.rgb(84, 89, 95, 1), new CornerRadii(50), Insets.EMPTY)));
            paneSlider.setEffect(new InnerShadow(12.0, Color.rgb(221, 212, 218)));
        }
    }

    @FXML
    private void exitedBar(MouseEvent event) {

        if (event.getTarget() == bImages1) {
            paneImages1.setBackground(new Background(new BackgroundFill(Color.rgb(83, 87, 93, 1), new CornerRadii(5), Insets.EMPTY)));
            paneImages1.setEffect(new InnerShadow(12.0, Color.rgb(0, 0, 0, 0)));
        }
        if (event.getTarget() == bClose) {
            paneImages2.setBackground(new Background(new BackgroundFill(Color.rgb(83, 87, 93, 1), new CornerRadii(5), Insets.EMPTY)));
            paneImages2.setEffect(new InnerShadow(12.0, Color.rgb(0, 0, 0, 0)));
        }
        if (event.getTarget() == bImages3) {
            paneImages3.setBackground(new Background(new BackgroundFill(Color.rgb(83, 87, 93, 1), new CornerRadii(5), Insets.EMPTY)));
            paneImages3.setEffect(new InnerShadow(12.0, Color.rgb(0, 0, 0, 0)));
        }
        if (event.getTarget() == paneSlider) {
            paneSlider.setBackground(new Background(new BackgroundFill(Color.rgb(83, 87, 93, 1), new CornerRadii(5), Insets.EMPTY)));
            paneSlider.setEffect(new InnerShadow(12.0, Color.rgb(0, 0, 0, 0)));
        }
        if (event.getTarget() == slider) {
            paneSlider.setBackground(new Background(new BackgroundFill(Color.rgb(83, 87, 93, 1), new CornerRadii(5), Insets.EMPTY)));
            paneSlider.setEffect(new InnerShadow(12.0, Color.rgb(0, 0, 0, 0)));
        }
    }

    @FXML
    private void enteredMenu(MouseEvent event) {

        if (event.getTarget() == b1) {
            pane1.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 255, 64, 1), 10, 0.4, 0, 0));
            paneProgrammes.setVisible(true);
            paneGames.setVisible(false);
            paneSettings1.setVisible(false);
        }
        if (event.getTarget() == b2) {
            pane2.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 255, 64, 1), 10, 0.4, 0, 0));
            paneProgrammes.setVisible(false);
            paneGames.setVisible(true);
            paneSettings1.setVisible(false);
        }
        if (event.getTarget() == b3) {
            pane3.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 255, 64, 1), 10, 0.4, 0, 0));
            paneProgrammes.setVisible(false);
            paneGames.setVisible(false);
            paneSettings1.setVisible(false);
        }
        if (event.getTarget() == b4) {
            pane4.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 255, 64, 1), 10, 0.4, 0, 0));
            paneProgrammes.setVisible(false);
            paneGames.setVisible(false);
            paneSettings1.setVisible(false);
        }
        if (event.getTarget() == b5) {
            paneProgrammes.setVisible(false);
            paneGames.setVisible(false);
            paneSettings1.setVisible(false);
        }
        if (event.getTarget() == b6) {
            pane6.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 170, 225, 1), 10, 0.4, 0, 0));
            paneProgrammes.setVisible(false);
            paneGames.setVisible(false);
            paneSettings1.setVisible(false);
        }
        if (event.getTarget() == b7) {
            paneProgrammes.setVisible(false);
            paneGames.setVisible(false);
            paneSettings1.setVisible(false);
        }
        if (event.getTarget() == b8) {
            pane8.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(255, 61, 61, 1), 10, 0.4, 0, 0));
            paneProgrammes.setVisible(false);
            paneGames.setVisible(false);
            paneSettings1.setVisible(true);
        }
        if (event.getTarget() == b9) {
            paneProgrammes.setVisible(false);
            paneGames.setVisible(false);
            paneSettings1.setVisible(false);
        }
        if (event.getTarget() == b10) {
            pane10.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(255, 61, 61, 1), 10, 0.4, 0, 0));
            paneProgrammes.setVisible(false);
            paneGames.setVisible(false);
            paneSettings1.setVisible(false);
        }
    }

    @FXML
    private void exitedMenu(MouseEvent event) {

        if (event.getTarget() == b1) {
            pane1.setEffect(new Glow(0));
        }
        if (event.getTarget() == b2) {
            pane2.setEffect(new Glow(0));
        }
        if (event.getTarget() == b3) {
            pane3.setEffect(new Glow(0));
        }
        if (event.getTarget() == b4) {
            pane4.setEffect(new Glow(0));
        }
        if (event.getTarget() == b6) {
            pane6.setEffect(new Glow(0));
        }
        if (event.getTarget() == b8) {
            pane8.setEffect(new Glow(0));

        }
        if (event.getTarget() == b10) {
            pane10.setEffect(new Glow(0));
        }
    }

    @FXML
    private void enteredProgrammes(MouseEvent event) {

        if (event.getTarget() == b1P) {
            pane1P.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 255, 64, 1), 10, 0.4, 0, 0));
        }
        if (event.getTarget() == b2P) {
            pane2P.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 255, 64, 1), 10, 0.4, 0, 0));
        }
        if (event.getTarget() == b3P) {
            pane3P.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 255, 64, 1), 10, 0.4, 0, 0));
        }
    }

    @FXML
    private void exitedProgrammes(MouseEvent event) {

        if (event.getTarget() == b1P) {
            pane1P.setEffect(new Glow(0));
        }
        if (event.getTarget() == b2P) {
            pane2P.setEffect(new Glow(0));
        }
        if (event.getTarget() == b3P) {
            pane3P.setEffect(new Glow(0));
        }
    }

    @FXML
    private void enteredGames(MouseEvent event) {

        if (event.getTarget() == b1G) {
            pane1G.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 255, 64, 1), 10, 0.4, 0, 0));
        }
        if (event.getTarget() == b2G) {
            pane2G.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 255, 64, 1), 10, 0.4, 0, 0));
        }
    }

    @FXML
    private void exitedGames(MouseEvent event) {

        if (event.getTarget() == b1G) {
            pane1G.setEffect(new Glow(0));
        }
        if (event.getTarget() == b2G) {
            pane2G.setEffect(new Glow(0));
        }
    }

    @FXML
    private void enteredSettings1(MouseEvent event) {

        if (event.getTarget() == b1S) {
            pane1S.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(255, 61, 61, 1), 10, 0.4, 0, 0));
        }
        if (event.getTarget() == b2S) {
            pane2S.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(255, 61, 61, 1), 10, 0.4, 0, 0));
        }
    }

    @FXML
    private void exitedSettings1(MouseEvent event) {

        if (event.getTarget() == b1S) {
            pane1S.setEffect(new Glow(0));
        }
        if (event.getTarget() == b2S) {
            pane2S.setEffect(new Glow(0));
        }
    }

    @FXML
    private void enteredSettings2(MouseEvent event) {

        if (event.getTarget() == b1S2) {
            pane1S2.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(255, 61, 61, 1), 10, 0.4, 0, 0));
        }
        if (event.getTarget() == b2S2) {
            pane2S2.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(255, 61, 61, 1), 10, 0.4, 0, 0));
        }
        if (event.getTarget() == b3S2) {
            pane3S2.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(255, 61, 61, 1), 10, 0.4, 0, 0));
        }
        if (event.getTarget() == b4S2) {
            pane4S2.setEffect(new DropShadow(BlurType.GAUSSIAN, Color.rgb(255, 61, 61, 1), 10, 0.4, 0, 0));
        }
    }

    @FXML
    private void exitedSettings2(MouseEvent event) {

        if (event.getTarget() == b1S2) {
            pane1S2.setEffect(new Glow(0));
        }
        if (event.getTarget() == b2S2) {
            pane2S2.setEffect(new Glow(0));
        }
        if (event.getTarget() == b3S2) {
            pane3S2.setEffect(new Glow(0));
        }
        if (event.getTarget() == b4S2) {
            pane4S2.setEffect(new Glow(0));
        }
    }

    @FXML
    private void clickedBar(MouseEvent event) {
        stop = true;
        if (event.getTarget() == bClose) {
            javafx.application.Platform.exit();
        }
        if (event.getTarget() == bImages3) {
            paneGoogle.setVisible(false);
            paneChat.setVisible(false);
            paneCalculator.setVisible(false);
            paneSettings2.setVisible(false);
            paneSettings3.setVisible(false);
        }
    }

    @FXML
    private void clickedMenu(MouseEvent event) {

        if (event.getTarget() == b3) {
            paneMenu.setVisible(false);
            paneCalculator.setVisible(false);
            paneGoogle.setVisible(false);
            paneChat.setVisible(true);
        }
        if (event.getTarget() == b4) {
            paneMenu.setVisible(false);
            paneCalculator.setVisible(false);
            paneGoogle.setVisible(true);
            paneChat.setVisible(false);
        }
        if (event.getTarget() == b2S) {
            paneMenu.setVisible(false);
            paneSettings1.setVisible(false);
            paneCalculator.setVisible(false);
            paneChat.setVisible(false);
            paneGoogle.setVisible(false);
            paneSettings2.setVisible(true);
        }
        if (event.getTarget() == b10) {
            javafx.application.Platform.exit();
        }
    }

    @FXML
    private void clickedChat(ActionEvent event) {

        if (event.getSource() == bConnect) {
            paneChat1.setVisible(false);
            paneChat2.setVisible(true);
        }
    }

    @FXML
    private void clickedProgrammes(MouseEvent event) {

        if (event.getTarget() == b3P) {
            paneMenu.setVisible(false);
            paneProgrammes.setVisible(false);
            paneCalculator.setVisible(true);
        }
        if (event.getTarget() == bCloseCalculator) {
            paneCalculator.setVisible(false);
        }
    }

    @FXML
    private void clickedSettings2(MouseEvent event) {

        if (event.getTarget() == b1S2) {
            image1.setVisible(true);
            image2.setVisible(false);
            image3.setVisible(false);
            image4.setVisible(false);
        }
        if (event.getTarget() == b2S2) {
            image1.setVisible(false);
            image2.setVisible(true);
            image3.setVisible(false);
            image4.setVisible(false);
        }
        if (event.getTarget() == b3S2) {
            image1.setVisible(false);
            image2.setVisible(false);
            image3.setVisible(true);
            image4.setVisible(false);
        }
        if (event.getTarget() == b4S2) {
            image1.setVisible(false);
            image2.setVisible(false);
            image3.setVisible(false);
            image4.setVisible(true);
        }
        if (event.getTarget() == bCloseSettings2) {
            paneSettings2.setVisible(false);
        }
        if (event.getTarget() == b1S) {
            paneMenu.setVisible(false);
            paneSettings1.setVisible(false);
            paneSettings3.setVisible(true);
            paneGoogle.setVisible(false);
            paneChat.setVisible(false);
        }
    }

    @FXML
    private void colorPicker(ActionEvent event) {

        Color color = colorPicker.getValue();
        labelTime.setTextFill(color);
        labelTime1.setTextFill(color);
        labelTime2.setTextFill(color);
    }

    @FXML
    private void calcButtons(ActionEvent event) {
        Button button = (Button) event.getSource();
        String textButton = button.getText();
        String currentText = textFieldCalculator.getText();
        textFieldCalculator.setText(currentText + textButton);
    }

    @FXML
    private void calcRes(ActionEvent event) {

        MyCalculator myCalculator = new MyCalculatorImpl();
        String text = textFieldCalculator.getText();
        System.out.println("text=" + text);
        if (text.contains("+")) {
            int i = text.indexOf("+");
            String aText = text.substring(0, i);
            String bText = text.substring(i + 1, text.length());

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.add(a, b);
            textFieldCalculator.setText(text + "=" + res);


        } else if (text.contains("-")) {
            int i = text.indexOf("-");
            String aText = text.substring(0, i);
            String bText = text.substring(i + 1, text.length());

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.subtract(a, b);
            textFieldCalculator.setText(text + "=" + res);

        } else if (text.contains("*")) {
            int i = text.indexOf("*");
            String aText = text.substring(0, i);
            String bText = text.substring(i + 1, text.length());

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.product(a, b);
            textFieldCalculator.setText(text + "=" + res);
        } else {
            int i = text.indexOf("/");
            String aText = text.substring(0, i);
            String bText = text.substring(i + 1, text.length());

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.divide(a, b);
            textFieldCalculator.setText(text + "=" + res);

        }
    }

    private void watch() {

        Thread thread = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
            while (!stop) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println();
                }
                final String time = sdf.format(new Date());
                Platform.runLater(() -> {
                    labelTime.setText(time);
                });
            }
        });
        thread.start();
    }

    private void watch1() {

        Thread thread = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            while (!stop) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println();
                }
                final String time = sdf.format(new Date());
                Platform.runLater(() -> {
                    labelTime1.setText(time);
                });
            }
        });
        thread.start();
    }

    private void watch2() {

        Thread thread = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
            while (!stop) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println();
                }
                final String time = sdf.format(new Date());
                Platform.runLater(() -> {
                    labelTime2.setText(time);
                });
            }
        });
        thread.start();
    }

    @FXML
    private void enteredTime(MouseEvent event) {

        if (event.getTarget() == labelTime) {
            paneDate.setVisible(true);
        }
        paneTime.setBackground(new Background(new BackgroundFill(Color.rgb(84, 89, 95, 1), new CornerRadii(50), Insets.EMPTY)));
        paneTime.setEffect(new InnerShadow(12.0, Color.rgb(221, 212, 218)));
        //paneTime.setEffect(new GaussianBlur(2));
    }

    @FXML
    private void exitedTime(MouseEvent event) {

        if (event.getTarget() == labelTime) {
            paneDate.setVisible(false);
            paneTime.setBackground(new Background(new BackgroundFill(Color.rgb(83, 87, 93, 1), new CornerRadii(5), Insets.EMPTY)));
            paneTime.setEffect(new InnerShadow(12.0, Color.rgb(0, 0, 0, 0)));
            //paneTime.setEffect(new GaussianBlur(2));
        }
    }

    public void changed(ObservableValue <? extends Object> observable, Object oldValue, Object newValue) {
        Double s = slider.getValue();
        Color color = Color.rgb(83,87,93,s);
        paneOpacity.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine = webView.getEngine();
        engine.load("http://www.google.com");

        watch();
        watch1();
        watch2();

        slider.valueProperty().addListener(this::changed);
    }

    public void setTextFieldCalculator(TextField textFieldCalculator) {
        this.textFieldCalculator = textFieldCalculator;
    }
}
