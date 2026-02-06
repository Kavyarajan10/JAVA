package toll;
import java.util.Scanner;
public class TollBooth {
    private int totalAmount;
    private int vehicleCount;

    public TollBooth() {
        totalAmount = 0;
        vehicleCount = 0;
    }

    public void addCollection(int amount) {
        totalAmount += amount;
        vehicleCount++;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void resetBooth() {
        totalAmount = 0;
        vehicleCount = 0;
    }
}


