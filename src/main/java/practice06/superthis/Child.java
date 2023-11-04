package practice06.superthis;

public class Child extends Parent{

public Child(){
    super(2,5);
    System.out.println("Child Class parametresiz Constructor");
}

public Child(int a){
    System.out.println("Child Class tek parametreli Constructor");
}

public Child(int a, int b){
    System.out.println("Child Class iki parametreli Constructor");
}

    public static void main(String[] args) {
        Child obj = new Child();
        Child obj2 = new Child(1);
        Child obj3 = new Child(1,2);



    }





}
