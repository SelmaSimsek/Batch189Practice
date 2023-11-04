package practice01;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
         /*
    kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("sayi = " + sayi);
        System.out.println("Girdiginiz Sayinin Karesi = " +sayi*sayi +" olarak bulunmustur");







    } //main method sonu
} // class sonu
