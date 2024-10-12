package model;

public class Frog extends Reptile{
    public Frog() {
        this.setName("Default Frog");
        this.setNrOfLegs(4);
        this.setLaysEggs(true);
    }
    Frog(String name,boolean layEggs,int nlegs)
    {
       this.setName(name);
       this.setLaysEggs(layEggs);
       this.setNrOfLegs(nlegs);
    }
}
