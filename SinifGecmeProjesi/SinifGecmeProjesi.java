import java.util.Scanner;

public class SinifGecmeProjesi {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, Not=0;

    Scanner input = new Scanner(System.in);

    System.out.print("Matematik Notunuz : ");
    mat = input.nextInt();
    if (mat < 0 || mat > 100) {
        System.out.println("0 - 100 aralığında olmayan notlar ortalamaya katılmaz");
    } else {
        Not += mat;
    }


    System.out.print("Fizik Notunuz : ");
    fizik = input.nextInt();
    if (fizik < 0 || fizik > 100) {
        System.out.println("0 - 100 aralığında olmayan notlar ortalamaya katılmaz");
    } else {
        Not += fizik;
    }

    System.out.print("Türkçe Notunuz : ");
    turkce = input.nextInt();
    if (turkce < 0 || turkce > 100) {
        System.out.println("0 - 100 aralığında olmayan notlar ortalamaya katılmaz");
    } else {
        Not += turkce;
    }

    System.out.print("Kimya Notunuz : ");
    kimya = input.nextInt();
    if (kimya < 0 || kimya > 100) {
        System.out.println("0 - 100 aralığında olmayan notlar ortalamaya katılmaz");
    } else {
        Not += kimya;
    }

    System.out.print("Müzik Notunuz : ");
    muzik = input.nextInt();
    if (muzik < 0 || muzik > 100) {
        System.out.println("0 - 100 aralığında olmayan notlar ortalamaya katılmaz");
    } else {
        Not += muzik;
    }


    double avarage = Not / 5;
    if (avarage <= 55) {
        System.out.println("Sınıfta kaldınız");
        System.out.println("Ortalamanız :* " + avarage);
    } else {
        System.out.println("Tebrikler sınıfı geçtiniz");
        System.out.println("Ortalamanız :* " + avarage);
    }
    }

    
    

}
