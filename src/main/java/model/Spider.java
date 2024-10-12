package model;

public class Spider extends Insect{
    public Spider(String name,int nlegs,boolean canFly,boolean isd)
    {
        this.setName(name);
        this.setNrOfLegs(nlegs);
        this.setCanFly(canFly);
        this.setDangerous(isd);
    }
    public Spider() {
        this.setName("Default Spider");
        this.setNrOfLegs(8);
        this.setCanFly(false);
        this.setDangerous(true);
    }
}
