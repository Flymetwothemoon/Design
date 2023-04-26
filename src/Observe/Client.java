package Observe;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        WeixinUser user = new WeixinUser("小米1");
        WeixinUser user1 = new WeixinUser("小米2");
        WeixinUser user2 = new WeixinUser("小米3");
        subscriptionSubject.attach(user);
        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);
        subscriptionSubject.notify("1999");
        subscriptionSubject.detach(user2);
        subscriptionSubject.notify("2499");
    }
}
