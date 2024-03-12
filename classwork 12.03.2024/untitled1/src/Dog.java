public class Dog implements Animal, Comparable{

    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark(){
        System.out.println("Dog is barking...");
    }

    @Override
    public void eat(String food) {
        System.out.println("Eating " + food);
    }

    @Override
    public int compareTo(Dog other) {
        if (this.age == other.age ){
            if(this.name.compareTo(other.name) == 0){
                return 0;
            } else if(this.name.compareTo(other.name) > 0){
                return 1;
            } else {
                return  -1;
            }
        } else if(this.age > other.age){
            return 1;
        } else {
            return -1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
