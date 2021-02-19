import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    ArrayList loadItems(File file) throws FileNotFoundException {
        ArrayList items = new ArrayList();
        String inputline;
        Scanner fileScanner = new Scanner(file);
        while(fileScanner.hasNextLine()) {
            inputline=(fileScanner.nextLine());
            Item item = new Item();
            String name;
            int weight;
            // Add error handling method for wrong input data
            item.name = inputline.substring(0,inputline.indexOf("=")-1);
            item.weight = (inputline.indexOf("=")+1);
            items.add(item);
        }
        return items;
    }
//    ArrayList loadU1(ArrayList items) {
//        for (name : items) {
//
//        }
//}
}
