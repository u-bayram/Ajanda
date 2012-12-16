package agenda.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import agenda.model.Company;

@Component
public  class CompanyDaoImp implements CompanyDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveCompany(Company company) {
		sessionFactory.getCurrentSession().save(company);
	}

	@Override
	public void deleteCompany(Company company) {
		sessionFactory.getCurrentSession().delete(company);
	}

	@Override
	public void saveOrUpdateCompany(Company company){
		sessionFactory.getCurrentSession().saveOrUpdate(company);
		
	}


	/*@SuppressWarnings("unchecked")
	public User findByCompanyName(String companyName) {
		String hsql = "from Company com where com.companyName = :ccompanyName";
		Company companies = sessionFactory.getCurrentSession().setParameter ("ccompanyName", companyName);

		if (users == null || users.size() == 0) {
			return null;
		} else {
			return users.get(0);
		}
	}*/
	

}
