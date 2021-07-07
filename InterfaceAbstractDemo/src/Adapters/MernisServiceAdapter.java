package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception {
			KPSPublicSoapProxy client =new KPSPublicSoapProxy();
			return client.TCKimlikNoDogrula(customer.NationalityId,customer.FirstName.toUpperCase(),customer.LastName.toUpperCase() , customer.DateOfBirth.getYear());
		
	}

}
