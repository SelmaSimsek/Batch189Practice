package practice01;

public class C03KimlikBilgileri {
    public static void main(String[] args) {
        /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */
        String isim = "Ali";
        String soyIsim = "Can";
        byte yas = 25 ;
        double boy = 1.80 ;
        byte kilo = 78 ;

        //isim: Ali

        System.out.println("isim : "+isim);
        System.out.println("soyIsim : "+soyIsim);
        System.out.println("yas : "+ yas);

        System.out.println("isim: "+isim +" soyIsim: "+soyIsim + " yas: "+ yas + " boy:" +boy+ " kilo: "+kilo);
        System.out.println("isim: "+isim +"\nsoyIsim: "+soyIsim + "\nyas: "+ yas + "\nboy:" +boy+ "\nkilo: "+kilo);

        // \n isareti imleci konsolda bir alt satira gecirir, "" icinde yazilir.






    } // mein method sonu
} // class sonu
