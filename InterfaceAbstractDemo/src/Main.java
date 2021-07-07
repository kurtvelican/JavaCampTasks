import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {
     
        BaseCustomerManager customerManager = new StarBucksCustomerManager(new MernisServiceAdapter());
        customerManager.Save(new Customer(1,"Engin","Demiroð",LocalDate.of(1985, 1, 6),28861499108L));
        System.out.println();
    }
}
