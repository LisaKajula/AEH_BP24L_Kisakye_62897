package pl.pp;

public class myNinthApp {
    public static void main(String[] args) {
        Warehouse w = new Warehouse(1, 5000, "John Doe", "john@example.com", "+48 111 111 111");

        w.addGoods(3000);
        w.removeGoods(1000);
        w.addGoods(2500);
        w.checkOccupancy();
        w.updateContact("owner@magazyn.pl", "+48 123 456 789");
        w.addGoods(1000); // should trigger "not enough space"
    }
}


