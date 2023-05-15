import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        int valueChoice;
        do {
            System.out.printf("Lua chon cua ban: ");
            valueChoice = input.nextInt();
            switch (valueChoice) {
                case 1:
                    toCelsius();
                    break;
                case 2:
                    toFahrenheit();
                    break;
                case 0:
                    System.out.println("Ban da thoat khoi chuong trinh!!!");
                    break;
                default:
                    System.out.println("Vui long chon lai!!!");
            }
        }while (valueChoice != 0);
    }

    public static void toFahrenheit(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap nhiet do Celsius: ");
        double valueCelsius = input.nextInt();
        double toFahrenheit = (valueCelsius * 1.8) + 32;
        System.out.println(valueCelsius + " C = " + toFahrenheit + " F");
    }
    public static void toCelsius(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap nhiet do Fahrenheit: ");
        double valueFahrenheit = input.nextInt();
        double toCelsius = (valueFahrenheit - 32) / 1.8;
        System.out.println(valueFahrenheit + " F =" + toCelsius + " C");
    }
}