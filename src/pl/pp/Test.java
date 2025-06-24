package pl.pp;

public class RentalTest {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("ABC123", "VIN123", "Red", 20000, 6.5, 40, 12000, 4, new Gasoline());
        Truck truck = new Truck("TRK456", "VIN456", "Blue", 50000, 15, 100, 80000, 10, new Diesel());
        Motorcycle moto = new Motorcycle("MOT789", "VIN789", "Black", 8000, 3.5, 15, 5000, false, new Gasoline());
        ConstructionEquipment equip = new ConstructionEquipment("EQP001", "VIN001", "Yellow", 120000, 20, 200, 1000, 500, new Diesel());

        car.drive(100);
        car.refuel(20);
        System.out.println("Car fuel type: " + car.getFuelType());

        truck.drive(150);
        System.out.println("Truck fuel type: " + truck.getFuelType());

        moto.drive(50);
        System.out.println("Motorcycle fuel type: " + moto.getFuelType());

        equip.drive(30);
        System.out.println("Equipment fuel type: " + equip.getFuelType());
    }
}
