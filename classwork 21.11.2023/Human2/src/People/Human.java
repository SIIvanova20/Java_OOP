package People;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Human implements Creature {
    protected String name;
    protected int age;
    private List<String> cars;

    public Human(String name, int age)
    {
        setName(name);
        setAge(age);
        this.cars = new ArrayList<>();
    }

    protected abstract void setName(String name);

    public void addCar(String car){
        this.cars.add(car);
    }

    public void removeCar(String car){
        this.cars.remove(car);
    }

    public abstract void walk();

    public List<String> getCars() {
        return cars;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  {
        if( age < 0)
        {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }



    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}