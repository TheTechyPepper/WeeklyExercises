package week5.Section20;

import java.util.Scanner;

public class VehicleFuelTypeAdvisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Vehicle Fuel Type Advisor!");
        System.out.println("Enter your vehicle type (Sedan, SUV, Truck, Motorcycle):");
        String vehicleType = sc.nextLine();

        switch (vehicleType) {
            case "Sedan":
            case "SUV":
                System.out.println("Enter your typical driving habits (City, Highway, Mixed):");
                String drivingHabits = sc.nextLine();
                switch (drivingHabits) {
                    case "City":
                        System.out.println("Recommended Fuel Type: Electric");
                }
            case "Truck":
            case " Motorcycle":

        }
    }
}
