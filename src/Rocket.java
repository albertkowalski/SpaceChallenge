/**
 * Class with methods and variables used by every rocket ship.
 */
public class Rocket implements SpaceShip {
    public long rocketCost;
    int rocketWeight;
    int maxWeight;
    double cargoCarried;
    double cargoLimit;

    /**
     * Launch method - replaced in U1 and U2 rocket classes.
     * @return always true
     */
    public boolean launch() {
        return true;
    }
    /**
     * Land method - replaced in U1 and U2 rocket classes.
     * @return always true
     */
    public boolean land() {
        return true;
    }

    /**
     * Checking if item can be carried by rocket.
     * @param item individual item specification.
     * @return boolean value if item can be inserted into rocket.
     */
    public boolean canCarry(Item item) {
        return !(item.weight + cargoCarried > maxWeight - rocketWeight);
    }
    /**
     * increasing cargo carried by rocket.
     * @param item individual item specification.
     */
    public void carry(Item item) {
        cargoCarried = cargoCarried + item.weight;
    }
}
