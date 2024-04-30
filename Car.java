import java.util.ArrayList;
public class Car {
    private ArrayList<Passenger> passenger;
    private int maxCapacity;

    public Car (int maxCapacity){
        // The array list will store the `Passenger`s currently onboard, and an `int` for the `Car`'s maximum capacity (since `ArrayList`s will expand as we add objects, we'll need to manually limit their size)
        this.passenger = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }
    // Return max capacity
    public int getCapacity(){
        return maxCapacity;
    }

    // Return number of seats remaining
    public int seatsRemaining(){
        return maxCapacity - passenger.size();
    }

    /**
     * Add passengers on the car after checking if there is room to board
     * @param p the name of the passenger to board
     * @return true if boarding passenger was successful, false if train is full
     */
    public boolean addPassenger(Passenger p){
        if (passenger.size() < maxCapacity){
            passenger.add(p);
            return true;
        }
        return false;
    }

    /**
     * Remove passengers from train after checking if passenger is on board
     * @param p name of passenger to remove
     * @return
     */
    public boolean removePassenger(Passenger p){
        return passenger.remove(p);
    }
    // prints out a list of all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one on board).;
    public void printManifest(){
        if (passenger.isEmpty()){
            System.out.println("This car is EMPTY");
        } else {
            for (Passenger passengers : passenger){
                System.out.println(passengers.getName());
            }
        }
    }
}