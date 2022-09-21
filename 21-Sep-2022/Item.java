class Item
{
	private String itemName;
	private double itemPrice;
	private String itemType;
	
	Item()//Default constructor.
	{
		
	}
	//Parameterized Constructor.
	Item(String itemName,double itemPrice,String itemType)
	{
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.itemType=itemType;
	}
	//Gretter and Setter.
	String getitemName()
	{
		return this.itemName;
	}
	void setitemName(String itemName)
	{
		this.itemName=itemName;
	}
	double getitemPrice()
	{
		return this.itemPrice;
	}
	void setitemPrice(double itemPrice)
	{
		this.itemPrice=itemPrice;
	}
	String getitemType()
	{
		return this.itemType;
	}
	void setitemType(String itemType)
	{
		this.itemType=itemType;
	}
	
}