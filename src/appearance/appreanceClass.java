package appearance;

public class appreanceClass {
    private interior interior;
    public appreanceClass(appearance.interior interior) {
        this.interior = interior;
    }
    public void father(){
        System.out.println("华为");
        interior.child();
    }
}
