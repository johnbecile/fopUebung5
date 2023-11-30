package h05;

import h05.model.*;

import static org.tudalgo.algoutils.student.test.StudentTestUtils.*;

/**
 * Main entry point in executing the program.
 */
public class Main {
    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        // H4.1
        MainboardImpl mainboard1 = new MainboardImpl(Socket.AM4, 2, 2, 100);
        CPUImpl cpu = new CPUImpl(Socket.AM4, 10, 3.3, 300);
        MemoryImpl memory = new MemoryImpl((char) 8, 60);
        PeripheralImpl graficCard = new PeripheralImpl(PeripheralType.GPU, 300);
        mainboard1.addCPU(cpu);
        mainboard1.addMemory(memory);
        mainboard1.addPeripheral(graficCard);
        TotalCostRater totalCostRater1 = new TotalCostRater();
        mainboard1.rateBy(totalCostRater1); // 100 + 300 + 60 + 300 = 760
        MachineLearningRater machineLearningRater = new MachineLearningRater();
        mainboard1.rateBy(machineLearningRater);

        testWithinRange(759.99, 760.01, totalCostRater1.getTotalPrice());
        testWithinRange(791.99, 792.01, machineLearningRater.checkModel(100));

        // H4.2
        VirtualMemory virtualMemory = new VirtualMemory(10);
        MainboardImpl mainboard2 = new MainboardImpl(Socket.AM4, 2, 2, 100);
        mainboard2.addCPU(cpu);
        virtualMemory.setCapacity((char) 8); // new memory costs 8 * 10 = 80 euro
        mainboard2.addMemory(virtualMemory);
        mainboard2.addPeripheral(graficCard);
        TotalCostRater totalCostRater2 = new TotalCostRater();
        mainboard2.rateBy(totalCostRater2); // 100 + 300 + 80 + 300 = 780
        testWithinRange(779.99, 780.01, totalCostRater2.getTotalPrice());

        // H4.3
        ServerCenter serverCenter = new ServerCenter();
        serverCenter.addMainboard(mainboard1);  // 760
        serverCenter.addMainboard(mainboard2);  // 780
        TotalCostRater totalCostRater3 = new TotalCostRater();
        serverCenter.rateBy(totalCostRater3);   // 760 + 780 = 1540
        testWithinRange(1539.99, 1540.01, totalCostRater3.getTotalPrice());
    }
}
