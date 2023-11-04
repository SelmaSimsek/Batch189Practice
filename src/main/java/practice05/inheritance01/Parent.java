package practice05.inheritance01;

public class Parent {
    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım

    protected static String isim = "Ali"; //static variable

    protected static String soyisim = "Can"; //static method

    protected static void method1() {
        System.out.println("Parent class static method1");
    }
    protected static void method2(){
        System.out.println("Parent class static method2");
    }
    protected int yas = 30; //instance variable

    protected void method3(){ //instance method
        System.out.println("Parent class instance method1");
    }
    protected void method4(){
        System.out.println("Parent class instance method2");
    }










}
