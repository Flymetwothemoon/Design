package Proxy;

public class Honor implements Ishop {
    private Ishop ishop;
    public Honor(Ishop ishop) {
        this.ishop = ishop;
    }

    @Override
    public void buy() {
        ishop.buy();
    }
}
