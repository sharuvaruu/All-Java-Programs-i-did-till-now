class Employee{
    String name;
    String addr;
    String phone;
    double experience;
}
class Programmer extends Employee{
    String programminglang;
    Programmer(String pname,String paddr,String pphone,double pexperience,String ppl)
    {
        name=pname;;
        addr=paddr;
        phone=pphone;
        experience=pexperience;
        programminglang=ppl;
    }
    void getinfo(){
        System.out.println("Name :"+name);
        System.out.println("Adderess :"+addr);
        System.out.println("Phone :"+phone);
        System.out.println("Experience :"+experience);
        System.out.println("Programming Languages :"+programminglang);

    }
    void writecode(){
        System.out.println("Writing Code in various programming Languages");
    }
}
class Manager extends Employee{
    int teamsize;
    void report_project_status(){
        System.out.println("Project is ongoing");
    }
    void getinfo(){
        System.out.println("Name :"+name);
        System.out.println("Adderess :"+addr);
        System.out.println("Phone :"+phone);
        System.out.println("Experience :"+experience);
        System.out.println("Experience :"+teamsize);

}
}
class TestInheritnce{
    public static  void main(String args[]){
        Programmer p1=new Programmer("Sharvari","Ramnagar","989898989",1.5,"Java,C,C++");
        p1.getinfo();
        p1.writecode();
        System.out.println("---------------------");
        Manager m1=new Manager();
        m1.name="Kaushal";
        m1.addr="Karla Square";
        m1.phone="8008787901";
        m1.experience=3.5;
        m1.teamsize=4;
        m1.getinfo();
        m1.report_project_status();

        
    }
}