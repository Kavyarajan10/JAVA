package toll;
import java.util.Scanner;

public class Vehicle {
    Scanner sc = new Scanner(System.in);
    TollBooth booth;

    public Vehicle(TollBooth booth) {
        this.booth = booth;
    }

    public void processVehicle() {
        System.out.println("Select vehicle type");
        System.out.println("1. Car");
        System.out.println("2. Bus");
        System.out.println("3. Truck");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter vehicle number");
        String vehicleNumber = sc.nextLine();

        int fee = 0;

        switch (choice) {
            case 1:
                fee = 50;
                break;
            case 2:
                fee = 100;
                break;
            case 3:
                fee = 150;
                break;
            default:
                System.out.println("Invalid vehicle type");
                return;
        }

        System.out.println("Calculate toll fee: ₹" + fee);

        System.out.println("Apply discount/pass (1.Yes 2.No)");
        int pass = sc.nextInt();

        if (pass == 1) {
            fee = 0;
            System.out.println("Pass applied. Toll fee waived.");
        }

        booth.addCollection(fee);

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Toll Collected: ₹" + fee);
    }

    public void showSummary() {
        System.out.println("Daily collection total: ₹" + booth.getTotalAmount());
        System.out.println("Vehicle count: " + booth.getVehicleCount());
    }

    public void reset() {
        booth.resetBooth();
        System.out.println("Booth data reset successfully");
    }
}


