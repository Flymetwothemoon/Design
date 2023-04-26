package SimpleFactory;

public class ComputerFactory {
    public static void createComputer(String type){
        computer computer = null;
        switch (type){
            case "ROG":
                computer = new ROG();
                computer.start();
                break;
            case "HP":
                computer = new HP();
                computer.start();
                break;
            case "Lenovo":
                computer = new Lenovo();
                computer.start();
                break;
        }
    }
}
