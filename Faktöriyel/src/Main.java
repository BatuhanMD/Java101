import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int carpim =1;
        System.out.print("Faktöriyelinin hesaplanmasını istediğiniz sayı: ");
        sayi = input.nextInt();
        for (int i=1;i<=sayi;i++){
            carpim *=i;
        }
        System.out.println(carpim);
    }
}
