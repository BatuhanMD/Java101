import java.util.Scanner;
public class Kasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutF=2.14,elmaF=3.67,domatesF=1.11,muzF=0.95,patlicanF=5,toplamTutar;
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        System.out.print("Kaç kilo armut: ");
        armutKg = input.nextInt();
        System.out.print("Kaç kilo elma: ");
        elmaKg = input.nextInt();
        System.out.print("Kaç kilo domates: ");
        domatesKg = input.nextInt();
        System.out.print("Kaç kilo muz: ");
        muzKg = input.nextInt();
        System.out.print("Kaç kilo patlıcan: ");
        patlicanKg = input.nextInt();
        toplamTutar = (armutKg*armutF)+(elmaKg*elmaF)+(domatesKg*domatesF)+(muzKg*muzF)+(patlicanKg*patlicanF);
        System.out.println("Ödemeniz gereken toplam tutar: " +toplamTutar+ " Tl'dir");
    }
}
