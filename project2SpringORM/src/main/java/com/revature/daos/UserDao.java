package com.revature.daos;

import java.util.List;

import com.revature.models.User;

public interface UserDao {
	public List<User> getUsers();
	public User getUserById(int id);
	public User getUserByEmail(String email);
	public User createUser(User u);
	public User updateUser(User u);
}
