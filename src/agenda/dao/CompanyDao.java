package agenda.dao;

import agenda.model.Company;

public interface CompanyDao {
		
	public void saveCompany (Company company);
	public void deleteCompany(Company company);
	public void saveOrUpdateCompany(Company company);	

}
