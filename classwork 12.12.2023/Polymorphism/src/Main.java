import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        /*Mammal mammal = new Dog();
        Animal animal = new Dog();
        animal.eat("Meat");
        ((String) animal).length();
        List<Integer> ints = new ArrayList<>();
        if (animal.getClass() == Dog.class) {
            ((Dog) animal).bark();
        }
        Calculator calculator = new Calculator();*/
        Puppy puppy = new Puppy();
        dog.bark();
        puppy.bark();
    }
}