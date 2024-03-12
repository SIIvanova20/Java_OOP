import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Lucky", "Beagle", 5));
        dogs.add(new Dog("Richo", "Pincher", 7));
        dogs.add(new Dog("RexS", "German Sheppard", 2));
        Collections.sort(dogs);

        for(Dog dog: dogs){
            System.out.println(dog.getName() + " " + dog.getBreed() + " " + dog.getAge());
        }
    }
}