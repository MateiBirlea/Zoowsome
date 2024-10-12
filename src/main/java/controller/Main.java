package controller;

import factory.AnimalFactory;
import factory.SpeciesFactory;
import model.*;

public class Main {
    public static void main(String[] args) {

        AnimalFactory abstractFactory = new AnimalFactory();
        SpeciesFactory mammalSpeciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.MAMMAL);
        Animal tonyTheTiger = mammalSpeciesFactory.getAnimal(Constants.Animals.Mammal.TIGER);
        System.out.printf("We have an animal with %d legs!\n", tonyTheTiger.getNrOfLegs());
        Eagle eagle = new Eagle("Eaglet",2, false, 1200);
        SeaBass seaBass = new SeaBass("Fishy", 300);
        Spider spider = new Spider("Spider", 8, false, true);

    }
}
