package ru.job4j.poly;

public class Bus implements Transport {
    private int numOfPass;
    private int fuelQuantity = 0;
    private int balance = 5000;

    @Override
    public void go() {
        if (fuelQuantity > 0) {
            System.out.println("Go travel");
        } else {
            System.out.println("No fuel");
        }
    }

    @Override
    public void passengers(int numOfPass) {
        this.numOfPass = numOfPass;
        System.out.println("Passengers put on the bus: " + numOfPass);
    }

    @Override
    public int tankUp(int fuelQuantity) {
        System.out.println("Balance before refueling: "
                + balance + " and the amount of gasoline: " + this.fuelQuantity);
        this.fuelQuantity = fuelQuantity;
        balance -= fuelQuantity * 10;
        return balance;
    }

    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.passengers(20);
        int money = bus.tankUp(100);
        System.out.println("Balance after refueling 100 liters: " + money);
        bus.go();
    }
}
