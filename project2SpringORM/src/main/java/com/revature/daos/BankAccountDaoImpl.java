package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.BankAccount;

@Repository
public class BankAccountDaoImpl implements BankAccountDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<BankAccount> getAccountsByUserId(int userId) {
		Session s = sf.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<BankAccount> accounts = s.createQuery("from BankAccount where user_id= :idVar").setParameter("idVar", userId).list();
		return accounts;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public BankAccount getAccountById(int accountId) {
		Session s = sf.openSession();
		//BankAccount account = (BankAccount) s.createQuery("from BankAccount where account_id= :idVar").setParameter("idVar", accountId);
		BankAccount account = (BankAccount) s.load(BankAccount.class, accountId);
		return account;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public BankAccount createAccount(BankAccount account) {
		Session s = sf.getCurrentSession();
		s.save(account);
		return account;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public BankAccount removeAccount(BankAccount account) {
		Session s = sf.getCurrentSession();
		s.delete(account);
		return account;
	}

}
