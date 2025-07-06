public class CartItem {
    protected Product product;
    protected int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public double Total_price(){
        return product.getPrice()*quantity;
    }
}
