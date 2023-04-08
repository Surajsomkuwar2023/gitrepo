package Module2;

public class EnterpriseCustomer extends Customer {
	
	//class variables
	
	String customerID;
	String customerName;
	String customerType;
	double amount;
	
	//Constructor
	
	EnterpriseCustomer(String custID, String custName, String custType, double amt)
	{
		super(custID, custName, custType);
		
		this.customerID = custID;
		this.customerName = custName;
		this.customerType = custType;
		this.amount = amt;
		
	}
	
	// method
	
	double get_final_amount(double interest, int year)
	{
		double simple_interest = this.amount * interest *year;
		double amount = this.amount + simple_interest;
		
		//flat 500 rupees discount for all Enterprise customers
		amount = amount - 500;
		if(this.customerType == "SmallScale")
		{
			// for regular customer type we are discounting 500 rupee
			return amount - 100;
		}
		
		else if (this.customerType == "BigScale")
		{
			//for business customer no discount
			return amount;
		}

		// besides the above customer types we will return the amount calculated
		return amount;
	}

}
