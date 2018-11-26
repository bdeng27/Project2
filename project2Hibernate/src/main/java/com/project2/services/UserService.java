package com.project2.services;

import java.util.List;

import com.project2.Dao.UserDaoImpl;
import com.project2.model.User;

public class UserService {
	public static List<User> getAllUser() {
		return UserDaoImpl.getUserDao().getUsers();
	}
	
	public static User getUserByUserId(int id) {
		return UserDaoImpl.getUserDao().getUserById(id);
	}
	
	public static User getUserByUserEmail(String email) {
		return UserDaoImpl.getUserDao().getUserByEmail(email);
	}
	
	public static int createNewUser(User u) {
		return UserDaoImpl.getUserDao().createUser(u);
	}
	
	public static User updateUserInfo(User u) {
		return UserDaoImpl.getUserDao().updateUser(u);
	}
}