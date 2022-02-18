package com.app;

import com.training.dao.UserDao;
import com.training.dao.UserDaoImpl;
import com.training.exercises.dao.ExercisesDao;
import com.training.exercises.dao.ExercisesDaoImpl;
import com.training.model.Workout;
import com.training.workout.dao.WorkDaoImpl;
import com.training.workout.dao.WorkOutDao;
import com.training.workoutex.dao.WorkoutExDao;
import com.training.workoutex.dao.WorkoutExtDaoImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoImpl();
        WorkOutDao workOutDao = new WorkDaoImpl();
        WorkoutExDao workoutExDao = new WorkoutExtDaoImpl();
        ExercisesDao exercisesDao = new ExercisesDaoImpl();
        TrainingService trainingService = new TrainingServiceImpl(userDao, exercisesDao, workOutDao, workoutExDao);
        Endpoint.publish("http://127.0.0.1:8087/kantor", trainingService);
        System.out.println("SERVER STARTED");

    }

}
