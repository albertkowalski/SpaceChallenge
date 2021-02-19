public class U1 extends Rocket {
    {
        rocketWeight = 10000;
        maxWeight = 18000;
        cargoCarried = 0;
        cargoLimit = maxWeight - rocketWeight;

    }
    public boolean launch() {
        if(Math.random() >= 0.05 * cargoCarried / cargoLimit) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean land() {
        if(Math.random() >= 0.01 * cargoCarried / cargoLimit) {
            return true;
        }
        else {
            return false;
        }
    }
}
