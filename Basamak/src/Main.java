import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,basamak,toplam=0;
        System.out.print("Sayı giriniz: ");
        n =input.nextInt();
        while (n != 0) {
            basamak = n%10;
            toplam += basamak;
            n /=10;
        }
        System.out.println("Basamakların toplamları: "+toplam);
    }
}
