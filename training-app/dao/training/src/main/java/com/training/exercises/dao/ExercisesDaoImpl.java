package com.training.exercises.dao;

import com.training.dao.Helper;
import com.training.model.Exercises;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExercisesDaoImpl implements ExercisesDao {

    @Override
    public void create(String exerciseTitle, String userLogin) {

        try (Connection c = Helper.getConnection()) {
            PreparedStatement ps = c.prepareStatement("insert into exercises (title, user_id) Values (?, (select id from users where login = ?))");
            ps.setString(1, exerciseTitle);
            ps.setString(2, userLogin);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Exercises> readAllExercisesByUser(String login) {
        try (Connection c = Helper.getConnection()) {
            List<Exercises> list = new ArrayList<>();
            PreparedStatement ps = c.prepareStatement("select * from exercises where user_id = (select id from users where login = ?)");
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String title = rs.getString("title");
                Exercises exercises = new Exercises();
                exercises.setTitle(title);
                list.add(exercises);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(String currentTitle, String login, String newTitle) {

    }

    @Override
    public void delete(String title, String login) {

    }


}
