package org.example;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.training.dao.UserDao;
import com.training.dao.UserDaoImpl;
import com.training.exercises.dao.ExercisesDao;
import com.training.exercises.dao.ExercisesDaoImpl;
import com.training.model.Exercises;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.InnerShadow;
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
    private String userLogin;
    UserDao userDao = new UserDaoImpl();
    @FXML
    private MediaView mv, mv1;
    @FXML
    private Label label1, label2, label1A, label2A, labelNo, labelYes, labelOk, labelOk2, labelWorkout, labelExercises, labelStatistics, labelSettings,
            labelCreateExercises;
    @FXML
    private TextField textFieldLogin1, textFieldLogin2, textFieldEmail, textFieldExercises;
    @FXML
    private PasswordField textFieldPassword1, textFieldPassword2;
    @FXML
    private ImageView imageUser1, imageKey1, imageClose1, imageUser2, imageEmail, imageKey2, imageClose2, imageClose3;
    @FXML
    private Pane pane, pane1, pane2, pane1A, pane2A, paneSecond, paneLogIn, paneRegister, paneNo, paneYes, paneOk, paneLogInFailed, paneOk2,
            paneWorkout, paneExercises, paneStatistics, paneSettings, paneW, paneE, paneSt, paneSet, paneCreateExercises, paneCreateE, paneExercisesUp,
            paneExercisesDown;
    @FXML
    private TableView<Exercises> tableView;

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
        if (event.getTarget() == imageClose3) {
            imageClose3.setScaleX(1.3);
            imageClose3.setScaleY(1.3);
        }
        if (event.getTarget() == paneNo) {
            labelNo.setTextFill(Color.rgb(248, 248, 248));
            labelNo.setScaleX(1.5);
            labelNo.setScaleY(1.4);
        }
        if (event.getTarget() == paneYes) {
            labelYes.setTextFill(Color.rgb(248, 248, 248));
            labelYes.setScaleX(1.5);
            labelYes.setScaleY(1.4);
        }
        if (event.getTarget() == paneOk) {
            labelOk.setTextFill(Color.rgb(248, 248, 248));
            labelOk.setScaleX(1.5);
            labelOk.setScaleY(1.4);
        }
        if (event.getTarget() == paneOk2) {
            labelOk2.setTextFill(Color.rgb(248, 248, 248));
            labelOk2.setScaleX(1.5);
            labelOk2.setScaleY(1.4);
        }
        if (event.getTarget() == paneW) {
            paneWorkout.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255,255,255),14.5,0.15,0,0));
            labelWorkout.setTextFill(Color.rgb(243, 157, 0));
            labelWorkout.setScaleX(1.25);
            labelWorkout.setScaleY(1.2);
        }
        if (event.getTarget() == paneE) {
            paneExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255,255,255),14.5,0.15,0,0));
            labelExercises.setTextFill(Color.rgb(243, 157, 0));
            labelExercises.setScaleX(1.25);
            labelExercises.setScaleY(1.2);
        }
        if (event.getTarget() == paneSt) {
            paneStatistics.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255,255,255),14.5,0.15,0,0));
            labelStatistics.setTextFill(Color.rgb(243, 157, 0));
            labelStatistics.setScaleX(1.25);
            labelStatistics.setScaleY(1.2);
        }
        if (event.getTarget() == paneSet) {
            paneSettings.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255,255,255),14.5,0.15,0,0));
            labelSettings.setTextFill(Color.rgb(243, 157, 0));
            labelSettings.setScaleX(1.25);
            labelSettings.setScaleY(1.2);
        }
        if (event.getTarget() == paneCreateE) {
            paneCreateExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255,255,255),14.5,0.15,0,0));
            labelCreateExercises.setTextFill(Color.rgb(243, 157, 0));
            labelCreateExercises.setScaleX(1.1);
            labelCreateExercises.setScaleY(1.2);
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
        if (event.getTarget() == paneNo) {
            labelNo.setTextFill(Color.rgb(248, 248, 248));
            labelNo.setScaleX(1);
            labelNo.setScaleY(1);
        }
        if (event.getTarget() == paneYes) {
            labelYes.setTextFill(Color.rgb(248, 248, 248));
            labelYes.setScaleX(1);
            labelYes.setScaleY(1);
        }
        if (event.getTarget() == paneOk) {
            labelOk.setTextFill(Color.rgb(248, 248, 248));
            labelOk.setScaleX(1);
            labelOk.setScaleY(1);
        }
        if (event.getTarget() == paneOk2) {
            labelOk2.setTextFill(Color.rgb(248, 248, 248));
            labelOk2.setScaleX(1);
            labelOk2.setScaleY(1);
        }
        if (event.getTarget() == imageClose1) {
            imageClose1.setScaleX(1);
            imageClose1.setScaleY(1);
        }
        if (event.getTarget() == imageClose2) {
            imageClose2.setScaleX(1);
            imageClose2.setScaleY(1);
        }
        if (event.getTarget() == imageClose3) {
            imageClose3.setScaleX(1);
            imageClose3.setScaleY(1);
        }
        if (event.getTarget() == paneW) {
            paneWorkout.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0,0,0),14.5,0.15,0,0));
            labelWorkout.setTextFill(Color.rgb(248, 248, 248));
            labelWorkout.setScaleX(1);
            labelWorkout.setScaleY(1);
        }
        if (event.getTarget() == paneE) {
            paneExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0,0,0),14.5,0.15,0,0));
            labelExercises.setTextFill(Color.rgb(248, 248, 248));
            labelExercises.setScaleX(1);
            labelExercises.setScaleY(1);
        }
        if (event.getTarget() == paneSt) {
            paneStatistics.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0,0,0),14.5,0.15,0,0));
            labelStatistics.setTextFill(Color.rgb(248, 248, 248));
            labelStatistics.setScaleX(1);
            labelStatistics.setScaleY(1);
        }
        if (event.getTarget() == paneSet) {
            paneSettings.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0,0,0),14.5,0.15,0,0));
            labelSettings.setTextFill(Color.rgb(248, 248, 248));
            labelSettings.setScaleX(1);
            labelSettings.setScaleY(1);
        }
        if (event.getTarget() == paneCreateE) {
            paneCreateExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0,0,0),14.5,0.15,0,0));
            labelCreateExercises.setTextFill(Color.rgb(248, 248, 248));
            labelCreateExercises.setScaleX(1);
            labelCreateExercises.setScaleY(1);
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
        if (event.getTarget() == imageClose3) {
            javafx.application.Platform.exit();
        }
        if (event.getTarget() == pane2A) {

            try {
                paneRegister.setVisible(true);
                String login = textFieldLogin2.getText();
                String password = textFieldPassword2.getText();
                String email = textFieldEmail.getText();
                userDao.create(login, password, email);
            } catch (Exception ex) {
                paneRegister.setVisible(false);
                Helper.showError(ex);
            }

        }
        if (event.getTarget() == pane1A) {
            String login = textFieldLogin1.getText();
            String password = textFieldPassword1.getText();
            boolean isLoggedIn = userDao.isLoggedIn(login, password);
            if (isLoggedIn) {
                userLogin = login;
                System.out.println("Login - Success");
                paneSecond.setVisible(true);
                paneLogIn.setVisible(true);
            } else {
                System.out.println("Login - Failed");
                paneLogInFailed.setVisible(true);
            }
        }
        if (event.getTarget() == paneNo) {
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
            paneRegister.setVisible(false);
        }
        if (event.getTarget() == paneYes) {
            paneSecond.setVisible(true);
        }
        if (event.getTarget() == paneOk) {
            paneLogIn.setVisible(false);
        }
        if (event.getTarget() == paneOk2) {
            paneLogInFailed.setVisible(false);
        }
        if (event.getTarget() == paneE) {
            paneExercisesUp.setVisible(true);
            paneExercisesDown.setVisible(true);
        }
        if (event.getTarget() == paneCreateE) {
            ExercisesDaoImpl exercisesDao = new ExercisesDaoImpl();
            String exercisesTitle = textFieldExercises.getText();
            exercisesDao.create(exercisesTitle, userLogin);
            textFieldExercises.setText("");
            List<Exercises> exercisesList = exercisesDao.readAllExercisesByUser(userLogin);

            TableColumn<String, Exercises> exerciseTitleColumn = new TableColumn<>("Exercise Title");
            /*exerciseTitleColumn.setCellValueFactory(cellData -> {
                //Integer rowIndex = cellData.getValue();
                return cellData.;
            });*/

            tableView.getColumns().clear();
            //tableView.getColumns().add(exerciseTitleColumn);

            for(int i=0;i<exercisesList.size();i++){
                 Exercises exercisesItem = exercisesList.get(i);
                 String title = exercisesItem.getTitle();
                 tableView.getItems().add(exercisesItem);
            }


        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String sportUrl = getRelativePath("/video/sport.mp4");
        Media media = new Media(sportUrl);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        mediaPlayer.setMute(true);

        //String sportUrl1 = getRelativePath("/video/sport.mp4");
        Media media1 = new Media(sportUrl);
        MediaPlayer mediaPlayer1 = new MediaPlayer(media1);
        mv1.setMediaPlayer(mediaPlayer1);
        mediaPlayer1.play();
        mediaPlayer1.setMute(true);
    }

    private String getRelativePath(String path){
        String sportUrl = null;
        try{
            sportUrl = getClass().getResource("/video/sport.mp4").toURI().toString();
            return sportUrl;
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}