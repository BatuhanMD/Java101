import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner innput = new Scanner(System.in);
        int n,i;
        System.out.print("Sınır değerini giriniz:");
        n = innput.nextInt();
        for (i=1;i<=n;i*=4){
            System.out.println(i);
        }
        System.out.println("****************");
        for (i=1;i<=n;i*=5){
            System.out.println(i);
        }
    }
}
