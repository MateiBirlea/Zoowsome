package model;

public class Salamander extends Reptile{
    public Salamander(String name,boolean layEggs,int nlegs)
    {
        this.setName(name);
        this.setLaysEggs(layEggs);
        this.setNrOfLegs(nlegs);
    }
    public Salamander() {
        this.setName("Default Salamander");
        this.setLaysEggs(true);
        this.setNrOfLegs(4);
    }
}
