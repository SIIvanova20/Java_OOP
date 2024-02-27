import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Rectangle obj = new Rectangle(length, width);
        double area = obj.getArea();
        System.out.println(area);
    }
}