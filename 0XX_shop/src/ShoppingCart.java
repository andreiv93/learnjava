import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;
    private List<Integer> coupons;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.coupons = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        return this.items.add(item);
    }

    public Item removeItem(int index) {
        return this.items.remove(index);
    }

    public Item getItem(int index) {
        return this.items.get(index);
    }

    public boolean addCoupon(Integer coupon) {
        return this.coupons.add(coupon);
    }

    public Integer removeCoupon(int index) {
        return this.coupons.remove(index);
    }

    public Integer getCoupon(int index) {
        return this.coupons.get(index);
    }

    public float calculateTotalPrice() {
        float totalPrice = this.items.stream().map(Item::getPrice).reduce(0f, (x, y) -> x + y);
        return totalPrice - this.getTotalDiscount();
    }

    private int getTotalDiscount() {
        /**

        int s = 0;
        for (Integer temp : this.coupons) {
            s = s + temp;
        }
        return s;

         */
//        return this.coupons.stream().map((elem) -> {return elem.intValue();}).reduce(0, (x, y) -> {return x+y;});
        return this.coupons.stream().mapToInt(Integer::intValue).sum();
    }
}
