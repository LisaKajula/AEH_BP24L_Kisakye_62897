package pl.pp;

public class Truck extends Vehicle implements FuelType {
    private double loadCapacity;
    private FuelType fuelType;

    public Truck(String reg, String vin, String color, double price,
                 double fuelCons, double fuelLevel, double mileage,
                 double loadCapacity, FuelType fuelType) {
        super(reg, vin, color, price, fuelCons, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType.getFuelType();
    }
}

