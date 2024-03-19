public class Main {
    public static void main(String[] args) {
        //test(10,"Ivan");
        //test(10, "asd", "21421");

        MyCustomList<String> names = new MyCustomList<>();
        names.add("Ivan");
        names.add("Georgi");
        names.add("Stoyan");

        names.forEach(e -> System.out.println(e));
    }

    /*public  static void test(int number, String... text){
        for(String t : text){
            System.out.println(t);
        }
    }*/


}