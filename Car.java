class Car
{
  int car_cost;
  String mod_name;
  static String car_type="petrol";
  public static void main(String[] args)
  {
    System.out.println(car_type);
    Car c1=new Car();
       c1.car_cost=5000000;
       c1.mod_name="swift";
    System.out.println(c1.car_cost);
        System.out.println(c1.mod_name);
}
}