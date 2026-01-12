import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user for Celsius value
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Perform the conversion
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        
        input.close();
    }
}