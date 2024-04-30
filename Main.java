
public class Main {
    public static void main(String[] args) {
            Train train = new Train(FuelType.STEAM, 1000.0, 2, 1);
            Passenger ayano = new Passenger("Ayano");
            Passenger isha = new Passenger ("Isha");
    
            ayano.boardCar(train.getCar(0));
            isha.boardCar(train.getCar(0));
            ayano.getOffCar(train.getCar(0));
    
            train.printManifest();
    
    
        }
}
