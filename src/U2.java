/**
 * Class with U2 rocket data. This rocket is more expensive and less secure, but can carry a lot more cargo.
 */
class U2 extends Rocket {
    {
        rocketCost = 120;
        rocketWeight = 18000;
        maxWeight = 29000;
        cargoCarried = 0;
        cargoLimit = maxWeight - rocketWeight;
    }
    /**
     * Randomized result of rocket launch.
     * @return Boolean value of launch attempt result.
     */
    public boolean launch() {
        return Math.random() >= 0.04 * cargoCarried / cargoLimit;
    }
    /**
     * Randomized result of rocket landing.
     * @return Boolean value of land attempt result.
     */
    public boolean land() {
        return Math.random() >= 0.08 * cargoCarried / cargoLimit;
    }
}