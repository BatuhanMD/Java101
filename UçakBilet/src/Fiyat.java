import java.util.Scanner;
public class Fiyat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, ytip;
        double toplam, perKm = 0.10;
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("1)Tek Yön\n2)Gidiş-Dönüş\nYolculuk tipini seçiniz: ");
        ytip = input.nextInt();
        toplam = mesafe * perKm;
        if (mesafe > 0 && yas > 0 && (ytip == 1 || ytip == 2)) {
            if (yas < 12) {
                double indirimoran, indirimlifiyat;
                indirimoran = toplam * 0.5;
                indirimlifiyat = toplam - indirimoran;
                if (ytip == 1) {
                    System.out.println("Ödemeniz gereken tutar: " + indirimlifiyat);
                }
                if (ytip == 2) {
                    indirimlifiyat = indirimlifiyat - (indirimlifiyat * 0.2);
                    System.out.println("Ödemeniz gereken tutar:" + indirimlifiyat * 2);
                }
            }
            if (12 <= yas && yas <= 24) {
                double indirimoran, indirimlifiyat;
                indirimoran = toplam * 0.1;
                indirimlifiyat = toplam - indirimoran;
                if (ytip == 1) {
                    System.out.println("Ödemeniz gereken tutar: " + indirimlifiyat);
                }
                if (ytip == 2) {
                    indirimlifiyat = indirimlifiyat - (indirimlifiyat * 0.2);
                    System.out.println("Ödemeniz gereken tutar:" + indirimlifiyat * 2);
                }
            }
            if (24 < yas && yas < 65) {
                if (ytip == 1) {
                    System.out.println("Ödemeniz gereken tutar:" + toplam);
                }
                if (ytip == 2) {
                    toplam = toplam - toplam * 0.2;
                    System.out.println("Ödemeniz gereken tutar:" + toplam * 2);
                }
            }
            if (65 <= yas) {
                double indirimoran, indirimlifiyat;
                indirimoran = toplam * 0.3;
                indirimlifiyat = toplam - indirimoran;
                if (ytip == 1) {
                    System.out.println("Ödemeniz gereken tutar: " + indirimlifiyat);
                }
                if (ytip == 2) {
                    indirimlifiyat = indirimlifiyat - (indirimlifiyat * 0.2);
                    System.out.println("Ödemeniz gereken tutar:" + indirimlifiyat * 2);
                }
            }
        }
            else
                System.out.println("Hatalı Veri Girdiniz!");


        }
    }
