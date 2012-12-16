package agenda.dao;

import agenda.model.Agenda;

public interface AgendaDao {
	
	public void saveAgenda(Agenda agenda);

	public void deleteAgenda(Agenda agenda);

	public void saveOrUpdateAgenda(Agenda agenda);


	

}
