package Ders29Abstraction;

public class Ogrenci extends Kisi {
    private String ogrNo;
    private String sube;

    @Override
    public void show() {
        System.out.println("Ogrenci bilgileri gosteriliyor.");
    }
}
