package factory;

import model.*;

public class AquaticFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Aquatic.SEABASS.equals(type)) {
            return new SeaBass();
        } else if (Constants.Animals.Aquatic.PIKE.equals(type)) {
            return new Pike();
        } else if (Constants.Animals.Aquatic.ZANDER.equals(type)) {
            return new Zander();
        } else {
            throw new IllegalArgumentException("Invalid animal exception!");
        }
    }
}

