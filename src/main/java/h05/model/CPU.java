package h05.model;

/**
 * The interface CPU.
 */
public interface CPU extends Component {
    /**
     * Gets socket.
     *
     * @return the socket
     */
    Socket getSocket();

    /**
     * Gets num of cores.
     *
     * @return the num of cores
     */
    int getNumberOfCores();

    /**
     * Gets frequency.
     *
     * @return the frequency
     */
    double getFrequency();
}
