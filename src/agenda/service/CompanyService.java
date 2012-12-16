package agenda.service;

import agenda.model.Company;

public interface CompanyService {
		
	public void saveCompany (Company company);
	public void deleteCompany(Company company);
	public void saveOrUpdateCompany(Company company);	
	//public User findByCompanyName(String companyName);
}
