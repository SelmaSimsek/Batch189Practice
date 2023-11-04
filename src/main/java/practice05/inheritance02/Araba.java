package practice05.inheritance02;

public class Araba {
    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.

  //tüm arabalar icin ortak olan özellikleri variable olarak tanimlayalim

    String hareket = "Arabalar teker ile hareket eder";
    String marka = "Arabalar üretildikleri markaya sahiptir";
    String hiz = "Arabalar motor gücüne göre hareket eder";
    String yakit = "Arabalar farkli türde yakitlar kullanirlar";

    //tüm arabalar icin ortak özellikleri method olarak yazalim
    protected void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");

    }

    protected void yakitTükatimi(){
        System.out.println("Arabalar motor gücüne ve yakit türüne göre yakit kullanirlar");
    }



}
