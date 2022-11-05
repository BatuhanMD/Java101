import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();
        int [] dizi = new int[n];
        for(int i =0; i< dizi.length;i++){
            System.out.print("Dizinin " +(i+1)+ ". Elemanı: ");
            int add = input.nextInt();
            dizi[i] = add;
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));



    }
}
