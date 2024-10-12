package model;

public class Snake extends Reptile{
    public Snake(String name,boolean layEggs,int nlegs)
    {
        this.setName(name);
        this.setLaysEggs(layEggs);
        this.setNrOfLegs(nlegs);
    }
    public Snake() {
        this.setName("Default Snake");
        this.setLaysEggs(true);
        this.setNrOfLegs(0);
    }
}
