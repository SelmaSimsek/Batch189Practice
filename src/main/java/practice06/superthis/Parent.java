package practice06.superthis;

public class Parent {
    // Parent isminde bir class olusturunuz
    // Child class'ı, Parent class'a extends ediniz
    // Child class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent' den ekran cıktısı alınız


    public Parent() {
        System.out.println("Parent Class parametresiz Constructor");
    }

    public Parent(int a){
        System.out.println("Parent Class tek parametreli Constructor");

    }

    public Parent(int a, int b){
        this();
        System.out.println("Parent Class  ikiparametreli Constructor");

    }









}
