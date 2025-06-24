package pl.pp;

public class Motorcycle extends Vehicle implements FuelType {
    private boolean hasSidecar;
    private FuelType fuelType;

    public Motorcycle(String reg, String vin, String color, double price,
                      double fuelCons, double fuelLevel, double mileage,
                      boolean hasSidecar, FuelType fuelType) {
        super(reg, vin, color, price, fuelCons, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType.getFuelType();
    }
}
