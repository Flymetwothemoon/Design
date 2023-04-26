package Decorator;

public abstract class Master extends Mobile {
    public Master(Mobile father) {
        this.father = father;
    }
    private Mobile father;

    @Override
    public void whichPhone() {
        father.whichPhone();
    }
}
