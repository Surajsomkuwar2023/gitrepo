package Module2;

public class RegularCustomer extends Customer{

	
	//class variables
	
		String customerID;
		String customerName;
		String customerType;
		double amount;
		
		//Constructor
		
		RegularCustomer(String custID, String custName, String custType, double amt)
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
			
			//flat 500 rupee discount for all Enterprise customers
			
			if(this.customerType == "Domestic")
			{
				// for regular customer type we are discounting 500 rupee
				return amount - 500;
			}
			
			else if (this.customerType == "Business")
			{
				//for business customer no discount
				return amount;
			}

			// besides the above customer types we will return the amount calculated
			return amount;
		}
}
