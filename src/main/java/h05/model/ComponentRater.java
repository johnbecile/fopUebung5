package h05.model;

/**
 * The interface Component rater.
 */
public interface ComponentRater {
    /**
     * Consume mainboard.
     *
     * @param mainboard the mainboard
     */
    void consumeMainboard(Mainboard mainboard);

    /**
     * Consume CPU.
     *
     * @param cpu the CPU
     */
    void consumeCPU(CPU cpu);

    /**
     * Consume memory.
     *
     * @param memory the memory
     */
    void consumeMemory(Memory memory);

    /**
     * Consume peripheral.
     *
     * @param peripheral the peripheral
     */
    void consumePeripheral(Peripheral peripheral);
}
