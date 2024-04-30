public class Passenger {

    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    } 

    /**
     * Board passenger onto Car c if the car is not full
     * @param c the car requested to board
     */
    public void boardCar (Car c){
        if (c.addPassenger(this)){
            System.out.println(name + " has boarded the car!");
        } else {
            System.out.println("Sorry, this car is full");
        }
    }

    /**
     * Remove passenger from Car c if the passenger exists in the car
     * @param c the car requested to get off from 
     */
    public void getOffCar (Car c){
        if(c.removePassenger(this)){
            System.out.println(name + " has gotten off the car!");
        } else {
            System.out.println(name + " is not in this car");
        }
    }


}

