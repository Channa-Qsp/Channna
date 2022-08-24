class Sample
{
  static void shop(int price)
  {
  System.out.println("shop by date"+price);
  }
  static void shop(String quality)
	{
	    System.out.println("shop by quality"+quality);
	}
	static void shop(int price,String quality)
	{
	    System.out.println("shop by price and quality"+price+quality);
	}
	static void shop(String quality,int price)
	{
	    System.out.println("shop by qualty and price"+quality+price);
	}
}
class Amazon
{
	public static void main(String[] args)
	{
		Sample.shop(10000);
		Sample.shop("good");
		Sample.shop(10000,"good");
		Sample.shop("good",10000);
	}
}



