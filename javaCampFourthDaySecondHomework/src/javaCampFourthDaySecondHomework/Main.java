package javaCampFourthDaySecondHomework;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Özden", "Özbek", "1544646", LocalDate.of(1996, 2, 25) ));
		
		System.out.println();
	}

}
