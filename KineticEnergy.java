import java.util.Scanner;
public class KineticEnergy {
    public static double kineticEnergy(double mass, double velocity){
            double kE = 0.5 * mass * (velocity * velocity);
            return kE;
        }
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        double mass;
        double velocity;
        double kineticENergy;
        System.out.print("Enter the mass of the object: ");
        mass = keyboard.nextDouble();
        System.out.print("Enter the velocity of the object: ");
        velocity = keyboard.nextDouble();
        kineticENergy = kineticEnergy(mass, velocity);
        System.out.printf("%.2f" kineticENergy);

        keyboard.close();
    }
}
