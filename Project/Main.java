package toll;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TollBooth booth = new TollBooth();
        Vehicle service = new Vehicle(booth);

        while (true) {
            System.out.println("Toll Booth Collection System");
            System.out.println("1. Select vehicle type");
            System.out.println("2. Daily collection total");
            System.out.println("3. Vehicle count");
            System.out.println("4. Reset booth data");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.processVehicle();
                    break;
                case 2:
                    service.showSummary();
                    break;
                case 3:
                    System.out.println("Vehicle count: " + booth.getVehicleCount());
                    break;
                case 4:
                    service.reset();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

