class Whatsapp
{
  void send(int no)
  {
     System.out.println("sending no"+no);
  }
  void send(String textmsg)
  {
     System.out.println("sending textmsg"+textmsg);
  }
  void send(int no,String textmsg)
  {
     System.out.println("sending no and textmsg"+no+""+textmsg);
  }
  void send(String textmsg,int no)
	{
     System.out.println("sending textmsg and no"+textmsg+""+no);
	}
}
  class Mainclass1
  {
    public static void main(String[] args)
    {
      Whatsapp w1=new Whatsapp();
      w1.send(123);
      w1.send("hi");
	  w1.send(126,"hello");
      w1.send("hi",128);
    }
  }




