package Java;

import java.util.ArrayList;
import java.util.List;

import Java.Beasts.Beasts;
import Java.Beasts.Camel;
import Java.Beasts.Donkey;
import Java.Pets.Cat;
import Java.Pets.Dog;
import Java.Pets.Pet;

public class Farm<T> {
    private static List<A> animals;

    public Farm() {
        animals = new ArrayList();
    }

    public boolean adopt(Cat cat) {
        return animals.add(cat);
    }

    public Farm<Animal> release(Farm<Animal> animalFarm) {
        if (animals.contains(animalFarm)) {
            animals.remove(animalFarm);
            return animalFarm;
        }
        return null;
    }

    public static <A> Farm<A> create() {
        return new Farm<A>();
    }

    public static <A> boolean adopt(Farm<A> farm, Java.A animal) {
        return farm.adopt(animal);
    }

    public void printOnlyThisClass(int animalClass) {
        switch (animalClass) {
            case 1:
                printCollection(Pet.class);
                break;
            case 2:
                printCollection(Beasts.class);
                break;
        }
    }

    public void printCollection(Class<?> choiseClass){
        for (Java.A animal :
                animals) {
            if (choiseClass.isInstance(animal)) {
                System.out.println(animal.toString());
            }
        }
    }

    public static void printAnimals() {
        for (Java.A animal :
                animals) {
            System.out.println(animal.toString());
        }
    }

    public void adopt(Cat cat) {
    }

    public void adopt(Donkey donkey) {
    }

    public void adopt(Camel camel) {
    }

    public void adopt(Dog dog) {
    }
}