package h05.model;

/**
 * The type Total cost rater.
 */
public class TotalCostRater implements ComponentRater {
    private double cost;

    /**
     * Instantiates a new Total cost rater.
     */
    public TotalCostRater() {
        cost = 0;
    }

    /**
     * Gets total price.
     *
     * @return the total price
     */
    public double getTotalPrice() {
        return cost;
    }

    /**
     * Accumulates the total cost with consume mainboard.
     *
     * @param mainboard the mainboard
     */
    @Override
    public void consumeMainboard(Mainboard mainboard) {
        cost += mainboard.getPrice();
    }

    /**
     * Accumulates the total cost with consume CPU.
     *
     * @param cpu the CPU
     */
    @Override
    public void consumeCPU(CPU cpu) {
        cost += cpu.getPrice();
    }

    /**
     * Accumulates the total cost with consume memory.
     *
     * @param memory the memory
     */
    @Override
    public void consumeMemory(Memory memory) {
        cost += memory.getPrice();
    }

    /**
     * Accumulates the total cost with consume peripheral.
     *
     * @param peripheral the peripheral
     */
    @Override
    public void consumePeripheral(Peripheral peripheral) {
        cost += peripheral.getPrice();
    }
}
