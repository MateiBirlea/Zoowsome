package factory;

import model.Constants;
import model.MammalFactory;

public class AnimalFactory {
    public SpeciesFactory getSpeciesFactory(String type) {
        if (Constants.Species.MAMMAL.equals(type)) {
            return new MammalFactory();
        } else if (Constants.Species.REPTILE.equals(type)) {
            return new ReptileFactory();
        } else if (Constants.Species.BIRD.equals(type)) {
            return new BirdFactory();
        } else if (Constants.Species.INSECT.equals(type)) {
            return new InsectFactory();
        } else if (Constants.Species.AQUATIC.equals(type)) {
            return new AquaticFactory();
        } else {
            throw new IllegalArgumentException("Invalid species exception");
        }
    }

}
