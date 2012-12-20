package agenda.dao;

import agenda.model.ToDoList;


public interface ToDoListDao {
	
	public void saveToDoList(ToDoList toDoList);

	public void deleteToDoList(ToDoList toDoList);

	public void saveOrUpdateToDoList(ToDoList toDoList);


}
