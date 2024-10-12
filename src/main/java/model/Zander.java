package model;



public class Zander extends Aquatic{
    public Zander(String name,int avg)
    {
        this.setName(name);
        this.setAvgSwimDepth(avg);
        this.setNrOfLegs(0);
        this.setTypeofwater(waterType.FreshWater);
    }
    public Zander() {
        this.setName("Default Zander");
        this.setAvgSwimDepth(50);
        this.setNrOfLegs(0);
        this.setTypeofwater(waterType.FreshWater);
    }
}
