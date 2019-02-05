import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals = new ArrayList();


    public Zoo printAnimals() {
        System.out.println("Animals in my zoo:");
        for (Animal animal : animals) {
            animal.makeNoise();
        }
        System.out.println("--------------");
        return this;
    }

    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    public Zoo removeAnimal(Animal animal) {
        animals.remove(animal);
        return this;
    }

    public int countAnimals() {
        return animals.size();
    }

    public static void main(String[] args) {
        Zoo mojeZoo = new Zoo()
                .addAnimal(new Animal("Hroch", "Kvák"))
                .addAnimal(new Animal("Kůn", "Kvák"))
                .addAnimal(new Animal("Hroch", "Kvák"))
                .printAnimals()
                .removeAnimal(new Animal("Kůn", "Kvák"))
                .addAnimal(new Animal("Hroch", "Kvák"))
                .addAnimal(new Animal("Hroch", "Kvák"))
                .removeAnimal(new Animal("Hroch", "Kvák"))
                .printAnimals();

        Zoo mojeDruhaZoo = new Zoo();
        mojeDruhaZoo.addAnimal(new Animal("Koza", "meeeeee"));

        mojeDruhaZoo.printAnimals();


    }
}
