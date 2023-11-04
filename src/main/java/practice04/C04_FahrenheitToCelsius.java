package practice04;

import java.util.Scanner;

public class C04_FahrenheitToCelsius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Fahrenheitcinsinden sicaklik degerini giriniz");
        double fahrenheit = scan.nextDouble();
        System.out.println("fahrenheit = " + fahrenheit);
        double celcius = fahrenheitToCelsius(fahrenheit);
        System.out.println("celcius = " + celcius);

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        //formül: c = (f-32)/1.8

        double celcius = (fahrenheit-32)/1.8;
        return celcius;


    }
}
