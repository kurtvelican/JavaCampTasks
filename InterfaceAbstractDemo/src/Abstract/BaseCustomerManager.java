package Abstract;


import Entities.Customer;

public class BaseCustomerManager implements ICustomerService {

    @Override
    public void Save(Customer customer) throws Exception {
        System.out.println("Saved to db : " + customer.FirstName);
    }
    
}
