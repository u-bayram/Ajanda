package agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import agenda.dao.AgendaDao;
import agenda.model.Agenda;

@Component
public class AgendaServiceImp implements AgendaService{
	 
	@Autowired
	@Qualifier("agendaDaoImp")
	private AgendaDao agendaDao;
	
	public AgendaDao getAgendaDao() {
		return agendaDao;
	}

	public void setAgendaDao(AgendaDao agendaDao) {
		this.agendaDao = agendaDao;
	}

	@Transactional
	public void saveAgenda(Agenda agenda) {
		agendaDao.saveAgenda(agenda);
	}

	@Transactional
	public void deleteAgenda(Agenda agenda) {
		agendaDao.deleteAgenda(agenda);
	}

	@Transactional
	public void saveOrUpdateAgenda(Agenda agenda) {
		agendaDao.saveOrUpdateAgenda(agenda);
	}

	/*@Transactional
	public Agenda findByStartAndFinishDate(Date startDate , Date finishDate) {
		return agendaDao.findByStartAndFinish (username, password);
	}

	@Transactional
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
*/



}
