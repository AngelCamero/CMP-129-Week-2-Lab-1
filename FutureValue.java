import java.util.Scanner;
public class FutureValue {
    public static double futureValue(double p, double i, int t){
        double futureValue = p * Math.pow(1  + i, t);

        return futureValue;
    }
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your present amount of money: ");
        double p = keyboard.nextDouble();
        System.out.print("please enter the interest rate: ");
        double i = keyboard.nextDouble();
        System.out.print("Please enter the number of months: ");
        int t = keyboard.nextInt();
        double futureMoney = futureValue(p, i, t);
        System.out.printf("Future value: $%.2f", futureMoney);
        keyboard.close();
    }
}
