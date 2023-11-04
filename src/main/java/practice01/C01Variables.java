package practice01;

public class C01Variables {
    public static void main(String[] args) {

        //(int) bir variable(yas)  olustur ve yazdır
        int yas = 33;
        System.out.println(yas);

        //(int) bir variable(sayi)  olustur ve yazdır

        int sayi = 50;
        System.out.println(sayi);
        System.out.println(50);
        System.out.println(50);
        System.out.println(50); // Ctrl+D ile satiri alt alta kopyalayabiliriz

        //konsola sayi = 50 seklinde yazdır
        System.out.println("sayi = " + sayi); //etiketiyle(ismiyle) yazdirma islemi
        System.out.println("sayi = " + sayi); // soutv (kendi etiketiyle yazdirmak icin)

        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        int benimYasim = yas;
        System.out.println("benimYasim = " + benimYasim);

        //String bir variable olusturalım (isim)
        String isim = "Can";


        //isim variable ını etiketıyle yazdır
        System.out.println("isim = " + isim); //soutv

        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        String onunIsmi = isim;

        //onunIsmi variable'ını etiketiyle yazdır
        System.out.println("onunIsmi = " + onunIsmi);

        //isim variable'ının degerini guncelle
        isim = "Ali"; // data type yazmaya gerek yok. yazarsak, java yeni bir variable olusturdugumuzu zanneder.
                        // ayni isimde 2. variable i kabul etmez. sadece variable in adini yazip yeni degerini atayabiliriz.
        System.out.println("isim = " + isim);



        //isim ve onunIsmi variable'larını yazdır
        System.out.println(isim + " "+onunIsmi);






    } // main method sonu

}  //Class sonu
