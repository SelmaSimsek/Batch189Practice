package practice06.firin;

public class KepekliEkmek implements Ekmek{

    //kepekli ekmekler % 9 kepek, %50 un, %38 su, %1.5 tuz, %1.5 maya kullanılıyor
    //    ve yuvarlak sekilli uretiliyor

    @Override
    public void un() {
        System.out.println("Kepekli ekmek %50 un icerir");

    }

    @Override
    public void su() {
        System.out.println("Kepekli ekmek %38 su icerir");

    }

    @Override
    public void tuz() {
        System.out.println("Kepekli ekmek %1,5 tuz icerir");

    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmek %1,5 maya icerir");

    }
    public void sekil(){
        System.out.println("Kepekli ekmek yuvarlak sekillidir");
    }
    public void kepek(){
        System.out.println("Kepekli ekmek %9 kepek icerir");
    }

}
