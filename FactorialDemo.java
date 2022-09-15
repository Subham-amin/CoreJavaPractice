/* 
Printing Factorial Value of A Number.
5! = 5*4*3*2*1 = 120.
*/
class FactorialDemo //Declearing Class.
{
	static void Factorial(int number)// Declear Methode.
	{
		long result = 1L;
		for (int i=number;i>=1;i--)//for condition declaring i=int as number , 
		{
			result*=i;//for multipy a per factorial condition.
			System.out.println(i+" = "+result);//Result with Details	
		}
		System.out.println("The Factorial Value of Your Given Number "+number+" is "+result);//Printing Result
		
	}
	public static void main(String... args)//Declearing Main
	{
		int number=Integer.parseInt(args[0]);//Taking Input.
		Factorial(number);
		}//Ending Main
}//Ending Class