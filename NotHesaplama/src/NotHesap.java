import java.util.Scanner;
public class NotHesap {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int mat,fizik,kimya,turkce,tarih,muzik,toplam;
    double ortalama;
    System.out.print("Matematik notunuzu giriniz: ");
    mat = input.nextInt();
    System.out.print("Fizik notunuzu giriniz: ");
    fizik = input.nextInt();
    System.out.print("Kimya notunuzu giriniz: ");
    kimya = input.nextInt();
    System.out.print("Türkçe notunuzu giriniz: ");
    turkce = input.nextInt();
    System.out.print("Tarih notunuzu giriniz: ");
    tarih = input.nextInt();
    System.out.print("Müzik notunuzu giriniz: ");
    muzik = input.nextInt();
    toplam = mat+fizik+kimya+turkce+tarih+muzik;
    ortalama = toplam/6 ;
    System.out.println("Ortalamanız:" + ortalama);
    System.out.println(ortalama >= 60 ? "Sınıfı Geçti!" : "Sınıfta Kaldı!");


    }
}
