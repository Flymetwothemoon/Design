package Decorator;

public class HuaWei extends Master{
    public HuaWei(Mobile father) {
        super(father);
    }
    public void isFather(){
        System.out.println("是华为手机");
    }
    @Override
    public void whichPhone() {
        super.whichPhone();
        isFather();
    }
}
