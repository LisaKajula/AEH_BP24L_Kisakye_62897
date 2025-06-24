package pl.pp;

public class PassengerCar extends Vehicle implements FuelType {
    private int numberOfDoors;
    private FuelType fuelType;

    public PassengerCar(String reg, String vin, String color, double price,
                        double fuelCons, double fuelLevel, double mileage,
                        int doors, FuelType fuelType) {
        super(reg, vin, color, price, fuelCons, fuelLevel, mileage);
        this.numberOfDoors = doors;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType.getFuelType();
    }
}
