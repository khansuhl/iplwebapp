package org.bridgelabz.iplwebapp.dao.impl;

import org.bridgelabz.iplwebapp.dao.UserDao;
import org.bridgelabz.iplwebapp.model.User;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User user) {
		Session ses = sessionFactory.getCurrentSession();
		// Transaction tr = ses.beginTransaction();
		try {
			ses.save(user);
			// tr.commit();
		} catch (Exception e) {
			// tr.rollback();
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public User authUser(String email, String password) {
		Session ses = sessionFactory.getCurrentSession();
		// select * from users where userName = '' and password = '';
		try {
			Criteria cr = ses.createCriteria(User.class);

			User user = (User) cr.add(Restrictions.conjunction().add(Restrictions.eq("email", email))
					.add(Restrictions.eq("password", password))).uniqueResult();
			return user;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

}
