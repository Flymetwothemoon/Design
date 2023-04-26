package Build;

public class Builder extends AbstractBuilder {
    private Computer computer = new Computer();
    @Override
    public void findCPU(String name) {
        computer.setCpu(name);
    }

    @Override
    public Computer computer() {
        return computer;
    }

    @Override
    public void myCPU() {
        System.out.println(computer.getCpu());
    }
}
