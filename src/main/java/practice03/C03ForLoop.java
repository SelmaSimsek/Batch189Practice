package practice03;

import java.util.Scanner;

public class C03ForLoop {
    public static void main(String[] args) {
        /*
       Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
       ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen satir sayisi giriniz");
        int satirSayisi = scan.nextInt();


        for (int i = 0; i < satirSayisi; i++) { //bu loop satirlar icin
            for (int j = 0; j <=i ; j++) { //bu loop sütunlar icin
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
