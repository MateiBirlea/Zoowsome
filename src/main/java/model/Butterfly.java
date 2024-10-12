package model;

public class Butterfly extends Insect{
    public Butterfly(String name,int nlegs,boolean canFly,boolean isd)
    {
        this.setName(name);
        this.setNrOfLegs(nlegs);
        this.setCanFly(canFly);
        this.setDangerous(isd);
    }
    public Butterfly() {
        this.setName("Default Butterfly");
        this.setNrOfLegs(6);
        this.setCanFly(true);
        this.setDangerous(false);
    }
}
