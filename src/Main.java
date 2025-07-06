public class Main {
    public static void main(String[] args) throws Exception {
        E_commerceSystem system= new E_commerceSystem();
        Customer customer = new Customer("Yomna", 1000);
        Product mobile = new Product("Mobile", 100, 20);
        Product cheese = new Product("cheese", 200, 10);
        Product Biscuits = new Product("Biscuits", 50, 5);
        customer.cart.addItem(mobile, 2);
        customer.cart.addItem(cheese, 10);
        customer.cart.addItem(Biscuits, 4);

        system.checkout(customer);
    }
}

