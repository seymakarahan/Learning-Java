package Main.Projeler;

import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {
    public static void main(String[] args) {
        // Değişkenleri oluştur.
        int matematik, fizik, kimya, turkce, tarih, muzik;
        
        // Scanner sınıfı tanımla.
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al.
        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = inp.nextInt();


        int toplam = (matematik + fizik + kimya + tarih + turkce + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        boolean kosul1 = sonuc > 60;
        boolean kosul2 = sonuc < 60;

        boolean sonuc2 = kosul1 || kosul2;
        String str = sonuc2 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.print(str);



    
    }
}
