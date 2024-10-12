package factory;


import model.*;

public class BirdFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Bird.EAGLE.equals(type)) {
            return new Eagle();
        } else if (Constants.Animals.Bird.PIGEON.equals(type)) {
            return new Pigeon();
        } else if (Constants.Animals.Bird.SPARROW.equals(type)) {
            return new Sparrow();
        } else {
            throw new IllegalArgumentException("Invalid animal exception!");
        }
    }
}

