import java.util.Date;

public class Biscuits extends Product implements Expirable{
    private Date expiryDate;

    public Biscuits(String name, float price, int quantity, Date expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }
    public boolean isExpired(){
        return new Date().after(expiryDate);
    }

}
