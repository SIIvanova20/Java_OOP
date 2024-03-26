import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        try {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int result = a / b;
            System.out.println("end of try block");
        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("out of try-catch");*/

        try {
            test1();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    private static void test1() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/input.txt"));
    }
}