class Student1{
    private int studentid;
    private String name;
    private float marks;
    private char res_status;
    private int yearofeng;
    public int getStudentId()
    {
        return studentid;
    }
    public void setStudentid(int studentid)
    {
        this.studentid=studentid;  
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public float getexammarks()
    {
        return marks;
    }
    public void setexammarks(float marks)
    {
        this.marks=marks;
    }
    public char getres()
    {
        return res_status;
    }
    public void setres(char res_status)
    {
        this.res_status=res_status;
    }
    public int getengyear()
    {
        return yearofeng;
    }
    public void setengyear(int yearofeng)
    {
        this.yearofeng=yearofeng;
    }
   
}
public class StudentTester{
   
   public static void main(String[] args){
     Student1 s1= new Student1();
     s1.setStudentid(1002);
     s1.setname("Sharvari");
     s1.setexammarks(94);
     s1.setres('H');
     s1.setengyear(2);
     System.out.println("Student Name :"+ s1.getname());
     System.out.println("Student Id :"+ s1.getStudentId());
     System.out.println("Qualifying Marks :"+ s1.getexammarks());
     System.out.println("Residential Status: " + s1.getres());
     System.out.println("Year of Engineering: " + s1.getengyear());
     
   }
}
