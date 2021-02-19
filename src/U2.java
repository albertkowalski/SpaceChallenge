class U2 extends Rocket {
    {
        rocketWeight = 18000;
        maxWeight = 29000;
        cargoCarried = 0;
        cargoLimit = maxWeight - rocketWeight;
    }
    public boolean launch() {
        if(Math.random() >= 0.04 * cargoCarried / cargoLimit) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean land() {
        if(Math.random() >= 0.08 * cargoCarried / cargoLimit) {
            return true;
        }
        else {
            return false;
        }
    }
}