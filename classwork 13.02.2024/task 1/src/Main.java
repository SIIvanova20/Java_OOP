public class Main {
    public static void main(String[] args) {
      Printer<String> stringPrinter = new Printer<>("Ivan");
      stringPrinter.print();

      Printer<Integer> integerPrinter = new Printer<>(10);
      integerPrinter.print();
    }
}