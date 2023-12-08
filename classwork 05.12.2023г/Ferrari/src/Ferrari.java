public class Ferrari implements Car {
    private String model;
    private String driver;

    public Ferrari(String driver, String model) {
        this.model = model;
        this.driver = driver;
    }


    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr ";
    }

    public String toString() {
        return model + "/" + brakes() + "/" + gas() + "/" + driver;
    }
}