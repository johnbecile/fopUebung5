package h05.model;

/**
 * The type Mainboard implementation.
 */
public class MainboardImpl extends PurchasedComponent implements Mainboard {
    private CPU cpu;
    private Memory[] memories;
    private Peripheral[] peripherals;
    private Socket socket;

    /**
     * Instantiates a new Mainboard.
     *
     * @param socket                  the socket
     * @param numberOfMemorySlots     the number of memory slots
     * @param numberOfPeripheralSlots the number of peripheral slots
     * @param price                   the price
     */
    public MainboardImpl(Socket socket, int numberOfMemorySlots, int numberOfPeripheralSlots, double price) {
        super(price);
        this.socket = socket;
        this.memories = new Memory[numberOfMemorySlots];
        this.peripherals = new Peripheral[numberOfPeripheralSlots];
    }

    /**
     * Add a CPU chip to the mainboard.
     *
     * @param cpu the CPU chip
     * @return the boolean true if the CPU chip was added, false otherwise
     */
    public boolean addCPU(CPU cpu) {
        if ((cpu != null) && (this.cpu == null) && (cpu.getSocket() == this.socket)) {
            this.cpu = cpu;
            return true;
        }
        return false;
    }

    /**
     * Add a memory chip to the mainboard.
     *
     * @param memory the memory chip
     * @return the boolean true if the memory chip was added, false otherwise
     */
    public boolean addMemory(Memory memory) {
        if (memory != null) {
            for (int i = 0; i < this.memories.length; i++) {
                if (memories[i] == null) {
                    memories[i] = memory;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Add peripheral to the mainboard.
     *
     * @param peripheral the peripheral
     * @return the boolean true if the peripheral was added, false otherwise
     */
    public boolean addPeripheral(Peripheral peripheral) {
        if (peripheral != null) {
            for (int i = 0; i < this.peripherals.length; i++) {
                if (peripherals[i] == null) {
                    peripherals[i] = peripheral;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Rate by the given rater. The rater consumes the mainboard, the CPU, the
     * memories and the peripherals.
     *
     * @param rater the rater
     */
    @Override
    public void rateBy(ComponentRater rater) {
        rater.consumeMainboard(this);
        if (this.cpu != null) {
            rater.consumeCPU(this.cpu);
        }
        for (Memory memory : this.memories) {
            if (memory != null) {
                rater.consumeMemory(memory);
            }
        }
        for (Peripheral peripheral : this.peripherals) {
            if (peripheral != null) {
                rater.consumePeripheral(peripheral);
            }
        }
    }
}
