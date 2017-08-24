public class Item {
    private String name;
    private float price;
    private String category;
    private boolean priceCut;
    private float cutPercentage;

    public Item() {
    }

    public Item(String name, float price, String category, boolean priceCut, float cutPercentage) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.priceCut = priceCut;
        if (priceCut) {
            this.cutPercentage = cutPercentage;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        if (!priceCut) {
            return this.price;
        }
        return this.price - this.priceAfterCut();
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isPriceCut() {
        return this.priceCut;
    }

    public void setPriceCut(boolean priceCut) {
        this.priceCut = priceCut;
    }

    public float priceAfterCut() {
        return this.price * cutPercentage / 100 ;
    }
}
