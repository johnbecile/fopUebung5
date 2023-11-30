package h05.model;

import java.util.ArrayList;

/**
 * The type Server center with multiple mainboards.
 */
public class ServerCenter implements Configuration {

    private ArrayList<Mainboard> mainboards = new ArrayList<>();

    /**
     * Add mainboard to the server center.
     *
     * @param mainboard the mainboard
     */
    public void addMainboard(Mainboard mainboard) {
        mainboards.add(mainboard);
    }

    /**
     * Rate by the given rater.
     *
     * @param rater the rater
     */
    @Override
    public void rateBy(ComponentRater rater) {
        for (Mainboard mainboard : mainboards) {
            mainboard.rateBy(rater);
        }
    }
}
