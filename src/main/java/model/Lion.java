package model;

public class Lion extends Mammal{
    public Lion() {
        this.setName("Default Lion");
        this.setNrOfLegs(4);
        this.setNormalBodyTemp(37.5f);
        this.setPercBodyHair(90.0f);
    }

    Lion(String name,float temp,float perc)
    {
        this.setName(name);
        this.setNrOfLegs(4);
        this.setNormalBodyTemp(temp);
        this.setPercBodyHair(perc);
    }
}
