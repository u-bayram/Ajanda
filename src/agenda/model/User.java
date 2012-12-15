package agenda.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="USER")
public class User {
	public static final int GENDER_MALE = 0;
	public static final int GENDER_FEMALE = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Integer userId;
	@Column(name = "USER_NAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "GENDER")
	private Integer gender;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SURNAME")
	private String surname;
	@Column(name = "USER_TYPE")
	private Integer userType;
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="USER_ID")
	private List<Agenda> agenda;
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="USER_ID")
	private List<Tags> tags;
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="USER_ID")
	private List<ToDoList> toDoList;
	@ManyToOne
	@JoinColumn(name = "COMPANY_ID")
	private Company company;
	
	public List<Tags> getTags() {
		return tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}

	public List<ToDoList> getToDoList() {
		return toDoList;
	}

	public void setToDoList(List<ToDoList> toDoList) {
		this.toDoList = toDoList;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Integer getUserType() {
		return userType;
	}

	public List<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Agenda> agenda) {
		this.agenda = agenda;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
