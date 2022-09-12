import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int ncarpim =1,rcarpim=1;
        System.out.print("Kümeniz kaç elemanlı:");
        n = input.nextInt();
        for (int i=1;i<=n;i++){
            ncarpim *=i;
        }
        int r;
        System.out.print("Kaç elemanlı gruplar istiyorsunuz: ");
        r = input.nextInt();
        for (int i=1;i<=r;i++){
            rcarpim *=i;
        }
        int n_r = n-r;
        int nrcarpim=1;
        for (int i=1;i<=n_r;i++){
            nrcarpim *=i;
        }
        double ks = ncarpim / (rcarpim * nrcarpim);
        System.out.println("Kombinasyon Sonucu:"+ks);
    }
}
