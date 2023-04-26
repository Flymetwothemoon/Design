package Factory;

public abstract class AbstractComputerFactory {
 public abstract <T extends Computer> T createComputer(Class<T> clz);
}
