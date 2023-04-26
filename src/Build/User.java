package Build;

public class User {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Director director = new Director(builder);
        director.createComputer("龙芯");
        String name = director.builder.computer().getCpu();
        System.out.println(name);
    }
}
