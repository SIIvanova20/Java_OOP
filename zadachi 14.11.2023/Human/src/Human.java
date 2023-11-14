import java.util.ArrayList;

public class Human {
    protected String name;
    protected int age;
    private List<String> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setAge(age);
    }

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



    public Human(String name, int age)
    {
        this.name = name;
        setAge(age);
        this.cars = new ArrayList<>();
    }
}