package h05.model;

/**
 * The type CPU implementation.
 */
public class CPUImpl extends PurchasedComponent implements CPU {
    private Socket socket;
    private int numOfCores;
    private double frequency;

    /**
     * Gets socket of the CPU.
     *
     * @return the socket of the CPU
     */
    @Override
    public Socket getSocket() {
        return socket;
    }

    /**
     * Gets num of cores of the CPU.
     *
     * @return the num of cores of the CPU
     */
    public int getNumberOfCores() {
        return numOfCores;
    }

    /**
     * Gets frequency of the CPU.
     *
     * @return the frequency of the CPU
     */
    @Override
    public double getFrequency() {
        return frequency;
    }

    /**
     * Instantiates a new CPU implementation.
     *
     * @param socket     the socket
     * @param numOfCores the num of cores
     * @param frequency  the frequency
     * @param price      the price
     */
    public CPUImpl(Socket socket, int numOfCores, double frequency, double price) {
        super(price);
        this.socket = socket;
        this.numOfCores = numOfCores;
        this.frequency = frequency;
    }
}
