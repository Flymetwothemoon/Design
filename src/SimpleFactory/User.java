package SimpleFactory;

public class User {
    public static void main(String[] args) {
        ComputerFactory.createComputer("ROG");
        ComputerFactory.createComputer("Lenovo");
        ComputerFactory.createComputer("HP");
    }
}
