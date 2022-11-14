import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y;
        System.out.print("Satır sayısını giriniz: ");
        x = inp.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        y = inp.nextInt();
        int[][] dizi = new int[x][y];
        int[][] transpoz = new int[y][x];
        for (int i = 0; i < x; i++) { // Matrisin elemanlarını kullanıcan alıp, matrise ekleyen kısım.
            for (int j = 0; j < y; j++) {
                System.out.print((i + 1) + ". satır " + (j + 1) + ". sütun : ");
                dizi[i][j] = inp.nextInt();
            }
        }
        System.out.println("Girilen Matris: ");
        for (int i = 0; i < x; i++) { // Oluşan matrisi ekrana bastıran kısım
            for (int j = 0; j < y; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Girilen Matrisin Transpozu:");
        for (int i = 0; i < y; i++) { // Girilen matirisin transpozunu alıp ekrana yazdıran kısım.
            for (int j = 0; j < x; j++) {
                transpoz[i][j] = dizi[j][i];
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
}
