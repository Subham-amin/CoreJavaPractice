/*
Writing a Program To Show The Accounts of less than 1000 Balance in it.
*/

class Account //Declearing Class.
{
	private String accountName;
	private String accountType;
	private double accountBalance;
	
	Account()//Default constructor.
	{
		
	}
	//Parameterized Constructor.
	Account(String accountName,String accountType,double accountBalance)
	{
		this.accountName=accountName;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}
	//Gretter and Setter.
	String getaccountName()
	{
	return this.accountName;
	}
	void setaccountName(String accountName)
	{
		this.accountName=accountName;
	}
	String getaccountType()
	{
		return this.accountType;
	}
	void setaccountType(String accountType)
	{
		this.accountType=accountType;
	}
	double getaccountBalance()
	{
		return this.accountBalance;
	}
	void setaccountBalance(double accountBalance)
	{
		this.accountBalance=accountBalance;
	}
	
}//End of Class.