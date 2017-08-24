import java.util.List;

public class App {
    public static void main(String[] args) {

        Item item1 = new Item("mouse", 100, "gaming", true, 15);
        Item item2 = new Item("keyboard", 75, "gaming", false, 15);
        Item item3 = new Item("monitor", 300, "gaming", true, 30);
        ShoppingCart cart1 = new ShoppingCart();

        cart1.addItem(item1);
        cart1.addItem(item2);
        cart1.addItem(item3);
        cart1.addCoupon(10);
        cart1.addCoupon(30);

        System.out.println(cart1.calculateTotalPrice());



    }

    public static int prod(List<Integer> ints) {
        return ints.stream().reduce(1, (x,y) -> x * y);
    }

    public static int prodPare(List<Integer> ints) {
        return ints.stream().map((elem) -> {
            if (elem%2 != 0) {
                return 1;
            }
            return elem;
        }).reduce(1, (x,y) -> x * y);
    }
}
