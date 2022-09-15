/*
Program For Palidrome Number.

2002 as Example.
*/


class Palindrome // Declearing Class.
{
	static void Palindrome(int number)//Set Numer as int in static
	{
		int remainder = 0; // Declearing Remainder as int 0
		int reverseNumber=0; // Declearing ReverseNumber as int 0
		int temp = number; // Declearing Temporary Number.
		
		while (number>0) // Start Condition.
		{
			remainder=number%10; 
			reverseNumber=(reverseNumber*10)+remainder;
			number/=10; 
		}
		if (temp==reverseNumber) //Start Condition as True.
		{
			System.out.println("The Number is Palindrome Number"); //Printing Output if condition is True.
		}
		else //Start Condition as False.
		{
			System.out.println("The Number is Not Palindrome Number"); //Printing Output if condition is Not True.
		}
	}		
   public static void main(String... args) //Starting Main.
   {
	 int number= Integer.parseInt(args[0]); //Taking Input from User.
	 Palindrome(number);
   }//Ending Main.
}// Ending Class.