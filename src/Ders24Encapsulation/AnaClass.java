package Ders24Encapsulation;

import java.util.ArrayList;

public class AnaClass {
    public static void main(String[] args) {
        /// Ders 24 OOP Encapsulation (Sarmalama)

        // Adres Array List
        ArrayList<Adres> adrList = new ArrayList<>();
        Adres adr = new Adres();
        Ogrenci ogr = new Ogrenci();
        adr.setCadde("istiklal");
        adr.setBlok("A");
        adr.setSehir("Istanbul");

        ogr.setAdi("Hasan");
        ogr.setoAdres(adr);

        adrList.add(adr);

        adr = new Adres(); // Bunu belirtmezsek eğer veriler yanlış aktarılır listeye.
        adr.setCadde("istiklal2");
        adr.setBlok("A2");
        adr.setSehir("Istanbul2");
        adrList.add(adr);

        System.out.println(adrList.get(0).getCadde());
        System.out.println(adrList.get(1).getCadde());
    }
}
