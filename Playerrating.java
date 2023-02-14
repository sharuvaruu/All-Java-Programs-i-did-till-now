class Playerrating{
    int playerpos;
    String playername;
    double critic1r;
    double critic2r;
    double critic3r;
    double avgr;
    char cat;
    Playerrating(int playerpos,String playername){
        this.playerpos=playerpos;
        this.playername=playername;
    }
   void calavg(double critic1r,double critic2r,double critic3r){
           avgr=(critic1r+critic2r+critic3r)/3;
           System.out.println(avgr);
    }
    void calavg(double critic1r,double critic2r){
           avgr=(critic1r+critic2r)/2;
           System.out.println(avgr);
    }
  void categoury()
    {
        if(avgr>8)
         System.out.println("A");
        else if(avgr>5&& avgr<=8)
        System.out.println("B");
        else if(avgr>0 && avgr<5)
        System.out.println("C");
        else
        System.out.println("Invalid Categoury");
    }
    public static void main(String args[]){
        Playerrating p1=new Playerrating(1,"Beckham");
        Playerrating p2=new Playerrating(2,"Naina");
        p1.calavg(9.8,9,6.9);
        p1.categoury();
         p2.calavg(2,9);
        p2.categoury();



    }
}