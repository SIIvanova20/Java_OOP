package task2;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list.get(0));
        list.set(1, "Java");
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}

