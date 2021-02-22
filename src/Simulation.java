import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    static ArrayList items = new ArrayList();
    ArrayList u1Rockets = new ArrayList();
    ArrayList u2Rockets = new ArrayList();
    long budget = 0;

    ArrayList loadItems(File file) throws FileNotFoundException {
        String inputline;
        Scanner fileScanner = new Scanner(file);
        while(fileScanner.hasNextLine()) {
            inputline=(fileScanner.nextLine());
            Item item = new Item();
            String name;
            int weight;
            // Add error handling method for wrong input data
            item.name = inputline.substring(0,inputline.indexOf("="));
            item.weight = Integer.parseInt(inputline.substring(inputline.indexOf("=")+1));
            items.add(item);
        }
        return items;
    }
    ArrayList<Rocket> loadU1() {
        ArrayList loadedItems = new ArrayList(items);
        while (loadedItems.size()>0) {
            U1 rocket = new U1();
            Item item = new Item();
            for (int i = 0; i < loadedItems.size(); i++) {
                item = (Item) loadedItems.get(i);
                if (rocket.canCarry(item)) {
                    rocket.carry(item);
                    loadedItems.remove(i);
                    i--;
                }
            }
            u1Rockets.add(rocket);
        }
        return u1Rockets;
    }
    ArrayList<Rocket> loadU2() {
        ArrayList loadedItems = new ArrayList(items);
        // Looping through items until there are any left
        while (loadedItems.size()>0) {
            U2 rocket = new U2();
            Item item = new Item();
            for (int i = 0; i < loadedItems.size(); i++) {
                item = (Item) loadedItems.get(i);
                if (rocket.canCarry(item)) {
                    rocket.carry(item);
                    loadedItems.remove(i);
                    i--;
                }
            }
            u2Rockets.add(rocket);
        }
        return u2Rockets;
    }
    long runSimulation(ArrayList<Rocket> rockets) {
        long simBudget = 0;
        for (int i=0; i < rockets.size(); i++) {
            Rocket rocket = (Rocket) rockets.get(i);
            while (!(rocket.launch() && rocket.land())) {
                simBudget += rocket.rocketCost;
            }
            simBudget += rocket.rocketCost;
        }
        return simBudget;
    }
}
