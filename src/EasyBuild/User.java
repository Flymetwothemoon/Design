package EasyBuild;

public class User {
    public static void main(String[] args) {
        UserInfo.Builder builder = new UserInfo.Builder();
        UserInfo info = builder.info("hello").build();
        System.out.println(info.getInfo());

    }
}
