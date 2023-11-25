package Ders23;

public class Adres {
    private String cadde; // private: Sadece tanımlandığı sınıf içerisinden erişilebilir
    String blok;
    String no;
    String sehir;
    String ulke;

    static String qq;

    public Adres (){}

    public Adres(String cadde, String blok, String no, String sehir, String ulke) {
        this.cadde = cadde;
        this.blok = blok;
        this.no = no;
        this.sehir = sehir;
        this.ulke = ulke;
    }

    /// setCadde, private olduğu için sadece Adres sınıfı içerisinden erişilebilir
    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public String getCadde() {
        return cadde;
    }


}
