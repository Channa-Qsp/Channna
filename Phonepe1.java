class Phonepe
{
  static void pay(int no)
  {
  System.out.println("pay by no");
  }
  static void pay(String name)
	{
	    System.out.println("pay by name");
	}
	static void pay(int no,String name)
	{
	    System.out.println("pay by no and name");
	}
	static void pay(String name,int no)
	{
	    System.out.println("pay by name and no");
	}
}
class Phonepe1
{
	public static void main(String[] args)
	{
		Phonepe.pay(97403);
		Phonepe.pay("sheela");
		Phonepe.pay(97403,"sheela");
		Phonepe.pay("sheela",97403);
	}
}



