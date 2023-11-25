package Ders24Encapsulation;

import java.util.Locale;

public class Adres {
    private String cadde;
    private String blok;
    private String no;
    private String sehir;
    private String ulke;

    public Adres() {}

    public Adres(String cadde, String blok, String no, String sehir, String ulke) {
        this.cadde = cadde;
        this.blok = blok;
        this.no = no;
        this.sehir = sehir;
        this.ulke = ulke;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        cadde = cadde.substring(0, 1).toUpperCase(Locale.US) + cadde.substring(1);
        // Burada cadde değişkeninin ilk harfini büyük harf yaparak US versiyonunda geri döndürüyoruz.
        this.cadde = cadde;
    }

    public String getBlok() {
        return blok;
    }

    public void setBlok(String blok) {
        this.blok = blok;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }
}
