package practice04;

public class C05_Varargs {
    public static void main(String[] args) {
        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun
        // bu methodun access modifier'ını public yapıp aynı packagagedeki
        // faklı bir classdan calıstırınız
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Hakan";
        String str4 = "Abdurrahman";
        String str5 = "Melike";
        String str6 = "Gülistan";

        enUzunKelime (str1,str2,str3,str4,str5,str6);

    }

    public static void enUzunKelime(String...str) {
      String enUzunKelime = "";

        for (String each:str) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);
    }
}
