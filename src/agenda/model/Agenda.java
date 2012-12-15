package agenda.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="AGENDA")
public class Agenda {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AGENDA_ID")
	private Integer agendaId;
	@Column(name = "AGENDA_CONTENT")
	private String agendaContent;
	@Column(name = "AGENDA_START_DATE")
	private Date agendaStartDate;
	@Column(name = "AGENDA_FINISH_DATE")
	private Date agendaFinishDate;
	@Column(name = "AGENDA_TYPE")
	private Integer agendaType;
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	@ManyToOne
	@JoinColumn(name="TAGS_ID")
	private Tags tags;
	@Column(name = "AGENDA_LOCATION")
	private String location;

	public Integer getAgendaId() {
		return agendaId;
	}

	public void setAgendaId(Integer agendaId) {
		this.agendaId = agendaId;
	}

	public String getAgendaContent() {
		return agendaContent;
	}

	public void setAgendaContent(String agendaContent) {
		this.agendaContent = agendaContent;
	}

	public Date getAgendaStartDate() {
		return agendaStartDate;
	}

	public void setAgendaStartDate(Date agendaStartDate) {
		this.agendaStartDate = agendaStartDate;
	}

	public Date getAgendaFinishDate() {
		return agendaFinishDate;
	}

	public void setAgendaFinishDate(Date agendaFinishDate) {
		this.agendaFinishDate = agendaFinishDate;
	}

	public Integer getAgendaType() {
		return agendaType;
	}

	public void setAgendaType(Integer agendaType) {
		this.agendaType = agendaType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
}
