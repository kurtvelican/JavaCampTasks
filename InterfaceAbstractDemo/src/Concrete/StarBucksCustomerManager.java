package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager{
    private ICustomerCheckService _customerCheckService;

    public StarBucksCustomerManager(ICustomerCheckService customerCheckService){
        _customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) throws Exception{
        if(_customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);   
        }
        else {
        	throw new Exception("Not a valid person");    
        }
    }

}
