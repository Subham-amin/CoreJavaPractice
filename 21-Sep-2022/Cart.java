class Cart
{
	public static void main(String ...args)
	{
		Item p1=new Item("Philips TV",22000,"Electronics");
		Item p2=new Item("SAMSUNG",18000,"MOBILE");
		Item p3=new Item("AMUL",70,"Food");
		
		System.out.println(" The item Name is = "+p1.getitemName());
		System.out.println(" The item Price is = "+p1.getitemPrice());
		System.out.println(" The item Type is = "+p1.getitemType());
		System.out.println(" ----------****---------- ");
		System.out.println(" The item Name is = "+p2.getitemName());
		System.out.println(" The item Price is = "+p2.getitemPrice());
		System.out.println(" The item Type is = "+p2.getitemType());
		System.out.println(" ----------****---------- ");
		System.out.println(" The item Name is = "+p3.getitemName());
		System.out.println(" The item Price is = "+p3.getitemPrice());
		System.out.println(" The item Type is = "+p3.getitemType());
	
	}
}