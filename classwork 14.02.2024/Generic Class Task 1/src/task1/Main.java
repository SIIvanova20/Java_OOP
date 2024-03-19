package task1;

public class Main {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "World");
        String first = pair.getFirst();
        String second = pair.getSecond();
        System.out.println("First element: " + first);
        System.out.println("Second element: " + second);
    }
}