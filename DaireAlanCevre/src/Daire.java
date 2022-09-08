import  java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        double pi = 3.14;
        double alan,cevre,dalan;
        int r,merkezaci;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        // Daire Alan ve Çevre
        alan = pi * Math.pow(r,2);
        cevre = 2 * pi * r;
        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Dairenin Çevresi: "+cevre);

        // Daire Diliminin Alanı
        System.out.print("Dairenin merkez açısını giriniz: ");
        merkezaci = input.nextInt();
        dalan = (pi * Math.pow(r,2) * merkezaci) / 360;
        System.out.println("Daire diliminin alanı: "+dalan);
    }
}
