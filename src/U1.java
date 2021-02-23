/**
 * Class with U1 rocket data. This rocket is cheaper and safer, but can carry lower amount of cargo.
 */
class U1 extends Rocket {
    {
        rocketCost = 100;
        rocketWeight = 10000;
        maxWeight = 18000;
        cargoCarried = 0;
        cargoLimit = maxWeight - rocketWeight;

    }

    /**
     * Randomized result of rocket launch.
     * @return Boolean value of launch attempt result.
     */
    public boolean launch() {
        return Math.random() >= 0.05 * cargoCarried / cargoLimit;
    }
    /**
     * Randomized result of rocket landing.
     * @return Boolean value of land attempt result.
     */
    public boolean land() {
        return Math.random() >= 0.01 * cargoCarried / cargoLimit;
    }
}
