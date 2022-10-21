import java.util.Scanner;
public class Main {
    public static int RPrime(int n,int k){
        if(n == k){
            System.out.println(n + " Asal bir sayı.");
            return 1;
        }
        else if(n % k==0){
            System.out.println(n + " Asal değil.");
            return 0;
        }
        return RPrime(n,k+1);
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        RPrime(n,2);
    }
}
