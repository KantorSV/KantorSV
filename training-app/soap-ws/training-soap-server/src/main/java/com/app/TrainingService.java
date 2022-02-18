package com.app;

import com.training.model.Exercises;
import com.training.model.Workout;

import java.util.List;

public interface TrainingService {

    //sign up
    public void userCreate(String login, String password, String email);

    //sign in
    public boolean userIsLoggedIn(String login, String password);

    public void exerciseCreate(String exerciseTitle, String userLogin);

    public List<Exercises> exerciseReadAllExercisesByUser(String login);

    public void exerciseUpdate(String currentTitle, String login, String newTitle);

    public void exerciseDelete(String title, String login);

    public void workoutCreate(String workTitle, String userLogin);

    public List<Workout> workoutReadAllWorkoutByUser(String login);

    public void workoutUpdate(String currentTitle, String login, String newTitle);

    public void workoutDelete(String title, String login);

    public void workoutExSaveWorkoutExercisesMapping(String userLogin, String training, List<String> selectedExercises);

    public List<String> workoutExReadWorkoutExercisesMapping(String userLogin, String training);

    public void workoutExDeleteWorkoutExercisesMapping(String training, String userLogin);

}
