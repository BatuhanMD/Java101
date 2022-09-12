import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,derece,carpim=1;
        System.out.print("Üslü Sayısının hesaplanmasını istediğiniz sayı: ");
        sayi = input.nextInt();
        System.out.print(+sayi+"nın kaçıncı üstü: ");
        derece =input.nextInt();
        for(int i=1;i<=derece;i++) {
            carpim *=sayi;
        }
        System.out.println(carpim);
    }
}
