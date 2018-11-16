package com.project2.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.project2.model.User;
import com.project2.util.HibernateUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> getUsers() {
		Session s = HibernateUtil.getSession();
		List<User> users = s.createQuery("from User_Table", User.class).list();
		s.close();
		return users;
	}

	@Override
	public User getUserById(int id) {
		Session s = HibernateUtil.getSession();
		String hql = "from Bear where id = :idVar";
		Query<User> q = s.createQuery(hql, User.class);
		q.setParameter("idVar", id);
		User user = q.getSingleResult();
		return user;
	}

	@Override
	public User getUserByEmail(String email) {
		Session s = HibernateUtil.getSession();
		String hql = "from Bear where email = :emailVar";
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

}
