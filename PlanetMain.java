import java.util.Scanner;

public class PlanetMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Planet planet = new Planet();

        System.out.print("Enter Planet Name: ");
        planet.name = input.nextLine();
        System.out.print("Enter Diameter (km): ");
        planet.diameter = input.nextDouble();
        System.out.print("Enter Mass (kg): ");
        planet.mass = input.nextDouble();
        System.out.print("Enter Distance from Sun (million km): ");
        planet.distanceFromSun = input.nextDouble();
        System.out.print("Enter Orbital Period (days): ");
        planet.orbitalPeriod = input.nextDouble();
        System.out.print("Enter Number of Moons: ");
        planet.moons = input.nextInt();
        input.nextLine();
        System.out.print("Enter Atmosphere Composition: ");
        planet.atmosphere = input.nextLine();

        System.out.println("\nPlanet Details:");
        System.out.println("Name: " + planet.name);
        System.out.println("Diameter: " + planet.diameter + " km");
        System.out.println("Mass: " + planet.mass + " kg");
        System.out.println("Distance from Sun: " + planet.distanceFromSun + " million km");
        System.out.println("Orbital Period: " + planet.orbitalPeriod + " days");
        System.out.println("Moons: " + planet.moons);
        System.out.println("Atmosphere: " + planet.atmosphere);
    }
}
