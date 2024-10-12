package model;

public abstract class Birds extends Animal{
    private boolean migrates;
    private int avgFlightAlitude;

    public boolean isMigrates() {
        return migrates;
    }

    public void setMigrates(boolean migrates) {
        this.migrates = migrates;
    }

    public int getAvgFlightAlitude() {
        return avgFlightAlitude;
    }

    public void setAvgFlightAlitude(int avgFlightAlitude) {
        this.avgFlightAlitude = avgFlightAlitude;
    }
}
