import java.util.ArrayList;
import java.util.List;

public class E_commerceSystem {
    private static final double shipping_fee_per_kg=10.0;

    public void checkout(Customer customer) throws Exception{
        Cart cart = customer.getCart();
        if (cart.isEmpty()){
            throw new Exception("cart is Empty");
        }
        double subtotal =0.0;
        double totalShippingWeight=0.0;
        List<Shippable>ship = new ArrayList<>();
        for(CartItem item : cart.items){

            Product product= item.getProduct();
            int quantity = item.getQuantity();
            if(product instanceof Expirable ){
                throw new Exception(product.getName() + " is expired");
            }
            if (product instanceof  Shippable )
            {
                for (int i = 0; i < quantity; i++) {
                    ship.add((Shippable)product);
                    totalShippingWeight+=((Shippable)product).getWeight();
                }
            }
            subtotal+=item.Total_price();
            double shippingFee = totalShippingWeight* shipping_fee_per_kg;
            double total = subtotal+ shippingFee;
            if(customer.getBalance() < totalShippingWeight)
                throw new Exception("invalid");

      for (CartItem i : cart.items){
          i.getProduct().ReduceQuantity(i.getQuantity());
      }
      customer.check_balance(subtotal);
        System.out.println("subTotal:"+subtotal);
        System.out.println("shipping fee:"+ shippingFee);
        System.out.println("Remaining Balance:" +customer.getBalance());
        System.out.println("total:"+total);
    }

}
}
