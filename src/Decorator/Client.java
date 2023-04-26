package Decorator;

public class Client {
    public static void main(String[] args) {
    Honor honor = new Honor();
    HuaWei huaWei  = new HuaWei(honor);
    huaWei.whichPhone();
    }
}
