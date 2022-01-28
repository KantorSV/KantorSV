package org.example;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.training.dao.UserDao;
import com.training.dao.UserDaoImpl;
import com.training.exercises.dao.ExercisesDao;
import com.training.exercises.dao.ExercisesDaoImpl;
import com.training.model.Exercises;
import com.training.model.Workout;
import com.training.workout.dao.WorkDaoImpl;
import com.training.workoutex.dao.WorkoutExDao;
import com.training.workoutex.dao.WorkoutExtDaoImpl;
import javafx.animation.TranslateTransition;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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

    private String currentWorkoutTraining;
    private String userLogin;
    UserDao userDao = new UserDaoImpl();

    @FXML
    private ListView<String> listViewLeft, listViewRight;
    @FXML
    private TableView<Exercises> tableViewExercises;
    @FXML
    private TableView<Workout> tableViewWorkout;
    @FXML
    private TableColumn<Exercises, String> columnExercises;
    @FXML
    private TableColumn<Workout, String> columnWorkout;
    @FXML
    private MediaView mv, mv1;
    @FXML
    private Label label1, label2, label1A, label2A, labelNo, labelYes, labelOk, labelOk2, labelWorkout, labelExercises, labelStatistics, labelSettings,
            labelCreateExercises, labelCreateWorkout, labelRemoveWorkout, labelRemoveExercises, labelUpdateExercises, labelUpdateWorkout, labelDetails,
            labelOne, labelTwo, labelThree, labelFour, labelSave, labelDetailsEx;
    @FXML
    private TextField textFieldLogin1, textFieldLogin2, textFieldEmail, textFieldExercises, textFieldWorkout;
    @FXML
    private PasswordField textFieldPassword1, textFieldPassword2;
    @FXML
    private ImageView imageUser1, imageKey1, imageClose1, imageUser2, imageEmail, imageKey2, imageClose2, imageClose3;
    @FXML
    private Pane pane, pane1, pane2, pane1A, pane2A, paneSecond, paneLogIn, paneRegister, paneNo, paneYes, paneOk, paneLogInFailed, paneOk2,
            paneWorkout, paneExercises, paneStatistics, paneSettings, paneW, paneE, paneSt, paneSet, paneCreateExercises, paneCreateE, paneExercisesUp,
            paneExercisesDown, paneCreateWorkout, paneCreateW, paneWorkoutUp, paneWorkoutDown, paneRemoveExercises, paneRemoveE, paneRemoveWorkout, paneRemoveW,
            paneUpdateWorkout, paneUpdateExercises, paneUpdateW, paneUpdateE, paneDetails, paneD, paneOne, paneO, paneTwo, paneTw, paneThree, paneTh, paneFour,
            paneF, paneSave, paneS, paneWorkoutDetails, paneExercisesDetails, paneDEx;

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
            paneWorkout.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelWorkout.setTextFill(Color.rgb(243, 157, 0));
            labelWorkout.setScaleX(1.25);
            labelWorkout.setScaleY(1.2);
        }
        if (event.getTarget() == paneE) {
            paneExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelExercises.setTextFill(Color.rgb(243, 157, 0));
            labelExercises.setScaleX(1.25);
            labelExercises.setScaleY(1.2);
        }
        if (event.getTarget() == paneSt) {
            paneStatistics.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelStatistics.setTextFill(Color.rgb(243, 157, 0));
            labelStatistics.setScaleX(1.25);
            labelStatistics.setScaleY(1.2);
        }
        if (event.getTarget() == paneSet) {
            paneSettings.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelSettings.setTextFill(Color.rgb(243, 157, 0));
            labelSettings.setScaleX(1.25);
            labelSettings.setScaleY(1.2);
        }
        if (event.getTarget() == paneCreateE) {
            paneCreateExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelCreateExercises.setTextFill(Color.rgb(243, 157, 0));
            labelCreateExercises.setScaleX(1.1);
            labelCreateExercises.setScaleY(1.2);
        }
        if (event.getTarget() == paneCreateW) {
            paneCreateWorkout.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelCreateWorkout.setTextFill(Color.rgb(243, 157, 0));
            labelCreateWorkout.setScaleX(1.1);
            labelCreateWorkout.setScaleY(1.2);
        }
        if (event.getTarget() == paneRemoveE) {
            paneRemoveExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelRemoveExercises.setTextFill(Color.rgb(243, 157, 0));
            labelRemoveExercises.setScaleX(1.1);
            labelRemoveExercises.setScaleY(1.2);
        }
        if (event.getTarget() == paneRemoveW) {
            paneRemoveWorkout.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelRemoveWorkout.setTextFill(Color.rgb(243, 157, 0));
            labelRemoveWorkout.setScaleX(1.1);
            labelRemoveWorkout.setScaleY(1.2);
        }
        if (event.getTarget() == paneUpdateE) {
            paneUpdateExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelUpdateExercises.setTextFill(Color.rgb(243, 157, 0));
            labelUpdateExercises.setScaleX(1.1);
            labelUpdateExercises.setScaleY(1.2);
        }
        if (event.getTarget() == paneUpdateW) {
            paneUpdateWorkout.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelUpdateWorkout.setTextFill(Color.rgb(243, 157, 0));
            labelUpdateWorkout.setScaleX(1.1);
            labelUpdateWorkout.setScaleY(1.2);
        }
        else if (event.getTarget() == paneD) {
            paneDetails.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelDetails.setTextFill(Color.rgb(243, 157, 0));
            labelDetails.setScaleX(1.2);
            labelDetails.setScaleY(1.3);
        }
        else if (event.getTarget() == paneO) {
            paneOne.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelOne.setTextFill(Color.rgb(243, 157, 0));
            labelOne.setScaleX(1.4);
            labelOne.setScaleY(1.5);
        }
        else if (event.getTarget() == paneTw) {
            paneTwo.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelTwo.setTextFill(Color.rgb(243, 157, 0));
            labelTwo.setScaleX(1.4);
            labelTwo.setScaleY(1.5);
        }
        else if (event.getTarget() == paneTh) {
            paneThree.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelThree.setTextFill(Color.rgb(243, 157, 0));
            labelThree.setScaleX(1.4);
            labelThree.setScaleY(1.5);
        }
        else if (event.getTarget() == paneF) {
            paneFour.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelFour.setTextFill(Color.rgb(243, 157, 0));
            labelFour.setScaleX(1.4);
            labelFour.setScaleY(1.5);
        }
        else if (event.getTarget() == paneS) {
            paneSave.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelSave.setTextFill(Color.rgb(243, 157, 0));
            labelSave.setScaleX(1.4);
            labelSave.setScaleY(1.5);
        }
        else if (event.getTarget() == paneDEx) {
            paneExercisesDetails.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(255, 255, 255), 14.5, 0.15, 0, 0));
            labelDetailsEx.setTextFill(Color.rgb(243, 157, 0));
            labelDetailsEx.setScaleX(1.2);
            labelDetails.setScaleY(1.3);
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
            paneWorkout.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelWorkout.setTextFill(Color.rgb(248, 248, 248));
            labelWorkout.setScaleX(1);
            labelWorkout.setScaleY(1);
        }
        if (event.getTarget() == paneE) {
            paneExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelExercises.setTextFill(Color.rgb(248, 248, 248));
            labelExercises.setScaleX(1);
            labelExercises.setScaleY(1);
        }
        if (event.getTarget() == paneSt) {
            paneStatistics.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelStatistics.setTextFill(Color.rgb(248, 248, 248));
            labelStatistics.setScaleX(1);
            labelStatistics.setScaleY(1);
        }
        if (event.getTarget() == paneSet) {
            paneSettings.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelSettings.setTextFill(Color.rgb(248, 248, 248));
            labelSettings.setScaleX(1);
            labelSettings.setScaleY(1);
        }
        if (event.getTarget() == paneCreateE) {
            paneCreateExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelCreateExercises.setTextFill(Color.rgb(248, 248, 248));
            labelCreateExercises.setScaleX(1);
            labelCreateExercises.setScaleY(1);
        }
        if (event.getTarget() == paneCreateW) {
            paneCreateWorkout.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelCreateWorkout.setTextFill(Color.rgb(248, 248, 248));
            labelCreateWorkout.setScaleX(1);
            labelCreateWorkout.setScaleY(1);
        }
        if (event.getTarget() == paneRemoveE) {
            paneRemoveExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelRemoveExercises.setTextFill(Color.rgb(248, 248, 248));
            labelRemoveExercises.setScaleX(1);
            labelRemoveExercises.setScaleY(1);
        }
        if (event.getTarget() == paneRemoveW) {
            paneRemoveWorkout.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelRemoveWorkout.setTextFill(Color.rgb(248, 248, 248));
            labelRemoveWorkout.setScaleX(1);
            labelRemoveWorkout.setScaleY(1);
        }
        if (event.getTarget() == paneUpdateE) {
            paneUpdateExercises.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelUpdateExercises.setTextFill(Color.rgb(248, 248, 248));
            labelUpdateExercises.setScaleX(1);
            labelUpdateExercises.setScaleY(1);
        }
        if (event.getTarget() == paneUpdateW) {
            paneUpdateWorkout.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelUpdateWorkout.setTextFill(Color.rgb(248, 248, 248));
            labelUpdateWorkout.setScaleX(1);
            labelUpdateWorkout.setScaleY(1);
        }
        else if (event.getTarget() == paneD) {
            paneDetails.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelDetails.setTextFill(Color.rgb(248, 248, 248));
            labelDetails.setScaleX(1);
            labelDetails.setScaleY(1);
        }
        else if (event.getTarget() == paneO) {
            paneOne.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelOne.setTextFill(Color.rgb(248, 248, 248));
            labelOne.setScaleX(1);
            labelOne.setScaleY(1);
        }
        else if (event.getTarget() == paneTw) {
            paneTwo.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelTwo.setTextFill(Color.rgb(248, 248, 248));
            labelTwo.setScaleX(1);
            labelTwo.setScaleY(1);
        }
        else if (event.getTarget() == paneTh) {
            paneThree.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelThree.setTextFill(Color.rgb(248, 248, 248));
            labelThree.setScaleX(1);
            labelThree.setScaleY(1);
        }
        else if (event.getTarget() == paneF) {
            paneFour.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 0, 0), 14.5, 0.15, 0, 0));
            labelFour.setTextFill(Color.rgb(248, 248, 248));
            labelFour.setScaleX(1);
            labelFour.setScaleY(1);
        }
        else if (event.getTarget() == paneS) {
            paneSave.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 2, 0), 14.5, 0.15, 0, 0));
            labelSave.setTextFill(Color.rgb(248, 248, 248));
            labelSave.setScaleX(1);
            labelSave.setScaleY(1);
        }
        else if (event.getTarget() == paneDEx) {
            paneExercisesDetails.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.rgb(0, 2, 0), 14.5, 0.15, 0, 0));
            labelDetailsEx.setTextFill(Color.rgb(248, 248, 248));
            labelDetailsEx.setScaleX(1);
            labelDetailsEx.setScaleY(1);
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
        } else if (event.getTarget() == pane2) {
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
        } else if (event.getTarget() == imageClose1) {
            javafx.application.Platform.exit();
        } else if (event.getTarget() == imageClose2) {
            javafx.application.Platform.exit();
        } else if (event.getTarget() == imageClose3) {
            javafx.application.Platform.exit();
        } else if (event.getTarget() == pane2A) {

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

        } else if (event.getTarget() == pane1A) {
            String login = textFieldLogin1.getText();
            String password = textFieldPassword1.getText();
            boolean isLoggedIn = userDao.isLoggedIn(login, password);
            if (isLoggedIn) {
                userLogin = login;
                System.out.println("Login - Success");
                initExercisesTable();
                initWorkOutTable();
                paneSecond.setVisible(true);
                paneLogIn.setVisible(true);
            } else {
                System.out.println("Login - Failed");
                paneLogInFailed.setVisible(true);
            }
        } else if (event.getTarget() == paneNo) {
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
        } else if (event.getTarget() == paneYes) {
            paneSecond.setVisible(true);
        } else if (event.getTarget() == paneOk) {
            paneLogIn.setVisible(false);
        } else if (event.getTarget() == paneOk2) {
            paneLogInFailed.setVisible(false);
        } else if (event.getTarget() == paneE) {
            paneExercisesUp.setVisible(true);
            paneExercisesDown.setVisible(true);
            paneWorkoutUp.setVisible(false);
            paneWorkoutDown.setVisible(false);
            paneWorkoutDetails.setVisible(false);
            paneExercisesDetails.setVisible(false);
        } else if (event.getTarget() == paneW) {
            paneExercisesUp.setVisible(false);
            paneExercisesDown.setVisible(false);
            paneWorkoutDetails.setVisible(false);
            paneExercisesDetails.setVisible(false);
            paneWorkoutUp.setVisible(true);
            paneWorkoutDown.setVisible(true);
        } else if (event.getTarget() == paneD) {
            paneExercisesDetails.setVisible(false);
            paneWorkoutUp.setVisible(false);
            paneWorkoutDown.setVisible(false);
            paneExercisesUp.setVisible(false);
            paneExercisesDown.setVisible(false);
            paneWorkoutDetails.setVisible(true);
            listViewRight.getItems().clear();
            listViewLeft.getItems().clear();
            int selectedWorkout = tableViewWorkout.getSelectionModel().getSelectedIndex();
            if(selectedWorkout!=-1) {
                Workout workout = tableViewWorkout.getItems().get(selectedWorkout);
                currentWorkoutTraining = workout.getTraining();

                WorkoutExDao workoutExDao = new WorkoutExtDaoImpl();
                List<String> selectedExercises = workoutExDao.readWorkoutExercisesMapping(userLogin, currentWorkoutTraining);
                listViewRight.getItems().addAll(selectedExercises);


                ExercisesDao exercisesDao = new ExercisesDaoImpl();
                List<Exercises> allExercises = exercisesDao.readAllExercisesByUser(userLogin);
                for (int i = 0; i < allExercises.size(); i++) {
                    Exercises exercises = allExercises.get(i);
                    listViewLeft.getItems().add(exercises.getTitle());
                }
                listViewLeft.getItems().removeAll(selectedExercises);
            }
        }
        else if (event.getTarget() == paneDEx) {
            paneWorkoutUp.setVisible(false);
            paneWorkoutDown.setVisible(false);
            paneExercisesUp.setVisible(false);
            paneExercisesDown.setVisible(false);
            paneWorkoutDetails.setVisible(false);
            paneExercisesDetails.setVisible(true);
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

        columnExercises.setCellValueFactory(new PropertyValueFactory<Exercises, String>("title"));
        columnWorkout.setCellValueFactory(new PropertyValueFactory<Workout, String>("training"));
    }

    private String getRelativePath(String path) {
        String sportUrl = null;
        try {
            sportUrl = getClass().getResource("/video/sport.mp4").toURI().toString();
            return sportUrl;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }


    @FXML
    private void exerciseCreateClick(MouseEvent event) {
        System.out.println("Click!!!");
        ExercisesDaoImpl exercisesDao = new ExercisesDaoImpl();
        String exercisesTitle = textFieldExercises.getText();
        exercisesDao.create(exercisesTitle, userLogin);
        Exercises exercise = new Exercises();
        exercise.setTitle(exercisesTitle);
        tableViewExercises.getItems().add(exercise);

        textFieldExercises.setText("");
    }

    @FXML
    private void workOutCreateClick(MouseEvent event) {
        System.out.println("Click!!!");
        WorkDaoImpl workDao = new WorkDaoImpl();
        String exercisesTitle = textFieldWorkout.getText();
        workDao.create(exercisesTitle, userLogin);
        Workout workout = new Workout();
        workout.setTraining(exercisesTitle);
        tableViewWorkout.getItems().add(workout);

        textFieldWorkout.setText("");
    }

    private void initExercisesTable() {
        ExercisesDaoImpl exercisesDao = new ExercisesDaoImpl();
        List<Exercises> exercisesList = exercisesDao.readAllExercisesByUser(userLogin);
        for (int i = 0; i < exercisesList.size(); i++) {
            Exercises exercisesItem = exercisesList.get(i);
            String title = exercisesItem.getTitle();
            System.out.println("title=" + title);
            tableViewExercises.getItems().add(exercisesItem);
        }
        initExerciseTableListener();
    }

    @FXML
    private void initExercisesList() {
        ExercisesDaoImpl exercisesDao = new ExercisesDaoImpl();
        List<Exercises> exercisesList = exercisesDao.readAllExercisesByUser(userLogin);
        for (int i = 0; i < exercisesList.size(); i++) {
            Exercises exercisesItem = exercisesList.get(i);
            String title = exercisesItem.getTitle();
            System.out.println("title=" + title);
            listViewLeft.getItems().add(title);
        }
    }

    private void initWorkOutTable() {
        WorkDaoImpl workDao = new WorkDaoImpl();
        List<Workout> workoutList = workDao.readAllWorkoutByUser(userLogin);
        for (int i = 0;i < workoutList.size();i++) {
            Workout workoutItem = workoutList.get(i);
            String training = workoutItem.getTraining();
            System.out.println("training = " + training);
            tableViewWorkout.getItems().add(workoutItem);
        }
        initWorkOutTableListener();
    }

    private void initExerciseTableListener() {
        tableViewExercises.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int selectedIndex = tableViewExercises.getSelectionModel().getSelectedIndex();
                if(selectedIndex!=-1) {
                    Exercises exercises = tableViewExercises.getItems().get(selectedIndex);
                    System.out.println("selectedIndex = " + selectedIndex);
                    textFieldExercises.setText(exercises.getTitle());
                }
            }
        });
    }

    private void initWorkOutTableListener() {
        tableViewWorkout.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int selectedIndex = tableViewWorkout.getSelectionModel().getSelectedIndex();
                if(selectedIndex!=-1) {
                    Workout workout = tableViewWorkout.getItems().get(selectedIndex);
                    System.out.println("selectedIndex = " + selectedIndex);
                    textFieldWorkout.setText(workout.getTraining());
                }
            }
        });
    }

    @FXML
    private void remove(MouseEvent event) {

        if (event.getTarget() == paneRemoveE) {

            int selectedId = tableViewExercises.getSelectionModel().getSelectedIndex();
            List<Exercises> allExercises = tableViewExercises.getItems();

            Exercises selectedExercise = allExercises.get(selectedId);
            ExercisesDaoImpl exercisesDao = new ExercisesDaoImpl();
            exercisesDao.delete(selectedExercise.getTitle(), userLogin);

            allExercises.remove(selectedId);
        } else if (event.getTarget() == paneRemoveW) {

            int selectedId = tableViewWorkout.getSelectionModel().getSelectedIndex();
            List<Workout> allWorkouts = tableViewWorkout.getItems();

            Workout selectWorkout = allWorkouts.get(selectedId);
            WorkDaoImpl workDao = new WorkDaoImpl();
            workDao.delete(selectWorkout.getTraining(), userLogin);

            allWorkouts.remove(selectedId);
        }
    }

    @FXML
    private void updateExercises(MouseEvent event) {

        String updateTitle = textFieldExercises.getText();

        int selectedIndex = tableViewExercises.getSelectionModel().getSelectedIndex();
        if (selectedIndex!=-1) {

            Exercises exercises = tableViewExercises.getSelectionModel().getSelectedItem();
            String currentTitle =  exercises.getTitle();

            ExercisesDaoImpl exercisesDao = new ExercisesDaoImpl();
            exercisesDao.update(currentTitle, userLogin, updateTitle);

            exercises.setTitle(updateTitle);
            tableViewExercises.refresh();
        }
    }

    @FXML
    private void updateWorkout(MouseEvent event) {
        System.out.println("updateWorkout###############################");
        String updateTraining = textFieldWorkout.getText();

        int selectedIndex = tableViewWorkout.getSelectionModel().getSelectedIndex();
        if(selectedIndex!=-1){

            Workout workout = tableViewWorkout.getItems().get(selectedIndex);
            String currentTraining = workout.getTraining();

            WorkDaoImpl workDao = new WorkDaoImpl();
            workDao.update(currentTraining, userLogin, updateTraining);

            workout.setTraining(updateTraining);
            tableViewWorkout.refresh();
        }

    }

    @FXML
    private void chooseAllExercisesForWorkout() {

        List allExercises = listViewLeft.getItems();
        listViewRight.getItems().addAll(allExercises);
        listViewLeft.getItems().clear();
    }

    @FXML
    private void unChooseAllExercisesForWorkout() {

        List allExercises = listViewRight.getItems();
        listViewLeft.getItems().addAll(allExercises);
        listViewRight.getItems().clear();
    }

    @FXML
    private void chooseSingleExercisesForWorkout() {

        int selectedIndex = listViewLeft.getSelectionModel().getSelectedIndex();
        if(selectedIndex!=-1) {
            String selectedExercisesTitle = listViewLeft.getItems().get(selectedIndex);
            listViewRight.getItems().add(selectedExercisesTitle);
            listViewLeft.getItems().remove(selectedIndex);
        }

    }

    @FXML
    private void unChooseSingleExercisesForWorkout() {

        int selectedIndex = listViewRight.getSelectionModel().getSelectedIndex();
        if (selectedIndex!=-1) {
            String selectedExercisesTitle = listViewRight.getItems().get(selectedIndex);
            listViewLeft.getItems().add(selectedExercisesTitle);
            listViewRight.getItems().remove(selectedIndex);
        }
    }

    @FXML
    private void saveExercisesForWorkout() {

        WorkoutExDao workoutExDao = new WorkoutExtDaoImpl();
        workoutExDao.deleteWorkoutExercisesMapping(currentWorkoutTraining, userLogin);


        List<String> selectedExercises =  listViewRight.getItems();

        workoutExDao.saveWorkoutExercisesMapping(userLogin, currentWorkoutTraining, selectedExercises);

    }


}