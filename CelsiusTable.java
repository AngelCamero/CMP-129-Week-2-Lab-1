public class CelsiusTable {
    public static double celsius(double fahrenheit){
        double celcius = (5.0 / 9.0) * (fahrenheit - 32);
        return celcius;
    }
    public static void main(String [] args){    
        for (int fahrenheit = 0; fahrenheit <= 20; fahrenheit++){
            double celciusValue = celsius(fahrenheit);
            System.out.printf("%d = %.2f%n", fahrenheit, celciusValue);
        }
    }
}
