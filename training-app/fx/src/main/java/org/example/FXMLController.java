package org.example;

import java.net.URL;
import java.util.ResourceBundle;

import com.training.dao.UserDao;
import com.training.dao.UserDaoImpl;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class FXMLController implements Initializable {
    UserDao userDao = new UserDaoImpl();
    @FXML
    private MediaView mv;
    @FXML
    private Label label1, label2, label1A, label2A, label1B, label2B, label11, label22, labelLanguage, labelEnglish, labelUkrainian;
    @FXML
    private TextField textFieldLogin1, textFieldLogin2, textFieldEmail;
    @FXML
    private PasswordField textFieldPassword1, textFieldPassword2;
    @FXML
    private ImageView imageUser1, imageKey1, imageClose1, imageUser2, imageEmail, imageKey2, imageClose2;
    @FXML
    private Pane pane, pane1, pane2, pane1A, pane2A, paneLanguage, paneEnglish, paneUkrainian, pn;

    @FXML
    private void entered(MouseEvent event) {
        if (event.getTarget() == pane1) {
            label1.setTextFill(Color.rgb(243, 157, 0));
            label1.setScaleX(1.15);
            label1.setScaleY(1.3);
        }
        if (event.getTarget() == pane2) {
            label2.setTextFill(Color.rgb(243, 157, 0));
            label2.setScaleX(1.15);
            label2.setScaleY(1.4);
        }
        if (event.getTarget() == pane1A) {
            label1A.setTextFill(Color.rgb(243, 157, 0));
            label1A.setScaleX(1.25);
            label1A.setScaleY(1.4);
        }
        if (event.getTarget() == pane2A) {
            label2A.setTextFill(Color.rgb(243, 157, 0));
            label2A.setScaleX(1.15);
            label2A.setScaleY(1.4);
        }
        if (event.getTarget() == imageClose1) {
            imageClose1.setScaleX(1.3);
            imageClose1.setScaleY(1.3);
        }
        if (event.getTarget() == imageClose2) {
            imageClose2.setScaleX(1.3);
            imageClose2.setScaleY(1.3);
        }
    }

    @FXML
    private void exited(MouseEvent event) {
        if (event.getTarget() == pane1) {
            label1.setTextFill(Color.rgb(248, 248, 248));
            label1.setScaleX(1);
            label1.setScaleY(1);
        }
        if (event.getTarget() == pane2) {
            label2.setTextFill(Color.rgb(248, 248, 248));
            label2.setScaleX(1);
            label2.setScaleY(1);
        }
        if (event.getTarget() == pane1A) {
            label1A.setTextFill(Color.rgb(248, 248, 248));
            label1A.setScaleX(1);
            label1A.setScaleY(1);
        }
        if (event.getTarget() == pane2A) {
            label2A.setTextFill(Color.rgb(248, 248, 248));
            label2A.setScaleX(1);
            label2A.setScaleY(1);
        }
        if (event.getTarget() == imageClose1) {
            imageClose1.setScaleX(1);
            imageClose1.setScaleY(1);
        }
        if (event.getTarget() == imageClose2) {
            imageClose2.setScaleX(1);
            imageClose2.setScaleY(1);
        }
    }

    @FXML
    private void click(MouseEvent event) {

        if (event.getTarget() == pane1) {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.3));
            slide.setNode(pane);
            slide.setToX(-640);
            slide.play();
            textFieldLogin1.setVisible(false);
            textFieldPassword1.setVisible(false);
            label1.setVisible(false);
            label1A.setVisible(false);
            imageUser1.setVisible(false);
            imageKey1.setVisible(false);
            imageClose1.setVisible(false);
            pane1.setVisible(false);
            pane1A.setVisible(false);
            textFieldLogin2.setVisible(true);
            textFieldEmail.setVisible(true);
            textFieldPassword2.setVisible(true);
            imageUser2.setVisible(true);
            imageEmail.setVisible(true);
            imageKey2.setVisible(true);
            imageClose2.setVisible(true);
            label2.setVisible(true);
            label2A.setVisible(true);
            pane2.setVisible(true);
            pane2A.setVisible(true);
        }

        if (event.getTarget() == pane2) {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.3));
            slide.setNode(pane);
            slide.setToX(0);
            slide.play();
            textFieldLogin1.setVisible(true);
            textFieldPassword1.setVisible(true);
            label1.setVisible(true);
            label1A.setVisible(true);
            imageUser1.setVisible(true);
            imageKey1.setVisible(true);
            imageClose1.setVisible(true);
            pane1.setVisible(true);
            pane1A.setVisible(true);
            textFieldLogin2.setVisible(false);
            textFieldEmail.setVisible(false);
            textFieldPassword2.setVisible(false);
            imageUser2.setVisible(false);
            imageEmail.setVisible(false);
            imageKey2.setVisible(false);
            imageClose2.setVisible(false);
            label2.setVisible(false);
            label2A.setVisible(false);
            pane2.setVisible(false);
            pane2A.setVisible(false);
        }
        if (event.getTarget() == imageClose1) {
            javafx.application.Platform.exit();
        }
        if (event.getTarget() == imageClose2) {
            javafx.application.Platform.exit();
        }
        if (event.getTarget() == pane2A) {

            try {
                String login = textFieldLogin2.getText();
                String password = textFieldPassword2.getText();
                String email = textFieldEmail.getText();
                userDao.create(login, password, email);
            } catch (Exception ex){
                Helper.showError(ex);
            }
        }
        if (event.getTarget() == pane1A) {
            String login = textFieldLogin1.getText();
            String password = textFieldPassword1.getText();
            boolean isLoggedIn = userDao.isLoggedIn(login, password);
            if(isLoggedIn){
                System.out.println("Login - Success");




            }else{
                System.out.println("Login - Failed");
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String Url = "file:/D:/javaFX/Resurs/video/sport.mp4";
        Media media = new Media(Url);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        mediaPlayer.setMute(true);
    }
}
