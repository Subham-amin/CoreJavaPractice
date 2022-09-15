//Java Class
class PatternDemo
{
	static void FirstPattern(int noOfRows)
	{
		for(int i=1;i<=noOfRows;i++)
		{
			System.out.println();
			for(int spaces=noOfRows-i;spaces>=0;spaces--);
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		}
		
	}
	public static void main (String[] args)
	{
		int number = Integer.parseInt(args[0]);
		FirstPattern(number);
	}
}