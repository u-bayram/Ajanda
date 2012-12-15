package agenda.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import agenda.model.User;

@Component
public class UserDaoImp implements UserDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void deleteUser(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	public void saveOrUpdateUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public User findByUsernameAndPassword(String username, String password) {
		String hsql = "from User us where us.username = :uusername and us.password = :upassword";
		Query query = sessionFactory.getCurrentSession().createQuery(hsql);
		query.setParameter("uusername", username);
		query.setParameter("upassword", password);
		List<User> users = query.list();
		if (users == null || users.size() == 0) {
			return null;
		} else {
			return users.get(0);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public User findByUsername(String username) {
		String hsql = "from User us where us.username = :uusername";
		List<User> users = sessionFactory.getCurrentSession().createQuery(hsql).setParameter("uusername", username).list();

		if (users == null || users.size() == 0) {
			return null;
		} else {
			return users.get(0);
		}
	}
	

}
