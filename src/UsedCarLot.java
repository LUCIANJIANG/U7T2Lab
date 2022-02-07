import java.util.ArrayList;
/**
 * This class represents a used car lot
 *
 * @author Lucian Jiang
 */
public class UsedCarLot {
    /** Creates a new empty inventory */
    private ArrayList<Car> inventory;

    /** Instantiates a UsedCarLot object
     * with an empty inventory.
     */
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    /** Method that returns the Car inventory
     *
     * @return The inventory
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /** Adds a car to the end of the inventory */
    public void addCar(Car car) {
        inventory.add(car);
    }

    /**
     * Swaps the both cars to the other position
     *
     * @param idx1 Current position of first car
     * @param idx2 Current position of second car
     * @return True if swap is successful
     * @return False if swap is unsuccessful
     */
    public boolean swap(int idx1, int idx2) {
        if (idx1 < inventory.size() && idx2 < inventory.size() && idx1 >= 0 && idx2 >= 0) {
            Car car1 = inventory.get(idx1);
            Car car2 = inventory.get(idx2);
            inventory.set(idx1, car2);
            inventory.set(idx2, car1);
            return true;
        } else {
            return false;
        }
    }

    /** Adds a car to the specified position.
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd New position
     * @param carToAdd Name of car
     */
    public void addCar(int indexToAdd, Car carToAdd) {
        inventory.add(indexToAdd, carToAdd);
    }

    /** Sells the car at the given position, removing it,
     * and shifts the inventory to the left. The method will
     * return the car that is being sold.
     *
     * @param indexOfCarToSell Current position of car to sell
     * @return The car sold
     */
    public Car sellCarShift(int indexOfCarToSell) {
        Car sold = inventory.remove(indexOfCarToSell);
        return sold;
    }

    /** Sells a car at the position, and removes it, and replaces it with null.
     *
     * @param indexOfCarToSell Current position of car to sell
     * @return The car sold
     */
    public Car sellCarNoShift(int indexOfCarToSell) {
        Car sold2 = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold2;
    }

    /** Moves a car to the given position.
     *
     * @param indexOfCarToMove Current position of car
     * @param destinationIndex New position
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex) {
        Car moveCar = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, moveCar);
    }
}
