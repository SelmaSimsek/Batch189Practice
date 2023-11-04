package practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ödev {
    public static void main(String[] args) {
         /*
        Kulanıcıdan alınan bir tam sayı kadar(47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun
        Ör: sayi=10 için
        0-1-1-2-3-5-8-13-21-34 gibi
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı girin (47'den küçük): ");
        int sayi = scanner.nextInt();

        if (sayi <= 0 || sayi >= 47) {
            System.out.println("Lütfen geçerli bir sayı girin.");
        } else {
            ArrayList<Integer> fibDizisi = fibonacci(sayi);
            System.out.print("Fibonacci dizisi: ");
            for (int fib : fibDizisi) {
                System.out.print(fib + " ");
            }
        }
    }

    public static ArrayList<Integer> fibonacci(int sayi) {
        ArrayList<Integer> fibSeq = new ArrayList<>();
        fibSeq.add(0);
        fibSeq.add(1);

        while (fibSeq.size() < sayi) {
            int nextFib = fibSeq.get(fibSeq.size() - 1) + fibSeq.get(fibSeq.size() - 2);
            if (nextFib < 47) {
                fibSeq.add(nextFib);
            } else {
                break;
            }
        }

        return fibSeq;
    }
}











       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 47'den kücük bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi <= 0 || sayi >= 47) {
            System.out.println("Lütfen geçerli bir sayı girin.");
        } else {
            ArrayList<Integer> fibDizisi = new ArrayList<>(sayi);
            System.out.print("Fibonacci dizisi: ");
            for (int fib : fibDizisi) {
                System.out.print(fib + " ");
            }


        } */



