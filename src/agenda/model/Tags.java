package agenda.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tags {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TAGS_ID")
	private Integer userId;
	@Column(name = "TAGS_COLOUR")
	private String tagsColour;
	@Column(name = "TAGS_TITLE")
	private String tagsTitle;
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	@OneToMany
	@JoinColumn(name = "TAGS_ID")
	private List<Agenda> agenda;

	public List<Agenda> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Agenda> agenda) {
		this.agenda = agenda;
	}

	public String getTagsTitle() {
		return tagsTitle;
	}

	public void setTagsTitle(String tagsTitle) {
		this.tagsTitle = tagsTitle;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTagsColour() {
		return tagsColour;
	}

	public void setTagsColour(String tagsColour) {
		this.tagsColour = tagsColour;
	}

}
