package Ders29Abstraction;

/*
        Kisi sınıfı soyut bir sınıftır (abstract class).
        Soyut sınıflar, hem somut (concrete) metotlar hem de soyut (abstract) metotlar içerebilir.
        Somut metotlar bir implementasyon içerirken, soyut metotlar sadece imza (signature) ile tanımlanır
        ve alt sınıflar tarafından uygulanmalıdır.
  */
public abstract class Kisi {
    private String TCKimlik;
    private String Ad;
    private String Soyad;

    public void add() {
        System.out.println("Ogrenci eklendi.");
    }

    // Abstract methodları doğrudan kullanamayız.
    public abstract void show();

    /*
    Bu sınıfta, add metodu somut bir metottur, yani bir implementasyon içerir.
    Ancak, show metodu soyut bir metottur, yalnızca imza ile tanımlanmıştır.
    Alt sınıflar bu metodu kendi ihtiyaçlarına göre uygulamak zorundadır.
    */
}
