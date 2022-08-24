class Sample
{
  static void sort(int no)
  {
  System.out.println("sort by no");
  }
  static void sort(String name)
	{
	    System.out.println("sort by name");
	}
	static void sort(int no,String name)
	{
	    System.out.println("sort by no and name");
	}
	static void sort(String name,int no)
	{
	    System.out.println("sort by name and no");
	}
}
class Msexcel
{
	public static void main(String[] args)
	{
		Sample.sort(143);
		Sample.sort("mangi");
		Sample.sort(143,"mangi");
		Sample.sort("mangi",143);
	}
}



