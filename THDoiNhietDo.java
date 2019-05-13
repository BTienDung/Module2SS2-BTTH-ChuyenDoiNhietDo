package season_2;

import java.util.Scanner;

public class THDoiNhietDo {
    public static void main(String[] args) {
        int choice;

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("0. Exit ");
        System.out.println("Nhap lua chon.");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice){
            case 0:
                break;
            case 1:
                System.out.print("Celsius is: ");
                Scanner scanner1 = new Scanner(System.in);
                double celsius = scanner1.nextDouble();
                System.out.print("Fahrenheit is: ");
                System.out.print(celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.print("Fahrenheit is: ");
                Scanner scanner2 = new Scanner(System.in);
                double Fahrenheit = scanner2.nextDouble();
                System.out.print("Celsius is: ");
                System.out.print(fahrenheitToCelsius(Fahrenheit));
                break;
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        double Fahrenheit = (9/5)*celsius+32;
        return Fahrenheit;
    };

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
};
