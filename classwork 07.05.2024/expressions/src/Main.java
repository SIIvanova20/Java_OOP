import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*List<String> names = new ArrayList<>();

        names.add("Ivan");
        names.add("Gosho");
        names.add("Stoyan");

        names.forEach(element -> System.out.println(element));*/


        /*Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        List<Integer> numbers = Arrays.stream(input)
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        numbers.removeIf(e -> e % 2 != 0);
        numbers.forEach(e -> System.out.println(e + " "));
        numbers.sort((a,b) -> a.compareTo(b));
        System.out.println();
        numbers.forEach(e -> System.out.println(e + " "));

        Function<String, Integer> passer = e -> Integer.parseInt(e);*/


        /*Scanner scanner = new Scanner(System.in);
        Function<String, Integer> parser = e -> Integer.parseInt(e);
        System.out.println(parser.apply("5").getClass());
        Consumer<Integer> intPrinter = e -> System.out.println(e + " ");
        intPrinter.accept(10);
        intPrinter.accept(20);
        intPrinter.accept(200);

        Predicate<Integer> oddNumbers = e -> e % 2 != 0;
        Function<Integer, Boolean> oddNumbersFunction = e -> e % 2 != 0;

        System.out.println(oddNumbers.test(10));
        System.out.println(oddNumbers.test(20));
        System.out.println(oddNumbers.test(200));



        //Read from console ->parse to int.
        String[] input = scanner.nextLine().split(", ");
        List<Integer> numbers = Arrays.stream(input)
                .map(parser)
                    .collect(Collectors.toList());

        numbers.removeIf(oddNumbers);
        numbers.forEach(intPrinter);
        numbers.sort((a,b) ->b.compareTo(a));
        System.out.println();
        numbers.forEach(intPrinter);

        System.out.println();
        Supplier<Integer> intGenerator = () -> 100;
        System.out.println(intGenerator.get());*/


        /*BiFunction<Integer, Double, String> sum = (a, b) -> "Sum is " + (a + b);
        String result  = sum.apply(10, 10.5);
        System.out.println(result);*/


        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int sum = Arrays.stream(input).mapToInt(e -> Integer.parseInt(e))
                .sum();
        long count = Arrays.stream(input).count();
        Consumer<Integer> sumPrinter = e -> System.out.println("Sum = " + e);
        Consumer<Long> countPrinter = e -> System.out.println("Count = " + e);
        sumPrinter.accept(sum);
        countPrinter.accept(count);

        Arrays.stream(scanner.nextLine().split(", ")).map(e -> Integer.parseInt(e))
                .forEach(e -> {
                    int summ = 0;
                    summ += e;
                    return summ;
                })
                .forEach(e -> System.out.println(e));
    }
}