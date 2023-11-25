package Ders26Inheritance2;

public class Ogrenci extends Kisi {
    private String ogrNo;
    private String sube;

       public Ogrenci(String TCKimlik, String ad, String soyad, String ogrNo, String sube) {
            super(TCKimlik, ad, soyad);
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
