package agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import agenda.dao.CompanyDao;
import agenda.model.Company;

@Component
public abstract class CompanyServiceImp implements CompanyService{
	 
	@Autowired
	@Qualifier("companyDaoImp")
	private CompanyDao companyDao;
	
	public CompanyDao getCompanyDao() {
		return companyDao;
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	@Transactional
	public void saveCompany(Company company) {
		companyDao.saveCompany(company);
	}

	@Transactional
	public void deleteCompany(Company company) {
		companyDao.deleteCompany(company);
	}

	@Transactional
	public void saveOrUpdateCompany(Company company) {
		companyDao.saveOrUpdateCompany (company);
	}

	
	/*@Transactional
	public Company findByCompanyName(String companyName) {
		return CompanyDao.findByCompanyName(companyName);
	}*/




}
