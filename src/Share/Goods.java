package Share;

public class Goods implements rool {
    public Goods(String name) {
        this.name = name;
    }
    private String name;
    private String version;

    @Override
    public void showGoods(String version) {
        if(version.equals("32G")){
            System.out.println("价格为5199");
        }
        else if(version.equals("128G")){
            System.out.println("价格为5999");
        }
    }
}
