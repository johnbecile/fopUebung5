package h05.model;

/**
 * The type Memory implementation.
 */
public class MemoryImpl extends PurchasedComponent implements Memory {
    private char capacity;

    /**
     * Gets capacity of the memory.
     *
     * @return the capacity of the memory
     */
    @Override
    public char getCapacity() {
        return capacity;
    }


    /**
     * Instantiates a new Memory implementation.
     *
     * @param capacity the capacity
     * @param price    the price
     */
    public MemoryImpl(char capacity, double price) {
        super(price);
        this.capacity = capacity;
    }
}
