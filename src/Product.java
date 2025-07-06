 public class Product {
    protected String name;
    protected float price;
    protected int quantity;

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void ReduceQuantity(int amount){
        this.quantity-=amount;
    }
}
