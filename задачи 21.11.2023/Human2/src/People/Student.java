package People;

public class Student extends Human{

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    protected void setName(String name) {

    }

    @Override
    public void walk() {

    }

    public void Test() {
        super.name = "Sadsa";
    }
}