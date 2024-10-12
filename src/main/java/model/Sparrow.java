package model;

public class Sparrow extends Birds{
    public Sparrow() {
        this.setName("Default Sparrow");
        this.setNrOfLegs(2);
        this.setMigrates(false);
        this.setAvgFlightAlitude(44);
    }
    public Sparrow(String name,int nolegs,boolean mig,int avg)
    {
        this.setName(name);
        this.setNrOfLegs(nolegs);
        this.setMigrates(mig);
        this.setAvgFlightAlitude(avg);
    }

}
