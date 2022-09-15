import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, bolen = 2, obeb = 1;
        System.out.print("1. Sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        sayi2 = input.nextInt();
        int ekok = (sayi1*sayi2);
        while (sayi1 > 1 || sayi2 > 1) {
            if (sayi1 % bolen == 0 && sayi2 % bolen == 0) {
                obeb *= bolen;
                sayi1 /= bolen;
                sayi2 /= bolen;
            } else if (sayi1 % bolen == 0) {
                sayi1 /= bolen;
            } else if (sayi2 % bolen == 0) {
                sayi2 /= bolen;
            } else
                bolen++;
        }
        System.out.println("Girilen iki sayıyın Obebi: " + obeb);
        System.out.println("Girilen iki sayının Ekoku: "+ekok/obeb);
    }
}
