package practice01;

public class C02Ortalama {
    public static void main(String[] args) {
        /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
        ortalama nasıl hesaplanır -> tum sayıları topla, sayı adedine böl
     */

        double num1 = 23.4 ;
        double num2 = 24.0 ;
        double num3 = 12 ;
        double num4 = 450.3 ;
        double num5 = 100 ;

        //ilk önce toplami bulalim
        double toplam = num1+num2+num3+num4+num5;
        System.out.println("toplam = " + toplam);
        double ortalama = toplam/5;
        System.out.println("ortalama = " + ortalama);




    } // main method sonu
} //clas sonu
