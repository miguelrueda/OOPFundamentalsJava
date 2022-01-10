import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        Product warAndPeace = Catalogue.getProduct("War and Peace (e-book)");

        cart.addLineItem(new LineItem(babyAlarm, 1));
        cart.addLineItem(new LineItem(warAndPeace, 1));
        cart.addLineItem(new LineItem(toothbrush, 2));

        System.out.println(cart.getTotalCost());

        Customer johnDoe = new Customer("John Doe", 13213231321321L);
        Optional<Order> order = johnDoe.checkout(cart);
        System.out.println(order);
    }
}
