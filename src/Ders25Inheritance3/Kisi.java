package Ders25Inheritance3;

public class Kisi {
    private String TCKimlik;
    private String Ad;
    private String Soyad;

    public Kisi(String TCKimlik, String ad, String soyad) {
        this.TCKimlik = TCKimlik;
        Ad = ad;
        Soyad = soyad;
    }

    public  void show (){
        System.out.println(this.TCKimlik);
        System.out.println(this.Ad);
        System.out.println(this.Soyad);
    }
    public String getTCKimlik() { return TCKimlik;
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
