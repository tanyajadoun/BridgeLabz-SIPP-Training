
import java.util.*;

public class volumeofearth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm = calculateVolume(radiusKm);
        double volumeMiles = convertToMiles(volumeKm);

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }

    public static double calculateVolume(double r) {
        return (4.0 / 3) * Math.PI * Math.pow(r, 3);
    }

    public static double convertToMiles(double volumeKm) {
        return volumeKm / Math.pow(1.609, 3);
    }
}
