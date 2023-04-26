package Share;

public class Client {
    public static void main(String[] args) {
        Goods goods = Factory.getGoods("iphone7");
        goods.showGoods("32G");
        Goods goods1 = Factory.getGoods("iphone7");
        goods1.showGoods("128G");
        Goods goods2 = Factory.getGoods("iphone7");
        goods2.showGoods("32G");
        Goods goods3 = Factory.getGoods("iphone8");
        goods3.showGoods("128G");
    }
}
