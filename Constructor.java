class Constructor{
    private String name;
    private String area;
    private String phone;
    Constructor() //default constructor
    {
       name="Union Bank of INDIA";
       area="Ramnagar Ranade Plot";
       phone="9850666932";
    }
    Constructor(String bname,String barea, String bphone)
    //parameterised constructor
    {
      name=bname;
      area=barea;
      phone=bphone;
    }
     
     void getintfo()
     {
        System.out.println("BANK NAME :"+name);
        System.out.println("BANK AREA :"+area);
        System.out.println("BANK CONTACT NO. :"+phone);
     }
     public static void main(String args[]){
        Constructor c1=new Constructor();//Calling default constructor
        Constructor c2=new Constructor("SBI","Nagpur Road","9421738335");//Calling parameterized constructor
        c1.getintfo();
        System.out.println("---------------------------");
        c2.getintfo();
     }
}