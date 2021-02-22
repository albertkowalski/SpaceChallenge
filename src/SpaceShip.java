/**
 * Interface with methods declaration used by Rocket class.
 */
public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item item);
    void carry(Item item);
}
