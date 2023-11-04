package practice05.inheritance02;

public class Corsa extends Opel {

    String hiz = "Corsa arabalar max 200 km hiz yapar";

    String yakit = "Corsa arabalar benzinli veya elektriklidir";

    String model = "Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanir");
    }

    @Override
    protected void yakitTükatimi() {
        System.out.println("Corsa arabalar 5.6lt yakit tüketir");

    }

    protected void vitesSayisi() {
        System.out.println("Corsalar 5 viteslidir");

    }

    public static void main(String[] args) {
        //Corsa objesi olusturalim
        Corsa arb1 = new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);
        System.out.println("arb1.hiz = " + arb1.hiz);
        System.out.println("arb1.yakit = " + arb1.yakit);
        System.out.println("arb1.marka = " + arb1.marka);
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);
        System.out.println("arb1.model = " + arb1.model);
        arb1.motor();//corsa

        Opel arb2 = new Corsa();
        System.out.println("arb2.hareket = " + arb2.hareket);
        System.out.println("arb2.hiz = " + arb2.hiz);
        System.out.println("arb2.yakit = " + arb2.yakit);
        System.out.println("arb2.marka = " + arb2.marka);
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);
        //variablelerde tek asama var buldugunu getirir
        //methodlarda 2 asama var önce bulur sonra override edilmis mi diye bakar
        // override edilmis olani getirir.


        arb2.motor();
        /*
        ingeritance da variablelar;
        aramaya data turunden baslanir, bulamazsa parent a bakar,
        ilk buldugunu getirir
         */
        /*
        inheritance da nethodlar;
        aramaya data türünden baslanir, bulamazsa parent a bakar.
        ilk buldugu yerden almaz, constructorin oldugu yere kadar override
        edilmis mi diye bakar ve son buldugunu getirir
         */
        //arama islemi asagidan yukariya dogrudur
        //override kontrol islemi yukaridan asagiya dogrudur

        arb2.garanti();//opel
        arb2.yakitTükatimi();//corsa
        // arb2.vitesSayisi();  //CTE opelden aramaya basladigi icin bulamaz


        Araba arb3 = new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket);
        System.out.println("arb3.hiz = " + arb3.hiz);
        System.out.println("arb3.yakit = " + arb3.yakit);
        //arb3.model CTE
        arb3.motor();
        arb3.yakitTükatimi();
        //arb3.garanti

        Araba arb4 = new Opel();
        System.out.println("arb4.hiz = " + arb4.hiz);
        System.out.println("arb4.yakit = " + arb4.yakit);

        arb4.motor();//opel
        arb4.yakitTükatimi();//araba

        // arb4.garanti(); CTE






    }
}




