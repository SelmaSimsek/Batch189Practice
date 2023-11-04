package practice06;

public class C01Encapsulation {
    /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */

    private String isim;

    private String soyisim;

    private int yas;

//parametreli constructor


    public C01Encapsulation(String isim, String soyisim, int yas) {
        if (isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') {
            this.isim = isim;
        } else {
            System.out.println("Isim büyük harfle baslamali");
        }

        if (soyisim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') {
            this.soyisim = soyisim;
        }else {
            System.out.println("Soyisim büyük harfle baslamali");
        }

        if (yas < 0) {
            System.out.println("Negatif yas girilemez");
        } else {
            this.yas = yas;
        }
    }

    public C01Encapsulation() {
    }

    //3-getter setter


    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setIsim(String isim) {
        if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
            this.isim = isim;
        }else {
            System.out.println("Isim büyük harfle baslamali");
        }
    }

    public void setSoyisim(String soyisim) {
        if (soyisim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') {
            this.soyisim = soyisim;
        } else {
            System.out.println("Soyisim büyük harfle baslamali");
        }
    }

    public void setYas(int yas) {
        if (yas<0){
            System.out.println("Negatif yas degeri girilemez");
        }else {
            this.yas = yas;
        }
    }

    //4-toString methodu bu classtan olusturulan objeyi sout icinde


    @Override
    public String toString() {
        return "C01Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
}




