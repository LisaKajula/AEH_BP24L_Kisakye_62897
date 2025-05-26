package pl.pp;

public class Warehouse {
    private int warehouseNumber;
    private int totalSpace;
    private int occupiedSpace;
    private String ownerName;
    private String email;
    private String phoneNumber;

    public Warehouse(int warehouseNumber, int totalSpace, String ownerName, String email, String phoneNumber) {
        this.warehouseNumber = warehouseNumber;
        this.totalSpace = totalSpace;
        this.occupiedSpace = 0;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getWarehouseNumber() { return warehouseNumber; }
    public int getTotalSpace() { return totalSpace; }
    public int getOccupiedSpace() { return occupiedSpace; }
    public String getOwnerName() { return ownerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setWarehouseNumber(int warehouseNumber) { this.warehouseNumber = warehouseNumber; }
    public void setTotalSpace(int totalSpace) { this.totalSpace = totalSpace; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public void addGoods(int units) {
        if (occupiedSpace + units <= totalSpace) {
            occupiedSpace += units;
            System.out.println("Added " + units + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        } else {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        }
    }

    public void removeGoods(int units) {
        if (units <= occupiedSpace) {
            occupiedSpace -= units;
            System.out.println("Removed " + units + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        } else {
            System.out.println("Cannot remove more goods than are currently stored.");
        }
    }

    public void checkOccupancy() {
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + (totalSpace - occupiedSpace) + " units.");
    }

    public void updateContact(String newEmail, String newPhoneNumber) {
        this.email = newEmail;
        this.phoneNumber = newPhoneNumber;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + email);
        System.out.println("New phone number: " + phoneNumber);
    }
}
