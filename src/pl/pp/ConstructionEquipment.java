package pl.pp;

public class ConstructionEquipment extends Vehicle implements FuelType {
    private int hoursWorked;
    private FuelType fuelType;

    public ConstructionEquipment(String reg, String vin, String color, double price,
                                 double fuelCons, double fuelLevel, double mileage,
                                 int hoursWorked, FuelType fuelType) {
        super(reg, vin, color, price, fuelCons, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType.getFuelType();
    }
}
