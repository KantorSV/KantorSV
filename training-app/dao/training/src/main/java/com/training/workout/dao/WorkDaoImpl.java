package com.training.workout.dao;
import com.training.dao.Helper;
import com.training.model.Workout;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class WorkDaoImpl implements WorkOutDao {


    @Override
    public void create(String workTitle, String userLogin) {
        try (Connection c = Helper.getConnection()){
            PreparedStatement ps = c.prepareStatement("insert into workout(training, user_id) Value (?, (select id from users where login = ?))");
            ps.setString(1, workTitle);
            ps.setString(2, userLogin);
            ps.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Workout> readAllExercisesByUser(String login) {
        try (Connection c = Helper.getConnection()){
            List<Workout> list = new ArrayList<>();
            PreparedStatement ps = c.prepareStatement("select from workout where user_id = (select id from users where login = ?)");
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String training = rs.getString("training");
                Workout workout = new Workout();
                workout.setTraining(training);
                list.add(workout);
            }
            return list;
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(String currentTitle, String login, String newTitle) {
        try (Connection c = Helper.getConnection()){
            PreparedStatement ps = c.prepareStatement("update workout set treining = ? where treining = ? and user_id = " +
                    "(select id from users where login = ?) ");
            ps.setString(1, newTitle);
            ps.setString(2, currentTitle);
            ps.setString(3, login);
            ps.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String title, String login) {
        try (Connection c = Helper.getConnection()){
            PreparedStatement ps = c.prepareStatement("delete from workout where treining = ? and user_id = (select id from users where login = ? )");
            ps.setString(1, title);
            ps.setString(2, login);
            ps.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
