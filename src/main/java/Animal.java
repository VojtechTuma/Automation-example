import java.util.Objects;

public class Animal {

    String name;

    String noise;

    public Animal(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public void makeNoise() {
        System.out.println(name + ": " + noise);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                Objects.equals(noise, animal.noise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, noise);
    }
}
