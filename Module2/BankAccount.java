package Module2;

public class BankAccount {
	
	public static void main(String args[])
	{
		RegularCustomer regCustomer1 = new RegularCustomer("R123","Suraj","Domestic",10000);
		RegularCustomer regCustomer2 = new RegularCustomer("R345","Akhilesh","Business",10000);

		EnterpriseCustomer entCustomer1 = new EnterpriseCustomer ("E789","jayant","SmallScale",10000);
		EnterpriseCustomer entCustomer2 = new EnterpriseCustomer ("E7891","samyak","BigScale",10000);

	    
		
		// Regular customer
		regCustomer1.showCustomerDetails();
		System.out.println("Final amount:" + regCustomer1.get_final_amount(5,8));
		regCustomer2.showCustomerDetails();
		System.out.println("Final amount:" + regCustomer2.get_final_amount(5,8));
		
		//Enterprise customer
		entCustomer1.showCustomerDetails();
		System.out.println("Final amount:" + entCustomer1.get_final_amount(5,8));
		entCustomer2.showCustomerDetails();
		System.out.println("Final amount:" + entCustomer2.get_final_amount(5,8));
		
		
	
	}

}
