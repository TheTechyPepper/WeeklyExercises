package week5_and_6.Section12;// Claener Version with slight help from ChatGPT

import java.util.Scanner;

public class Marathon_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your health status (good/bad):");
        String healthStatus = sc.nextLine();


        if (!healthStatus.equals("good") && !healthStatus.equals("bad")) {
            System.out.println("Wrong entry for health status");
        } else {
            if (healthStatus.equals("bad")) {
                System.out.println("We recommend you to participate in the marathon by walking and running as much as you can");
            }
            else if (healthStatus.equals("good")) {
                System.out.println("Enter your fitness level (high/medium/low):");
                String fitnessLevel = sc.nextLine();
                if (!fitnessLevel.equals("low") && !fitnessLevel.equals("medium") && !fitnessLevel.equals("high")) {
                    System.out.println("Wrong entry for fitness level");
                }
                else if (fitnessLevel.equals("high")) {
                    System.out.println("We recommend you to prepare for a full marathon");
                }
                else if (fitnessLevel.equals("medium")) {
                    System.out.println("We recommend you to prepare for a half marathon");
                }
                else if (fitnessLevel.equals("low")) {
                    System.out.println("We recommend you to prepare for a 5k run");
                }
            }
        }
    }
}