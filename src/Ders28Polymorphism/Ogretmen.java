package Ders28Polymorphism;

public class Ogretmen extends Kisi{
    private String brans;
    private String maas;

    @Override
    public void show() {
        System.out.println("Ogretmen.show() çağrıldı");
    }

    public Ogretmen(String TCKimlik, String Ad, String Soyad, String brans, String maas) {
        super(TCKimlik, Ad, Soyad);
        this.brans = brans;
        this.maas = maas;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }
}
