package h05.model;

/**
 * The type Virtual memory, the capacity of the virtual memory is dynamic.
 */
public class VirtualMemory implements Memory {
    private char capacity;
    private double costPerGigaByte;

    /**
     * Instantiates a new Virtual memory.
     *
     * @param costPerGigaByte the cost of the memory per GigaByte
     */
    public VirtualMemory(double costPerGigaByte) {
        this.costPerGigaByte = costPerGigaByte;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return capacity * costPerGigaByte;
    }

    /**
     * Gets capacity.
     *
     * @return the capacity
     */
    public char getCapacity() {
        return capacity;
    }

    /**
     * Sets capacity of the memory.
     *
     * @param capacity the capacity
     */
    public void setCapacity(char capacity) {
        this.capacity = capacity;
    }

}
