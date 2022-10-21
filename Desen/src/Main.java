import java.util.Scanner;
public class Main {
    static void Desen(int n){
        System.out.print(n+" ");
       if (n>0) {
           Desen(n - 5);
           System.out.print(n + " ");
       }

    }


    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        n = input.nextInt();
        Desen(n);
    }
}
