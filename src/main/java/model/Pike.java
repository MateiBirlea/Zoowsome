package model;

public class Pike extends Aquatic{
   public Pike(String name,int avg)
    {
        this.setName(name);
        this.setAvgSwimDepth(avg);
        this.setNrOfLegs(0);
        this.setTypeofwater(waterType.FreshWater);
    }
    public Pike() {
        this.setName("Default Pike");
        this.setAvgSwimDepth(100);
        this.setNrOfLegs(0);
        this.setTypeofwater(waterType.FreshWater);
    }
}
