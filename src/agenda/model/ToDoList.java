package agenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ToDoList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TO_DO_LIST_ID")
	private Integer toDoListId;
	@Column(name = "TO_DO_LIST_CONTENT")
	private String toDoListName;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	public Integer getToDoListId() {
		return toDoListId;
	}

	public void setToDoListId(Integer toDoListId) {
		this.toDoListId = toDoListId;
	}

	public String getToDoListName() {
		return toDoListName;
	}

	public void setToDoListName(String toDoListName) {
		this.toDoListName = toDoListName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
