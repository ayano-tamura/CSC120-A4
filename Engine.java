public class Engine {
    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;

    /**
     * Create Engine and fill engine as needed
     * @param fuelType Type of fuel to be used
     * @param maxFuel Store current and maximum fuel levels
     */
    public Engine (FuelType fuelType, double maxFuel){
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuel = maxFuel;
    }

    // Refuel the engine fuel to the max as needed
    public void refuel(){
        this.currentFuel = maxFuel;
    }

    public boolean go(){
        if(currentFuel > 0){
            // print some useful information
            System.out.println("Remaining Fuel Level:"+ currentFuel);
            // decrease the current fuel level
            currentFuel -= 10;
            // return True if the fuel level is above 0
            return true;
        } else {
            // return False otherwise
            return false;
        }
    }
    // public static void main(String[] args) {
    //     Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    //     while (myEngine.go()) {
    //         System.out.println("Choo choo!");
    //     }
    //     System.out.println("Out of fuel.");
    // }
}