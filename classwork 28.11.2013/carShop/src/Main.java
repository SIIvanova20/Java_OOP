public class Main {
    public static void main(String[] args) {
        RepairShop shop = new RepairShop();
        shop.repair(new Mercedes());
        shop.repair(new Audi());
    }
}