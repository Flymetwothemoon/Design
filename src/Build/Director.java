package Build;

public class Director {
    public Director(Builder builder) {
        this.builder = builder;
    }

    Builder builder = null;
    public Computer createComputer(String cpu){
        this.builder.findCPU(cpu);
        return builder.computer();
    }
}
