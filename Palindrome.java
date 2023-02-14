class Palindrome{
    String rev="";
    void getpali(String str){
    int s=str.length();
  for (int i = s-1; i >=0; i--) {
       rev = rev + str.charAt(i);
     }    
      if(str.equals(rev))
      {
        System.out.println("It is palindrome");
      }
      else
      {
        System.out.println("It is not palindrome");
      }
    }
    public static void main(String args[]){
        Palindrome p1=new Palindrome();
        Palindrome p2=new Palindrome();
        Palindrome p3=new Palindrome();
        p1.getpali("MADAM");
        p2.getpali("RADAR");
        p3.getpali("Sharvari");
    }
}
