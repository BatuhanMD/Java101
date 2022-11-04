import  java.util.Scanner;
import  java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        System.out.print("Girmek istediğiniz sayı: ");
        int n = input.nextInt();
        Arrays.sort(dizi);
        int min = dizi[0];
        int max = dizi[dizi.length-1];
        for (int i : dizi) {
            if (i < max && i > n) {
                max = i;
            }
            if (i > min && i < n) {
                min = i;
            }
        }
    
        System.out.println("Dizi: " + Arrays.toString(dizi));
        System.out.println("Girilen sayı: "+n);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " +min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+max);

    }
}