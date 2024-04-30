import java.util.ArrayList;

public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

    /**
     * Ties all the classes together, creates the Train based on user input
     * @param fuelType Type of fuel
     * @param fuelCapacity The Capacity of the fuel
     * @param nCars The number of cars to create
     * @param passengerCapacity The capacity of passengers on each train 
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        engine = new Engine (fuelType, fuelCapacity);
        cars = new ArrayList<>();
        for (int i =0; i<nCars; i++){
            cars.add(new Car(passengerCapacity));
        }
    }

    public Engine getEngine(){
        return engine;
    }

    // Create number of cars depending on the input number by user
    public Car getCar(int i){
        if (i >= 0 && i< cars.size()){
            return cars.get(i);
        }
        return null;
    }

    // Create a max number of passengers to board each car depending on the input number by user
    public int getMaxCapacity(){
        int maxTotalCapacity = 0;
        for (Car car : cars){
            maxTotalCapacity += car.getCapacity();
        }
        return maxTotalCapacity;
    }

    // Give the number of seats remaining in each car depending on the number of passengers boarded
    public int seatsRemaining(){
        int remainingSeats = 0;
        for (Car car : cars){
            remainingSeats += car.seatsRemaining();
        }
        return remainingSeats;
    }

    // Print the passengers onboard in each of the car numbers
    public void printManifest(){
      int carNumber = 1;
        for (Car car : cars){
          System.out.println("Passengers onboard in train number " + carNumber + ":");
            car.printManifest();
          carNumber ++;
        }
    }
}
