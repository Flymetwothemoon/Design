package Share;

import java.util.HashMap;
import java.util.Map;

public class Factory {
  private static HashMap<String,Goods>map = new HashMap<>();
  public static Goods getGoods(String name){
      if(map.containsKey(name)){
          System.out.println("使用缓存,key ="+name);
          return map.get(name);
      }
      else{
          Goods goods = new Goods(name);
          map.put(name,goods);
          System.out.println("创建对象,key = "+name);
          return map.get(name);
      }
  }
}
