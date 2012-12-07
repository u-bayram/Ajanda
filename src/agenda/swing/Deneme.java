package agenda.swing;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import agenda.model.User;
import agenda.service.UserService;

public class Deneme {


	private static final ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	
	public static void main(String[] args) {
		System.out.println("Merhab");
		UserService userService = (UserService) ac.getBean("userServiceImp");
		List<User> users = userService.getSelectAll();
		System.out.println(users.get(0).getUsername());
		
		User user = new User();
		user.setUsername("Merve");
		System.out.println(user.getUsername());
		
		
		//User user1 = (User) ac.getBean("user");
		//System.out.println(user1.getUsername());
		
	}

}
