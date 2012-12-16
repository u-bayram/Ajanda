package agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import agenda.dao.UserDao;
import agenda.model.User;

@Component
public class UserServiceImp implements UserService{
	 
	@Autowired
	@Qualifier("userDaoImp")
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Transactional
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	@Transactional
	public void saveOrUpdateUser(User user) {
		userDao.saveOrUpdateUser(user);
	}

	@Transactional
	public User findByUsernameAndPassword(String username, String password) {
		return userDao.findByUsernameAndPassword(username, password);
	}

	@Transactional
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}




}
