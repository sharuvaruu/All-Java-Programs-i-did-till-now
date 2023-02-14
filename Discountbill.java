class Bill
{
    int billid;
    int customerid;
    double discount;
    double billamt;
    double discountedBillAmount;
   public int getbillid()
   {
    return billid;
   }
   public void setbillid(int billid)
   {
    this.billid=billid;
   }
   public double getbillamt()
   {
    return billamt;
   }
   public void setbillamt(double billamt)
   {
    this.billamt=billamt;
   }
   public int getcustomerid()
   {
    return customerid;
   }
   public void setcustomerid(int customerid)
   {
    this.customerid=customerid;
   }
   public double getdiscount()
   {
    return discount;
   }
   public void setdiscount(double discount)
   {
    this.discount=discount;
   }
   public double calculatedis()
   {
    this.discountedBillAmount=this.billamt-this.billamt*(this.discount/100);
    return discountedBillAmount;
   }

}
   class Discountbill
{
    public static void main(String args[])
    {
        Bill b1=new Bill();
        b1.setbillid(1001);
        b1.setcustomerid(101);
        b1.setdiscount(2);
        b1.setbillamt(199.99);
        double f=b1.calculatedis();
        System.out.println(b1.getbillid());
        System.out.println(b1.getbillamt());
        System.out.println(b1.getcustomerid());
        System.out.println(b1.getbillamt());
        System.out.println(f);   
    }
}

