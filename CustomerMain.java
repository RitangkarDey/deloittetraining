package collections;

import java.util.*;

public class CustomerMain {

	public static void main(String[] args) {
		List<Customer>allCustomers=new ArrayList<Customer>();
		Customer c1=new Customer(10,"Uma","Pune",76000);
		allCustomers.add(c1);
		allCustomers.add(new Customer(11,"Anu","Agra",98000));
		allCustomers.add(new Customer(12,"Yamini","Jaipur",32000));
		allCustomers.add(new Customer(13,"Zeba","Delhi",2000));
		allCustomers.add(new Customer(14,"Hema","Mumbai",9000));
		allCustomers.add(new Customer(15,"Om","Delhi",18000));
		System.out.println("Details :");
		for(Customer customer:allCustomers)
		{
			System.out.println(customer);
		}
	}

}
