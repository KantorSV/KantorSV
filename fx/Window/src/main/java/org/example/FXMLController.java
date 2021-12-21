package org.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class FXMLController implements Initializable {

    @FXML
    private MediaView mv;
    @FXML
    private Pane close, menu, user, gitHub, settings, home, pane1, pane2, pane3, pane4, pane5, paneHead;

    @FXML
    private void entered(MouseEvent event) {
        if (event.getTarget() == close) {
            close.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0.15), new CornerRadii(3), Insets.EMPTY)));
        }
        if (event.getTarget() == menu) {
            menu.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0.15), new CornerRadii(3), Insets.EMPTY)));

        }
        if (event.getTarget() == user) {
            user.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0.15), new CornerRadii(3), Insets.EMPTY)));

        }
        if (event.getTarget() == gitHub) {
            gitHub.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0.15), new CornerRadii(3), Insets.EMPTY)));

        }
        if (event.getTarget() == settings) {
            settings.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0.15), new CornerRadii(3), Insets.EMPTY)));

        }
        if (event.getTarget() == home) {
            home.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0.15), new CornerRadii(3), Insets.EMPTY)));

        }
    }
    @FXML
    private void exited(MouseEvent event) {
        if (event.getTarget() == close) {
            close.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0), new CornerRadii(3), Insets.EMPTY)));
        }
        if (event.getTarget() == menu) {
            menu.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0), new CornerRadii(3), Insets.EMPTY)));
        }
        if (event.getTarget() == user) {
            user.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0), new CornerRadii(3), Insets.EMPTY)));
        }
        if (event.getTarget() == gitHub) {
            gitHub.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0), new CornerRadii(3), Insets.EMPTY)));
        }
        if (event.getTarget() == settings) {
            settings.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0), new CornerRadii(3), Insets.EMPTY)));
        }
        if (event.getTarget() == home) {
            home.setBackground(new Background(new BackgroundFill(Color.rgb(192,192,192,0), new CornerRadii(3), Insets.EMPTY)));
        }
    }
    @FXML
    private void click(MouseEvent event) {
        if (event.getTarget() == mv) {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.2));
            slide.setNode(pane5);
            slide.setToX(0);
            slide.play();
            TranslateTransition slide2 = new TranslateTransition();
            slide2.setDuration(Duration.seconds(0.2));
            slide2.setNode(pane2);
            slide2.setToX(0);
            slide2.play();
            TranslateTransition slide3 = new TranslateTransition();
            slide3.setDuration(Duration.seconds(0.2));
            slide3.setNode(pane3);
            slide3.setToX(0);
            slide3.play();
            TranslateTransition slide4 = new TranslateTransition();
            slide4.setDuration(Duration.seconds(0.2));
            slide4.setNode(pane4);
            slide4.setToX(0);
            slide4.play();
            TranslateTransition slide5 = new TranslateTransition();
            slide5.setDuration(Duration.seconds(0.2));
            slide5.setNode(pane1);
            slide5.setToX(0);
            slide5.play();
        }
        if (event.getTarget() == paneHead) {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.2));
            slide.setNode(pane5);
            slide.setToX(0);
            slide.play();
            TranslateTransition slide2 = new TranslateTransition();
            slide2.setDuration(Duration.seconds(0.2));
            slide2.setNode(pane2);
            slide2.setToX(0);
            slide2.play();
            TranslateTransition slide3 = new TranslateTransition();
            slide3.setDuration(Duration.seconds(0.2));
            slide3.setNode(pane3);
            slide3.setToX(0);
            slide3.play();
            TranslateTransition slide4 = new TranslateTransition();
            slide4.setDuration(Duration.seconds(0.2));
            slide4.setNode(pane4);
            slide4.setToX(0);
            slide4.play();
            TranslateTransition slide5 = new TranslateTransition();
            slide5.setDuration(Duration.seconds(0.2));
            slide5.setNode(pane1);
            slide5.setToX(0);
            slide5.play();
        }
        if (event.getTarget() == close) {
            javafx.application.Platform.exit();
        }
        if (event.getTarget() == home) {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.2));
            slide.setNode(pane1);
            slide.setToX(132);
            slide.play();
            TranslateTransition slide2 = new TranslateTransition();
            slide2.setDuration(Duration.seconds(0.2));
            slide2.setNode(pane2);
            slide2.setToX(0);
            slide2.play();
            TranslateTransition slide3 = new TranslateTransition();
            slide3.setDuration(Duration.seconds(0.2));
            slide3.setNode(pane3);
            slide3.setToX(0);
            slide3.play();
            TranslateTransition slide4 = new TranslateTransition();
            slide4.setDuration(Duration.seconds(0.2));
            slide4.setNode(pane4);
            slide4.setToX(0);
            slide4.play();
            TranslateTransition slide5 = new TranslateTransition();
            slide5.setDuration(Duration.seconds(0.2));
            slide5.setNode(pane5);
            slide5.setToX(0);
            slide5.play();
            pane1.setVisible(true);
            pane2.setVisible(false);
            pane3.setVisible(false);
            pane4.setVisible(false);
            pane5.setVisible(false);
        }
        if (event.getTarget() == user) {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.2));
            slide.setNode(pane2);
            slide.setToX(192);
            slide.play();
            TranslateTransition slide2 = new TranslateTransition();
            slide2.setDuration(Duration.seconds(0.2));
            slide2.setNode(pane1);
            slide2.setToX(0);
            slide2.play();
            TranslateTransition slide3 = new TranslateTransition();
            slide3.setDuration(Duration.seconds(0.2));
            slide3.setNode(pane3);
            slide3.setToX(0);
            slide3.play();
            TranslateTransition slide4 = new TranslateTransition();
            slide4.setDuration(Duration.seconds(0.2));
            slide4.setNode(pane4);
            slide4.setToX(0);
            slide4.play();
            TranslateTransition slide5 = new TranslateTransition();
            slide5.setDuration(Duration.seconds(0.2));
            slide5.setNode(pane5);
            slide5.setToX(0);
            slide5.play();
            pane1.setVisible(false);
            pane2.setVisible(true);
            pane3.setVisible(false);
            pane4.setVisible(false);
            pane5.setVisible(false);
        }
        if (event.getTarget() == gitHub) {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.2));
            slide.setNode(pane3);
            slide.setToX(252);
            slide.play();
            TranslateTransition slide2 = new TranslateTransition();
            slide2.setDuration(Duration.seconds(0.2));
            slide2.setNode(pane2);
            slide2.setToX(0);
            slide2.play();
            TranslateTransition slide3 = new TranslateTransition();
            slide3.setDuration(Duration.seconds(0.2));
            slide3.setNode(pane1);
            slide3.setToX(0);
            slide3.play();
            TranslateTransition slide4 = new TranslateTransition();
            slide4.setDuration(Duration.seconds(0.2));
            slide4.setNode(pane4);
            slide4.setToX(0);
            slide4.play();
            TranslateTransition slide5 = new TranslateTransition();
            slide5.setDuration(Duration.seconds(0.2));
            slide5.setNode(pane5);
            slide5.setToX(0);
            slide5.play();
            pane1.setVisible(false);
            pane2.setVisible(false);
            pane3.setVisible(true);
            pane4.setVisible(false);
            pane5.setVisible(false);
        }
        if (event.getTarget() == settings) {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.2));
            slide.setNode(pane4);
            slide.setToX(312);
            slide.play();
            TranslateTransition slide2 = new TranslateTransition();
            slide2.setDuration(Duration.seconds(0.2));
            slide2.setNode(pane2);
            slide2.setToX(0);
            slide2.play();
            TranslateTransition slide3 = new TranslateTransition();
            slide3.setDuration(Duration.seconds(0.2));
            slide3.setNode(pane3);
            slide3.setToX(0);
            slide3.play();
            TranslateTransition slide4 = new TranslateTransition();
            slide4.setDuration(Duration.seconds(0.2));
            slide4.setNode(pane1);
            slide4.setToX(0);
            slide4.play();
            TranslateTransition slide5 = new TranslateTransition();
            slide5.setDuration(Duration.seconds(0.2));
            slide5.setNode(pane5);
            slide5.setToX(0);
            slide5.play();
            pane1.setVisible(false);
            pane2.setVisible(false);
            pane3.setVisible(false);
            pane4.setVisible(true);
            pane5.setVisible(false);
        }
        if (event.getTarget() == menu) {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.2));
            slide.setNode(pane5);
            slide.setToX(372);
            slide.play();
            TranslateTransition slide2 = new TranslateTransition();
            slide2.setDuration(Duration.seconds(0.2));
            slide2.setNode(pane2);
            slide2.setToX(0);
            slide2.play();
            TranslateTransition slide3 = new TranslateTransition();
            slide3.setDuration(Duration.seconds(0.2));
            slide3.setNode(pane3);
            slide3.setToX(0);
            slide3.play();
            TranslateTransition slide4 = new TranslateTransition();
            slide4.setDuration(Duration.seconds(0.2));
            slide4.setNode(pane4);
            slide4.setToX(0);
            slide4.play();
            TranslateTransition slide5 = new TranslateTransition();
            slide5.setDuration(Duration.seconds(0.2));
            slide5.setNode(pane1);
            slide5.setToX(0);
            slide5.play();
            pane1.setVisible(false);
            pane2.setVisible(false);
            pane3.setVisible(false);
            pane4.setVisible(false);
            pane5.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String Url = "file:/D:/javaFX/Resurs/1987.mp4";
        Media media = new Media(Url);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mv.setFitHeight(700);
        mv.setFitWidth(1200);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        mediaPlayer.setMute(true);
    }
}
