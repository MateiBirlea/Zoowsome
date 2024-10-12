package model;

public class Rhino extends Mammal{
    public Rhino() {
        this.setName("Default Rhino");
        this.setNrOfLegs(4);
        this.setNormalBodyTemp(36.0f);
        this.setPercBodyHair(10.0f);
    }
    Rhino(String name,float temp,float perc)
    {
        this.setName(name);
        this.setNrOfLegs(4);
        this.setNormalBodyTemp(temp);
        this.setPercBodyHair(perc);
    }
}
