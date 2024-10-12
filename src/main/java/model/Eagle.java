package model;

public class Eagle extends Birds{
    public Eagle(String name,int nolegs,boolean mig,int avg)
    {
        this.setName(name);
        this.setNrOfLegs(nolegs);
        this.setMigrates(mig);
        this.setAvgFlightAlitude(avg);
    }
    public Eagle() {
        this.setName("Default Eagle");
        this.setNrOfLegs(2);
        this.setMigrates(false);
        this.setAvgFlightAlitude(100);
    }
}
