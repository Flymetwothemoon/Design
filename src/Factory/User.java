package Factory;

public class User {
    public static void main(String[] args) {
       ComputerFactory factory = new ComputerFactory();
       HP hp = factory.createComputer(HP.class);
       Lenovo lenovo = factory.createComputer(Lenovo.class);
       ROG rog = factory.createComputer(ROG.class);
       hp.start();
       lenovo.start();
       rog.start();
    }
}
