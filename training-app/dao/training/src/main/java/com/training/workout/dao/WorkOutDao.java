package com.training.workout.dao;

import java.util.List;
import com.training.model.Workout;

public interface WorkOutDao {

    public void create(String workTitle, String userLogin);

    public List<Workout> readAllExercisesByUser(String login);

    public void update(String currentTitle, String login, String newTitle);

    public void delete(String title, String login);


}
