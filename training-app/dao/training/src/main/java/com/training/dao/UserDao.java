package com.training.dao;

import java.util.List;

public interface UserDao {

    //sign up
    public void create(String login, String password, String email);

    //sign in
    public boolean isLoggedIn(String login, String password);

}
