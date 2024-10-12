package model;

import factory.SpeciesFactory;

public class MammalFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Mammal.LION.equals(type)) {
            return new Lion();
        } else if (Constants.Animals.Mammal.TIGER.equals(type)) {
            return new Tiger();
        } else if (Constants.Animals.Mammal.RHINO.equals(type)) {
            return new Rhino();
        } else {
            throw new IllegalArgumentException("Invalid animal exception!");
        }
    }
}
