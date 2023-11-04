package practice06.firin;

public class CicekEkmek extends BeyazEkmek{

    //cicek ekmek beyaz ekmek oz ek olarak % 1 tuz içeriyor ve çiçek seklinde oluyor

    @Override
    public void sekil() {
        System.out.println("Cicek ekmek cicekseklinde olur");
    }

    @Override
    public void tuz() {
        System.out.println("Cicek ekmek %1 tuz icerir");


    }
}
