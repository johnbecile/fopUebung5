package h05.model;

/**
 * The type Machine learning rater.
 */
public class MachineLearningRater implements ComponentRater {
    private int capacity;
    private int numTPU;

    /**
     * Instantiates a new Machine learning rater.
     */
    public MachineLearningRater() {
        capacity = 0;
        numTPU = 0;
    }

    /**
     * Check the score of the model.
     *
     * @param modelSize the model size
     * @return the score of the model
     */
    public double checkModel(int modelSize) {
        double TPUFactor = 100 * (100 - 1) * Math.pow(1.02, -numTPU);
        return (double) capacity / modelSize * TPUFactor;
    }

    /**
     * Consume mainboard. DO NOTHING.
     *
     * @param mainboard the mainboard
     */
    @Override
    public void consumeMainboard(Mainboard mainboard) {
    }

    /**
     * Consume CPU. DO NOTHING.
     *
     * @param cpu the CPU
     */
    @Override
    public void consumeCPU(CPU cpu) {
    }

    /**
     * Accumulates the capacity of memory.
     *
     * @param memory the memory
     */
    @Override
    public void consumeMemory(Memory memory) {
        capacity += memory.getCapacity();
    }

    /**
     * Accumulates the number of TPU if the peripheral is TPU.
     *
     * @param peripheral the peripheral
     */
    @Override
    public void consumePeripheral(Peripheral peripheral) {
        if (peripheral.getPeripheralType() == PeripheralType.TPU) {
            numTPU++;
        }
    }
}
