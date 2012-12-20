package agenda.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import agenda.model.ToDoList;

public class ToDoListDaoImp implements ToDoListDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void saveToDoList(ToDoList toDoList) {
		sessionFactory.getCurrentSession().save(toDoList);
	}

	@Override
	public void deleteToDoList(ToDoList toDoList) {
		sessionFactory.getCurrentSession().delete(toDoList);
	}

	@Override
	public void saveOrUpdateToDoList(ToDoList toDoList) {
		sessionFactory.getCurrentSession().saveOrUpdate(toDoList);

	}

}
