import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,toplam=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("N değerini giriniz: ");
            n =input.nextInt();
            if (n%2==0 && n%4==0){
                toplam += n;
            }
        }while (n%2==0);
        System.out.println("Tek sayı girilene kadar girilen çift ve 4'ün katı olan sayıların toplamı:" +toplam);
    }
}
