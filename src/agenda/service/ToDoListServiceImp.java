package agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;



import agenda.dao.ToDoListDao;
import agenda.model.ToDoList;

public class ToDoListServiceImp implements ToDoListService {

	@Autowired
	@Qualifier("toDoListDaoImp")
	private ToDoListDao toDoListDao;
	
	public ToDoListDao getToDoListDao() {
		return toDoListDao;
	}

	public void setToDoListDao(ToDoListDao toDoListDao) {
		this.toDoListDao = toDoListDao;
	}

	@Transactional
	public void saveToDoList(ToDoList toDoList) {
		toDoListDao.saveToDoList(toDoList);
	}

	@Transactional
	public void deleteToDoList(ToDoList toDoList) {
		toDoListDao.saveOrUpdateToDoList(toDoList);
	}

	@Transactional
	public void saveOrUpdateToDoList(ToDoList toDoList) {
		toDoListDao.saveOrUpdateToDoList(toDoList);
	}


}
