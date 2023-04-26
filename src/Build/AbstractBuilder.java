package Build;

public abstract class AbstractBuilder {
    public abstract void findCPU(String name);
    public abstract Computer computer();
    public abstract void myCPU();
}
