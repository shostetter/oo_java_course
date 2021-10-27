import java.io.File;

class Main {

    public static void main(String[] args) throws Exception {
        //Create a Main class with the main method and start running the simulation:
            //Create a Simulation object
            //Load Items for Phase-1 and Phase-2
            //Load a fleet of U1 rockets for Phase-1 and then for Phase-2
            //Run the simulation using the fleet of U1 rockets and display the total budget required.
            //        Repeat the same for U2 rockets and display the total budget for that.

        Simulation sim = new Simulation();

        File file1 = new File("data/phase-1.txt");
        File file2 = new File("data/phase-2.txt");

        // Run simulation for U1 fleet and display total budget
        int u1SimCost = sim.runSimulation(sim.loadU1(sim.loadItems(file1)));

        // Run simulation for U2 fleet and display total budget
        int u2SimCost = sim.runSimulation(sim.loadU2(sim.loadItems(file2)));

        System.out.println("\n\nTotoal cost for U1 rockets: $" + u1SimCost);
        System.out.println("Totoal cost for U2 rockets: $" + u2SimCost);

    }
}