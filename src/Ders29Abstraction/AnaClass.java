package Ders29Abstraction;

import java.util.ArrayList;

public class AnaClass {

    public static void main(String[] args) {
        /// Ders 29 Abstraction (Soyutlama)
        // Abstractlar kullanarak, bazı özellikleri zorunlu kılabiliriz.
        /*
        Soyutlama, gerçek dünyadaki nesnelerin veya kavramların özelliklerini ve davranışlarını basitleştirerek
        temsil etme sürecidir. Java'da soyutlama genellikle abstract sınıflar ve interfaceler aracılığıyla sağlanır.
         */

        Kisi ks = new Ogretmen();
        ks.show();
        ks.add();

        Kisi ks2 = new Ogrenci();
        ks2.show();
        ks2.add();

        /*
        Ogrenci ve Ogretmen sınıfları, Kisi sınıfından türetilmiş (inheritance) sınıflardır.
        Bu sınıflar, show metodu için kendi implementasyonlarını sağlamak zorundadır.
         */

        /*
        ks1 ve ks2 referansı üzerinden show ve add metotları çağrılabilir.
        Ancak, show metodu aslında Ogretmen ve Ogrenci sınıfındaki implementasyonu çağırır.
        Bu durum, çok biçimlilik (polymorphism) kavramını yansıtır.
        */





    }
}
