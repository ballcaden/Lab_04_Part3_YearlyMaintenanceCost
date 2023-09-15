import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double springMaintenanceCost;
    double summerMaintenanceCost;
    double fallMaintenanceCost;
    double winterMaintenanceCost;
    double maintenanceCost;

    System.out.println("Enter your spring maintenance cost: ");
    springMaintenanceCost = scan.nextDouble();
    System.out.println("Enter your summer maintenance cost: ");
    summerMaintenanceCost = scan.nextDouble();
    System.out.println("Enter your fall maintenance cost: ");
    fallMaintenanceCost = scan.nextDouble();
    System.out.println("Enter your winter maintenance cost: ");
    winterMaintenanceCost = scan.nextDouble();
    maintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;
    System.out.println("Your yearly maintenance cost is: " + maintenanceCost + "$");

    }
}