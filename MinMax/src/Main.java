import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();
        int sayi,max=0,min=0;
        for (int i=1;i<=n;i++){
            System.out.print(i+". Sayıyı giriniz: ");
            sayi = input.nextInt();
            if (i==1) {
                max = sayi;
                min = sayi;
            }
            else
            {
                if (sayi > max) {max = sayi;}
                else if(sayi < min) {min=sayi;}
            }
        }
        System.out.println("En büyük sayı: "+ max);
        System.out.println("En küçün sayı: "+ min);
    }
}
