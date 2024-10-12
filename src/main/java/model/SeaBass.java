package model;

public class SeaBass extends Aquatic{
    public SeaBass(String name,int avg)
    {
        this.setName(name);
        this.setAvgSwimDepth(avg);
        this.setNrOfLegs(0);
        this.setTypeofwater(waterType.SaltWater);
    }
    public SeaBass() {
        this.setName("Default SeaBass");
        this.setNrOfLegs(0);
        this.setAvgSwimDepth(200);
        this.setTypeofwater(waterType.SaltWater);
    }
}
