class Sample
{
  static void clg(int code)
  {
  System.out.println("clg by code"+code);
  }
  static void clg(String region)
	{
	    System.out.println("clg by region"+region);
	}
	static void clg(int code,String region)
	{
	    System.out.println("clg by code and region"+code+region);
	}
	static void clg(String region,int code)
	{
	    System.out.println("clg by region and code"+region+code);
	}
}
class College
{
	public static void main(String[] args)
	{
		Sample.clg(123);
		Sample.clg("kalaburgi");
		Sample.clg(123,"kalaburgi");
		Sample.clg("kalaburgi",123);
	}
}



