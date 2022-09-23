/*

Writing a Program To Show The Accounts of less than 1000 Balance in it.

*/
class Bank//Declearing Class.
{
	public static void main(String ...args)
	{
		Account s[] = new Account[10];
		
		s[0]= new Account("Shuruti","Salary",56000.12);
		s[1]= new Account("Subham","Savings",900.22);
		s[2]= new Account("Royston","Savings",990.99);
		s[3]= new Account("Mritul","Current",1200.45);
		s[4]= new Account("Shweta","Savings",760.33);
		s[5]= new Account("Sweety","Current",920.26);
		s[6]= new Account("Aditya","Savings",13231.03);
		s[7]= new Account("Anmol","Current",1400.27);
		s[8]= new Account("Rakhee","Salary",561.22);
		s[9]= new Account("Mukul","Current",410.11);
		
		System.out.println();
		System.out.println(" The Accounts That Having less than Balance 1000 are ");
		for(int i=0;i<10;i++)
		{
			if((s[i].getaccountBalance())<1000)
			{
				System.out.println("*------------***------------*");
				System.out.println();
				System.out.println("Name - "+s[i].getaccountName());
				System.out.println("Account Type is - "+s[i].getaccountType());
				System.out.println("Balance is - "+s[i].getaccountBalance());
				System.out.println();
				System.out.println("*------------***------------*");
				System.out.println();
			}
		
		}
		
	
	}
}//End Of Class.