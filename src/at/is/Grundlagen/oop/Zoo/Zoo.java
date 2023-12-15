package at.is.Grundlagen.oop.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String straße;
    private List<Animal> animals;

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public Zoo(String name, String straße) {
        this.name = name;
        this.straße = straße;
        this.animals = new ArrayList<>();
    }

    public void printGewicht(){
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(getAnimals().get(i).getGewicht());
        }
    }

    public String getName() {
        return name;
    }

    public String getStraße() {
        return straße;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
