import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Dragan", 20);
        //human.setAge(-10);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        String str = new String("old String");
        System.out.println(str);
        str.replaceAll("old", "new");
        System.out.println(str);

        System.out.println(human.getCars().size());

        human.getCars().add("Opel");
        human.getCars().add("Mercedes");

    }
}