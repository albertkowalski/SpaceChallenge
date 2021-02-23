import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        U1 u1 = new U1();
        Item item;
        u1.cargoCarried = 5000;
        System.out.println(u1.cargoCarried);
        System.out.println(u1.cargoLimit);
        System.out.println(u1.launch());
        File file = new File("/src/phase-1.txt");
        Simulation simulation = new Simulation();
        System.out.println(simulation.loadItems(file));
        System.out.println(simulation.loadU1().size());
        System.out.println(simulation.loadU2().size());
        System.out.println(simulation.runSimulation(simulation.u1Rockets));
        System.out.println(simulation.runSimulation(simulation.u2Rockets));

        File file2 = new File("/src/phase-2.txt");
        Simulation simulation2 = new Simulation();
        System.out.println(simulation2.loadItems(file));
        System.out.println(simulation.loadU1().size());
        System.out.println(simulation.loadU2().size());
        System.out.println(simulation2.runSimulation(simulation.u1Rockets));
        System.out.println(simulation2.runSimulation(simulation.u2Rockets));

    }
}