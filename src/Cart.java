import java.util.ArrayList;
import java.util.List;

public class Cart {
    protected List<CartItem> items= new ArrayList<>();
    public void addItem (Product product, int quantity) throws Exception{
        if(quantity > product.getQuantity())
            throw new Exception("Invalid, Requested quantity is more than available");
        items.add(new CartItem(product, quantity));
    }

    public double getItems() {
        return items.stream().mapToDouble(CartItem::Total_price).sum();
    }
    public boolean isEmpty(){
        return  items.isEmpty();
    }
}
