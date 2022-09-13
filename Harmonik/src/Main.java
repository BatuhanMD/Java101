import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double toplam=0;
        System.out.print("N değerini giriniz: ");
        n = input.nextInt();
        for (double i=1;i<=n;i++){
            toplam += 1/i;
        }
        System.out.println("Harmonik serinin toplamı: "+toplam);
    }

}
