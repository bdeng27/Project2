package com.project2.Dao;

import java.util.List;

import com.project2.model.User;

public interface UserDao {
	public List<User> getUsers();
	public User getUserById(int id);
	public User getUserByEmail(String email);
	public int createUser(User u);
	public User updateUser(User u);
}
