import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        int total = 0;
        for (int i =1; i<=n;i++){
            if(n%i==0){
                if(n==i){
                    total = total +0;
                }
                else
                total +=i;
            }
        }
        if(total == n){System.out.println(n+" Mükemmel sayıdır.");}
        else
            System.out.println(n+" Mükemmel sayı değildir");

    }
}
