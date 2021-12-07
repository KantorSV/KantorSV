package org.example;

import java.net.URL;
import java.util.ResourceBundle;

import helper.music.PlayMusic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class FXMLController implements Initializable {

    @FXML
    private Pane Home, Web, App, Calculator, Chat, Favorite, Settings, paneSkelerTokyo;
    @FXML
    private AnchorPane paneHome, paneWeb, paneApp, paneCalculator, paneChat, paneChat_1, paneChat_2, paneFavorite, paneSettings;
    @FXML
    private TextField textFieldWeb;
    @FXML
    private WebView webView;

    private WebEngine engine;
    private String homePage;

    @FXML
    private void paneTarget(MouseEvent event) {

        if (event.getTarget() == Home) {

            paneHome.setVisible(true);

        } else if (event.getTarget() == Web) {

            paneHome.setVisible(false);
            paneWeb.setVisible(true);
            paneApp.setVisible(false);
            paneCalculator.setVisible(false);
            paneChat.setVisible(false);
            paneFavorite.setVisible(false);
            paneSettings.setVisible(false);


        } else if (event.getTarget() == App) {

            paneHome.setVisible(false);
            paneWeb.setVisible(false);
            paneApp.setVisible(true);

        } else if (event.getTarget() == Calculator) {

            paneHome.setVisible(false);
            paneWeb.setVisible(false);
            paneApp.setVisible(false);
            paneCalculator.setVisible(true);

        } else if (event.getTarget() == Chat) {

            paneHome.setVisible(false);
            paneWeb.setVisible(false);
            paneApp.setVisible(false);
            paneCalculator.setVisible(false);
            paneChat.setVisible(true);
            paneFavorite.setVisible(false);
            paneSettings.setVisible(false);

        } else if (event.getTarget() == Favorite) {

            paneHome.setVisible(false);
            paneWeb.setVisible(false);
            paneApp.setVisible(false);
            paneCalculator.setVisible(false);
            paneChat.setVisible(false);
            paneFavorite.setVisible(true);


        } else if (event.getTarget() == Settings) {

            paneHome.setVisible(false);
            paneWeb.setVisible(false);
            paneApp.setVisible(false);
            paneCalculator.setVisible(false);
            paneChat.setVisible(false);
            paneFavorite.setVisible(false);
            paneSettings.setVisible(true);
        }
    }

    @FXML
    void connect(ActionEvent event) {

        paneChat.setVisible(true);
        paneChat_1.setVisible(false);
        paneChat_2.setVisible(true);
        paneHome.setVisible(false);
        paneWeb.setVisible(false);
        paneApp.setVisible(false);
        paneCalculator.setVisible(false);
        paneFavorite.setVisible(false);
        paneSettings.setVisible(false);

    }

    @FXML
    void load() {

        engine.load("http://www." + textFieldWeb.getText());

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        engine = webView.getEngine();
        homePage = "google.com";
        textFieldWeb.setText(homePage);
        load();
    }

    @FXML
    private void audio(MouseEvent event) {

        if (event.getTarget() == paneSkelerTokyo) {

            PlayMusic.music("D:\\javaFX\\fx\\App\\src\\main\\resources\\music\\Skeler-Tokyo.wav");

        }
    }

    @FXML
    void exit(ActionEvent event) {

        javafx.application.Platform.exit();

    }
}
