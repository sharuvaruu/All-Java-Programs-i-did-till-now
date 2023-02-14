public class Duplicate {
void getdup(String str)
{
  int c = 0;
  char[] ch = str.toCharArray();
  System.out.println("Duplicate Characters are:");
  for (int i = 0; i < str.length(); i++) {
   for (int j = i + 1; j < str.length(); j++) {
    if (ch[i] == ch[j]) {
     System.out.println(ch[j]);
     c++;
     break;
    }
   }
  }
}
 public static void main(String args[]) {
 Duplicate d1=new Duplicate();
 Duplicate d2=new Duplicate();
    d1.getdup("RADAR");
    d2.getdup("MADAM");
 }
}