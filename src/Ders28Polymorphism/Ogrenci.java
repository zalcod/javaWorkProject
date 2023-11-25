package Ders28Polymorphism;

public class Ogrenci extends Kisi {
    private String ogrNo;
    private String sube;

    @Override
    public void show() {
        System.out.println("Ogrenci.show() çağrıldı");
    }

    public Ogrenci(String TCKimlik, String Ad, String Soyad, String ogrNo, String sube) {
        super(TCKimlik, Ad, Soyad);
        this.ogrNo = ogrNo;
        this.sube = sube;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
}
