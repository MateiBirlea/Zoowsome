package factory;


import model.*;

public class InsectFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Insect.SPIDER.equals(type)) {
            return new Spider();
        } else if (Constants.Animals.Insect.COCKROACH.equals(type)) {
            return new CockRoach();
        } else if (Constants.Animals.Insect.BUTTERFLY.equals(type)) {
            return new Butterfly();
        } else {
            throw new IllegalArgumentException("Invalid animal exception!");
        }
    }
}

