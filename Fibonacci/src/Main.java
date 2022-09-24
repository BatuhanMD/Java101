import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanı yazdırmak istiyorsunuz:");
        int n = input.nextInt();
        int t1=0,t2=1,t3;
        System.out.print(t1+" "+t2);
        for(int i=0;i<=n-2;i++){
            t3 = t1+t2;
            System.out.print(" "+t3);
            t1=t2;
            t2=t3;
        }
    }
}
