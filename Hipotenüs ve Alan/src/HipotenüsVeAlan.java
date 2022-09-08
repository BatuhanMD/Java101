import java.util.Scanner;
public class HipotenüsVeAlan {
    public static void main(String[] args) {
        int kenar1,kenar2;
        double alan,hipotenus;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Dik kenarı Giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("1. Dik kenarı Giriniz: ");
        kenar2 = input.nextInt();
        hipotenus = Math.sqrt(Math.pow(kenar1,2) + Math.pow(kenar2,2));
        System.out.println("Hipotenüs: " +hipotenus);
        alan = (kenar1*kenar2) / 2;
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
