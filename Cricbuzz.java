class Sample
{
  static void matches(int date)
  {
  System.out.println("Matches by date"+date);
  }
  static void matches(String country)
	{
	    System.out.println("Matches by country"+country);
	}
	static void matches(int date,String country)
	{
	    System.out.println("Matches by date and country"+date+country);
	}
	static void matches(String country,int date)
	{
	    System.out.println("Matches by country and date"+country+date);
	}
}
class Cricbuzz
{
	public static void main(String[] args)
	{
		Sample.matches(12);
		Sample.matches("india");
		Sample.matches(12,"india");
		Sample.matches("india",12);
	}
}



