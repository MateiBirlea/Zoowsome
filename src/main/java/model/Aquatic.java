package model;

public abstract class Aquatic extends Animal{
    private int avgSwimDepth;
    private waterType typeofwater;
    public int getAvgSwimDepth() {
        return avgSwimDepth;
    }

    public void setAvgSwimDepth(int avgSwimDepth) {
        this.avgSwimDepth = avgSwimDepth;
    }

    public waterType getTypeofwater() {
        return typeofwater;
    }

    public void setTypeofwater(waterType typeofwater) {
        this.typeofwater = typeofwater;
    }

    public enum waterType{SaltWater,FreshWater};
}
