package agenda.service;

import agenda.model.Agenda;

public interface AgendaService {
	
	public void saveAgenda(Agenda agenda);

	public void deleteAgenda(Agenda agenda);

	public void saveOrUpdateAgenda(Agenda agenda);

//	public Agenda findByStartAndFinish(Date agendaStartDate, Date agendaFinishDate);
	

}
