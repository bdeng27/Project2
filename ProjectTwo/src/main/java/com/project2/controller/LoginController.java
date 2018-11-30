package com.project2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project2.Dao.UserDao;
import com.project2.Dao.UserDaoImpl;
import com.project2.model.User;

@CrossOrigin
@Controller
public class LoginController {
	UserDao ud = UserDaoImpl.getUserDao();
	
	@RequestMapping(value="/performLogin", method = RequestMethod.POST)
	@ResponseBody
	public User login(@RequestBody User returnVal) {
		List<User> userList = ud.getUsers();
		System.out.println(returnVal);
		User login = new User(returnVal.getUsername(), returnVal.getPassword()).validate(userList);
		System.out.println(login);
		return login;
		//User u1 = new User(100, "Ben Deng", "bdeng27@vt.edu", "bdeng27", "password", 0, 60000);
		//return u1;
	}
}
