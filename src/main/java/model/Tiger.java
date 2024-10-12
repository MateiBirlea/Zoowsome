package model;

public class Tiger extends Mammal{
    public Tiger() {
        this.setName("Default Tiger");
        this.setNrOfLegs(4);
        this.setNormalBodyTemp(37.5f);
        this.setPercBodyHair(85.0f);
    }
    Tiger(String name,float temp,float perc)
    {
        this.setName(name);
        this.setNrOfLegs(4);
        this.setNormalBodyTemp(temp);
        this.setPercBodyHair(perc);
    }
}
