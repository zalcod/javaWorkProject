package Ders22;

public class Ders22Adress {
    String cadde;
    String blok;
    String no;
    String sehir;
    String ulke;


    public  Ders22Adress() {

    }

    // Farklı constructorlar oluşturabiliriz.
    public Ders22Adress(String cadde, String blok, String no) {
        this.cadde = cadde;
        this.blok = blok;
        this.no = no;
    }

    public Ders22Adress(String cadde, String blok, String no, String sehir, String ulke) {
        // Aşağıdaki kısıma biz constructor diyoruz.
        this.cadde = cadde;
        this.blok = blok;
        this.no = no;
        this.sehir = sehir;
        this.ulke = ulke;
    }


}
