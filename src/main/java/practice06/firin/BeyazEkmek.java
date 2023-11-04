package practice06.firin;

public abstract class BeyazEkmek implements Ekmek {

    //beyaz ekmekler  %59 un, %38 su, %1.5 maya kullanılıyor
    //cicek ekmek beyaz ekmek oz ek olarak % 1 tuz içeriyor ve çiçek seklinde oluyor
    //Somun ekmek beyaz ekmek oz ek olarak %1.5 tuz içeriyor ve ince uzun seklinde oluyor


    @Override
    public void un() {
        System.out.println("Beyaz Ekmek %59 un icerir");
    }

    @Override
    public void su() {
        System.out.println("Beyaz ekmek %38 su icerir");

    }

    @Override
    public void maya() {
        System.out.println("Beyaz Ekmek %1,5 maya icerir");
    }

    public abstract void sekil();


    }

