package com.project2.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.project2.model.User;
import com.project2.util.HibernateUtil;

public class UserDaoImpl implements UserDao {

	private static UserDaoImpl userDao;
	
	public UserDaoImpl() {

	}
	
	public static UserDaoImpl getUserDao() {
		if(userDao == null) {
			userDao = new UserDaoImpl();
		}
		return userDao;
	}
	
	@Override
	public List<User> getUsers() {
		Session s = HibernateUtil.getSession();
		List<User> users = s.createQuery("from User", User.class).list();
		s.close();
		return users;
	}

	@Override
	public User getUserById(int id) {
		Session s = HibernateUtil.getSession();
		String hql = "from User where user_id = :idVar";
		Query<User> q = s.createQuery(hql, User.class);
		q.setParameter("idVar", id);
		User user = q.getSingleResult();
		return user;
	}

	@Override
	public User getUserByEmail(String email) {
		Session s = HibernateUtil.getSession();
		String hql = "from User where email = :emailVar";
		Query<User> q = s.createQuery(hql, User.class);
		q.setParameter("emailVar", email);
		User user = q.getSingleResult();
		return user;
	}

	@Override
	public int createUser(User u) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int userId = (int) s.save(u);
		tx.commit();
		s.close();
		return userId;
	}

	@Override
	public User updateUser(User u) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(u);
		tx.commit();
		s.close();
		return u;
	}

}