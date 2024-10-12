package model;

public class CockRoach extends Insect{
     public CockRoach(String name,int nlegs,boolean canFly,boolean isd)
    {
        this.setName(name);
        this.setNrOfLegs(nlegs);
        this.setCanFly(canFly);
        this.setDangerous(isd);
    }
    public CockRoach() {
        this.setName("Default CockRoach");
        this.setNrOfLegs(6);
        this.setCanFly(false);
        this.setDangerous(false);
    }
}
