package com.training.workoutex.dao;

import java.util.List;

public interface WorkoutExDao {

    public void saveWorkoutExercisesMapping(String userLogin, String training, List<String> selectedExercises);

    public List<String> readWorkoutExercisesMapping(String userLogin, String training);

}
