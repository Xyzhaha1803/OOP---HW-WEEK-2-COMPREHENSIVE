/* Temperature Converter with Constants
Create a class TemperatureConverter that uses a final constant for the formula to convert Celsius to Fahrenheit.
Accept a temperature from the user (using Scanner) and display both Celsius and Fahrenheit values */

import java.util.Scanner;

class TemperatureConverter{
    final double multi = 9.0/5.0;
    final double add = 32.0;

    public double conversion(double celsius){
        double result = (celsius * multi) + add;

        System.out.println("Celsius reading: " + celsius);
        System.out.println("Fahrenheit conversion: " + result);

        return result;
    }
}

public class Q01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter celsius reading: ");
        double reading = scanner.nextDouble();

        TemperatureConverter convert = new TemperatureConverter();

        convert.conversion(reading);
    }
}