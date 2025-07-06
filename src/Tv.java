public class Tv extends  Product implements Shippable{
    private double weight;
    public Tv(String name, float price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }
    @Override
    public double getWeight() {
        return weight;
    }
}
