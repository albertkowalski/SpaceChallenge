public class Rocket implements SpaceShip {
    public long rocketCost;
    int rocketWeight;
    int maxWeight;
    double cargoCarried;
    double cargoLimit;
    public boolean launch() {
        return true;
    }
    public boolean land() {
        return true;
    }
    public boolean canCarry(Item item) {
        if(item.weight + cargoCarried > maxWeight - rocketWeight) {
            return false;
        }
        else {
            return true;
        }
    }
    public void carry(Item item) {
        cargoCarried += item.weight;
    }
}
