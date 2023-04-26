package appearance;

public class Client {
    public static void main(String[] args) {
        interior interior = new interior();
        appreanceClass appreanceClass = new appreanceClass(interior);
        appreanceClass.father();
    }
}
