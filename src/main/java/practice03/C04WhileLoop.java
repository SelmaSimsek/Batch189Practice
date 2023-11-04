package practice03;

import java.util.Scanner;

public class C04WhileLoop {
    public static void main(String[] args) {
        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar
        // ardısık yazdırınız
        // Not: While loop kullanınız
        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scan.nextInt(); //baslangic degeri

        while (sayi%10!=0){ //sayi 10 un kati oldugu anda loop bitecek, 10un kati olmadigi müddetce devam ederek
            System.out.print(sayi+ " ");

            sayi++;

        }
    }
}
