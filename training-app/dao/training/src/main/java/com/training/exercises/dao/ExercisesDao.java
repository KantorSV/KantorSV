package com.training.exercises.dao;

import com.training.model.Exercises;

import java.util.List;

public interface ExercisesDao {

    public void create(String exerciseTitle, String userLogin);

    public List<Exercises> readAllExercisesByUser(String login);

    public void update(String currentTitle, String login, String newTitle);

    public void delete(String title, String login);

}
