package agenda.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import agenda.model.Agenda;

@Component
public  class AgendaDaoImp implements AgendaDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveAgenda(Agenda agenda) {
		sessionFactory.getCurrentSession().save(agenda);
	}

	@Override
	public void deleteAgenda(Agenda agenda) {
		sessionFactory.getCurrentSession().delete(agenda);
	}

	@Override
	public void saveOrUpdateAgenda(Agenda agenda) {
		sessionFactory.getCurrentSession().saveOrUpdate(agenda);
	}




}
