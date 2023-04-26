package Proxy;

public class User {
    public static void main(String[] args) {
        HUAWEI huawei = new HUAWEI();
        Honor honor = new Honor(huawei);
        honor.buy();
    }
}
