package com.project2.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.project2.model.BankAccount;
import com.project2.util.HibernateUtil;

public class BankAccountDaoImpl implements BankAccountDao {

	private static BankAccountDaoImpl bankAccountDao;
	
	private BankAccountDaoImpl() {
		
	}
	
	public static BankAccountDaoImpl getBankAccountDao() {
		if(bankAccountDao == null) {
			bankAccountDao = new BankAccountDaoImpl();
		}
		return bankAccountDao;
	}
	
	@Override
	public List<BankAccount> getAccountsByUserId(int userId) {
		Session s = HibernateUtil.getSession();
		List<BankAccount> accounts = new ArrayList<BankAccount>();
		String hql = "from BankAccount where user_id = :idVar";
		Query<BankAccount> q = s.createQuery(hql, BankAccount.class);
		q.setParameter("idVar", userId);
		accounts = q.getResultList();
		return accounts;
	}

	@Override
	public BankAccount getAccountById(int accountId) {
		Session s = HibernateUtil.getSession();
		String hql = "from BankAccount where account_id= :idVar";
		Query<BankAccount> q = s.createQuery(hql, BankAccount.class);
		q.setParameter("idVar", accountId);
		BankAccount account = q.getSingleResult();
		return account;
	}

	@Override
	public int createAccount(BankAccount account) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int accountPK = (int) s.save(account);
		tx.commit();
		s.close();
		return accountPK;
	}

	@Override
	public int removeAccount(BankAccount account) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int accountPK = account.getAccountId();
		s.remove(account);
		tx.commit();
		s.close();
		return accountPK;
	}

}