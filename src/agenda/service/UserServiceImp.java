package agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import agenda.dao.UserDao;
import agenda.model.User;

@Component
public class UserServiceImp implements UserService {
	 
	@Autowired
	@Qualifier("userDaoImp")
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getSelectAll() {
		return userDao.getSelectAll();
	}

}
