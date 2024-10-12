package factory;


import model.*;

public class ReptileFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Reptile.SNAKE.equals(type)) {
            return new Snake();
        } else if (Constants.Animals.Reptile.FROG.equals(type)) {
            return new Frog();
        } else if (Constants.Animals.Reptile.SALAMANDER.equals(type)) {
            return new Salamander();
        } else {
            throw new IllegalArgumentException("Invalid animal exception!");
        }
    }
}

