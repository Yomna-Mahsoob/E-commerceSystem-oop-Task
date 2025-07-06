import java.util.Date;

public class Cheese extends Product implements Expirable{
    private Date expiryDate;
    private double weight;

    public Cheese(Date expiryDate, double weight,String name, float price, int quantity) {
        super(name,price,quantity);
        this.expiryDate = expiryDate;
        this.weight = weight;
    }
   public boolean isExpired(){
        return new Date().after(expiryDate);
   }
    public double getWeight() {
        return weight;
    }
}
