import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.Iterator;


public class Simulation {
//    Create a Simulation class that is responsible for reading item data and filling up the rockets.
//    The Simulation class should include these methods:
    //    loadItems: this method loads all items from a text file and returns an ArrayList of Items:
    //    Each line in the text file consists of the item name followed by = then its weigh in kg. For example:
    //
    //    habitat=100000
    //    colony=50000
    //    food=50000
    private ArrayList<Item> items;
    private ArrayList<Rocket> rocketU1;
    private ArrayList<Rocket> rocketU2;

    public ArrayList<Item> loadItems(File file) throws FileNotFoundException {
        //    loadItems should read the text file line by line and create an Item object for each and then
        //    add it to an ArrayList of Items. The method should then return that ArrayList.

        items = new ArrayList<>();
        // read input file
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            String[] separated = string.split("="); // parse each line
            Item item = new Item(separated[0], Integer.parseInt(separated[1])); // create item from line
            items.add(item); // add to array
        }
        return items;
    }

    public ArrayList<Rocket> loadU1(List<Item> itemsU1) {
        //    loadU1: this method takes the ArrayList of Items returned from loadItems and starts creating U1 rockets.
        //    It first tries to fill up 1 rocket with as many items as possible before creating a new rocket object
        //    and filling that one until all items are loaded. The method then returns the ArrayList of those U1
        //    rockets that are fully loaded.
        System.out.println("loading U1 rocket...");
        rocketU1 = new ArrayList<>();
        Rocket rocket = new U1();
        Iterator iterator = itemsU1.iterator();

        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rocketU1.add(rocket);
                rocket = new U1();
                System.out.println("New U1 rocket");
                rocket.carry(item);
            }
            if (!iterator.hasNext()) {
                rocketU1.add(rocket);
            }
        }
        return rocketU1;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> itemsU2) {
        System.out.println("loading U2");
        rocketU2 = new ArrayList<>();
        Rocket rocket = new U2();
        Iterator iterator = itemsU2.iterator();

        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rocketU2.add(rocket);
                rocket = new U2();
                System.out.println("New U2 rocket");
                rocket.carry(item);
            }
            if (!iterator.hasNext()) {
                rocketU2.add(rocket);
            }
        }

        return rocketU2;
    }
    public int runSimulation(ArrayList<Rocket> rockets) {
        //    runSimulation: this method takes an ArrayList of Rockets and calls launch and land methods for each
        //    of the rockets in the ArrayList. Every time a rocket explodes or crashes
        //    (i.e if launch or land return false) it will have to send that rocket again. All while keeping track of
        //    the total budget required to send each rocket safely to Mars. runSimulation then returns the total budget
        //    required to send all rockets (including the crashed ones).
        int totalCost = 0;

        for (Rocket currentRocket : rockets) {
            totalCost += currentRocket.getCost();

            while (!currentRocket.launch() || !currentRocket.land()) {
                totalCost += currentRocket.getCost();
            }
        }
        System.out.println("Total cost: $" + totalCost);
        return totalCost;
    }

}
