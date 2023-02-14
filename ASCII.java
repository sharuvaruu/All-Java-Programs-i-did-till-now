class ASCII{
    void getascii(String str)
    {
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println("ASCII value of " + ch + " is - " + (int)ch);
        }
    }
    public static void main(String args[]){
        ASCII a1=new ASCII();
        ASCII a2=new ASCII();
        a1.getascii("MADAM");
        System.out.println();
        a2.getascii("RADAR");
    }
}
    
