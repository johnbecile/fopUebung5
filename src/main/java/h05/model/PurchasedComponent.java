package h05.model;

/**
 * The type Purchased component.
 */
public class PurchasedComponent implements Component {
    private double price;

    /**
     * Instantiates a new Purchased component.
     *
     * @param price the price
     */
    public PurchasedComponent(double price) {
        this.price = price;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    @Override
    public double getPrice() {
        return price;
    }
}
