package com.revature.daos;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sf;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<User> getUsers() {
		Session s = sf.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<User> users = s.createQuery("from User").list();
		return users;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public User getUserById(int id) {
		Session s = sf.openSession();
		User user = (User) s.load(User.class, id);
		return user;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public User getUserByEmail(String email) {
		Session s = sf.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<User> users = s.createQuery("from User where email = :emailVar").setParameter("emailVar", email).list();
		//User user = (User) s.createQuery("from User where email = :emailVar").setParameter("emailVar", email);
		return users.get(0);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public User createUser(User u) {
		Session s = sf.getCurrentSession();
		s.save(u);
		return u;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public User updateUser(User u) {
		Session s = sf.getCurrentSession();
		s.update(u);
		return u;
	}
	
}
