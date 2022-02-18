package com.app;

import com.training.dao.UserDao;
import com.training.exercises.dao.ExercisesDao;
import com.training.model.Exercises;
import com.training.model.Workout;
import com.training.workout.dao.WorkOutDao;
import com.training.workoutex.dao.WorkoutExDao;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class TrainingServiceImpl implements TrainingService{

    private UserDao userDao;
    private ExercisesDao exercisesDao;
    private WorkOutDao workOutDao;
    private WorkoutExDao workoutExDao;

    public  TrainingServiceImpl(UserDao userDao, ExercisesDao exercisesDao, WorkOutDao workOutDao, WorkoutExDao workoutExDao) {
        this.userDao = userDao;
        this.exercisesDao = exercisesDao;
        this.workOutDao = workOutDao;
        this.workoutExDao = workoutExDao;
    }

    @WebMethod
    @Override
    public void userCreate(String login, String password, String email) {
        userDao.create(login, password, email);
    }

    @WebMethod
    @Override
    public boolean userIsLoggedIn(String login, String password) {
       return userDao.isLoggedIn(login, password);
    }

    @WebMethod
    @Override
    public void exerciseCreate(String exerciseTitle, String userLogin) {
        exercisesDao.create(exerciseTitle, userLogin);
    }

    @WebMethod
    @Override
    public List<Exercises> exerciseReadAllExercisesByUser(String login) {
        return exercisesDao.readAllExercisesByUser(login);
    }

    @WebMethod
    @Override
    public void exerciseUpdate(String currentTitle, String login, String newTitle) {
        exercisesDao.update(currentTitle, login, newTitle);
    }

    @WebMethod
    @Override
    public void exerciseDelete(String title, String login) {
        exercisesDao.delete(title, login);
    }

    @WebMethod
    @Override
    public void workoutCreate(String workTitle, String userLogin) {
        workOutDao.create(workTitle, userLogin);
    }

    @WebMethod
    @Override
    public List<Workout> workoutReadAllWorkoutByUser(String login) {
        return workOutDao.readAllWorkoutByUser(login);
    }

    @WebMethod
    @Override
    public void workoutUpdate(String currentTitle, String login, String newTitle) {
        workOutDao.update(currentTitle, login, newTitle);
    }

    @WebMethod
    @Override
    public void workoutDelete(String title, String login) {
        workOutDao.delete(title, login);
    }

    @WebMethod
    @Override
    public void workoutExSaveWorkoutExercisesMapping(String userLogin, String training, List<String> selectedExercises) {
        workoutExDao.saveWorkoutExercisesMapping(userLogin, training, selectedExercises);
    }

    @WebMethod
    @Override
    public List<String> workoutExReadWorkoutExercisesMapping(String userLogin, String training) {
        return workoutExDao.readWorkoutExercisesMapping(userLogin, training);
    }

    @WebMethod
    @Override
    public void workoutExDeleteWorkoutExercisesMapping(String training, String userLogin) {
        workoutExDao.deleteWorkoutExercisesMapping(training, userLogin);
    }
}
