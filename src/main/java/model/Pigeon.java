package model;

public class Pigeon extends Birds{
   public Pigeon(String name,int nolegs,boolean mig,int avg)
    {
        this.setName(name);
        this.setNrOfLegs(nolegs);
        this.setMigrates(mig);
        this.setAvgFlightAlitude(avg);
    }
    public Pigeon() {
        this.setName("Default Pigeon");
        this.setNrOfLegs(2);
        this.setMigrates(false);
        this.setAvgFlightAlitude(34);
    }

}
