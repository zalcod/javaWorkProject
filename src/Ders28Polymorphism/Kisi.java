package Ders28Polymorphism;

public class Kisi {
    private String TCKimlik;
    private String Ad;
    private String Soyad;

    public void show() {
        System.out.println("Kisi.show() çağrıldı");
    }

    public Kisi(String TCKimlik, String Ad, String Soyad) {
        this.TCKimlik = TCKimlik;
        this.Ad = Ad;
        this.Soyad = Soyad;
    }

    public String getTCKimlik() {
        return TCKimlik;
    }

    public void setTCKimlik(String TCKimlik) {
        this.TCKimlik = TCKimlik;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }
}
