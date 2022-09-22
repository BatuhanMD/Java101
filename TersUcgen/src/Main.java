import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i -2); k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}