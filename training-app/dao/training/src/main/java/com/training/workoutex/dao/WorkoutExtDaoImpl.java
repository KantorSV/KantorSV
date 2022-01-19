package com.training.workoutex.dao;

import com.training.dao.Helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class WorkoutExtDaoImpl implements WorkoutExDao {

    @Override
    public void saveWorkoutExercisesMapping(String userLogin, String training, List<String> selectedExercises) {
        try (Connection c = Helper.getConnection()){
            String sql = "insert into workout_exercises (workout_id, exercises_id) " +
                    "values( (SELECT id FROM training.workout where user_id=(select id from users where login=?) and training =?) " +
                    " , (select id from exercises where user_id=(select id from users where login=?) and title=?) )";
            System.out.println(sql);
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, userLogin);
            ps.setString(2, training);
            ps.setString(3, userLogin);

            /*for(String selectedExerciseTitle: selectedExercises){
                ps.setString(4, selectedExerciseTitle);
                ps.execute();
            }*/

            for(int i=0;i<selectedExercises.size();i++){
                String selectedExerciseTitle = selectedExercises.get(i);
                ps.setString(4, selectedExerciseTitle);
                ps.execute();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> readWorkoutExercisesMapping(String userLogin, String training) {
        try (Connection c = Helper.getConnection()){
            String sql = "select title from exercises where id in ( " +
                    " select exercises_id from workout_exercises where workout_id = "+
                    " (SELECT id FROM training.workout where user_id=(select id from users where login=?) and training =?) " +
                    ")";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, userLogin);
            ps.setString(2, training);
            ResultSet rs = ps.executeQuery();
            List<String> selectedTitles = new ArrayList<>();
            while(rs.next()){
                String title = rs.getString("title");
                selectedTitles.add(title);
            }
            return selectedTitles;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteWorkoutExercisesMapping(String training, String userLogin) {

        try (Connection c = Helper.getConnection()){
            String sql = "delete from workout_exercises where workout_id = "+
                    "(select id from workout where training = ? and user_id = (select id from users where login = ?))";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, training);
            ps.setString(2, userLogin);
            ps.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WorkoutExtDaoImpl dao = new WorkoutExtDaoImpl();
        List<String> res = dao.readWorkoutExercisesMapping("denys", "Friday");
        System.out.println(res);
    }
}
