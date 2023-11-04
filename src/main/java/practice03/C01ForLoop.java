package practice03;

import java.util.Scanner;

public class C01ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = input.next();

        //stringdeki ch tek tek ----->chatAt(index)

        int sayac = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'a') {
                sayac++;

            } else if (kelime.charAt(i) == 'c') {
                break;

            } // for loop un sonu
            System.out.println("Ilk c harfine kadar  olan a harflerinin sayisi : " + sayac);
        }
    }
}
