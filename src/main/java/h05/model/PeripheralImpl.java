package h05.model;

/**
 * The type Peripheral implementation.
 */
public class PeripheralImpl extends PurchasedComponent implements Peripheral {
    private PeripheralType peripheralType;

    /**
     * Gets peripheral type.
     *
     * @return the peripheral type
     */
    @Override
    public PeripheralType getPeripheralType() {
        return peripheralType;
    }


    /**
     * Instantiates a new Peripheral implementation.
     *
     * @param peripheralType the peripheral type
     * @param price          the price
     */
    public PeripheralImpl(PeripheralType peripheralType, double price) {
        super(price);
        this.peripheralType = peripheralType;
    }
}
