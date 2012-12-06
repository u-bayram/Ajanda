package agenda.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import agenda.model.User;

@Component
public class UserDaoImp implements UserDao{

	@Override
	public List<User> getSelectAll() {
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setUsername("Merve");
		users.add(user);
		user.setUsername("Merve1");
		users.add(user);
		return users;
	}

}
