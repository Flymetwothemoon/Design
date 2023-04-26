package Factory;

public class ComputerFactory extends AbstractComputerFactory{
    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer computer = null;
        String name = clz.getName();
        try {
            computer =(Computer) Class.forName(name).newInstance();
            //通过Class对象创建一个新的实例，相当于调用该类的无参构造方法。
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)computer;
    }
}
