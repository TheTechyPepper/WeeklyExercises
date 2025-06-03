package week5.Section20;

import java.util.Scanner;

public class GPU_CPU_RAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a computer component (CPU, GPU, RAM, storage):");
        String component = sc.nextLine();
        System.out.println("Enter a computer type (desktop, laptop):");
        String type = sc.nextLine();

        switch (component) {
            case "CPU":
                switch (type) {
                    case "desktop":
                        System.out.println("The AMD Ryzen 9 5950X is a popular CPU choice for high-performance desktops");
                        break;
                    case "laptop":
                        System.out.println("The Intel Core i7 is a popular CPU choice for high-performance laptops");
                        break;
                    default:
                        System.out.println("Invalid computer type");
                }
                break;
            case "GPU":
                switch (type) {
                    case "desktop":
                        System.out.println("The NVIDIA GeForce RTX 3090 is a popular GPU choice for high-performance desktops");
                        break;
                    case "laptop":
                        System.out.println("The NVIDIA GeForce RTX 3080 is a popular GPU choice for high-performance laptops");
                        break;
                    default:
                        System.out.println("Invalid computer type");
                }
                break;
            case "RAM":
                switch (type) {
                    case "desktop":
                        System.out.println("The G.SKILL Trident Z RGB is a popular RAM choice for high-performance desktops");
                        break;
                    case "laptop":
                        System.out.println("he Corsair Vengeance SODIMM is a popular RAM choice for high-performance laptops");
                        break;
                    default:
                        System.out.println("Invalid computer type");
                }
                break;
            case "storage":
                switch (type) {
                    case "desktop":
                        System.out.println("The Samsung 970 EVO Plus is a popular storage choice for high-performance desktops");
                        break;
                    case "laptop":
                        System.out.println("he Western Digital Black SN750 is a popular storage choice for high-performance laptops");
                        break;
                    default:
                        System.out.println("Invalid computer type");
                }
                break;
            default:
                System.out.println("Invalid computer component");
        }
    }
}
