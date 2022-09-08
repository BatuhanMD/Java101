import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int sayi;
    double kdvücreti;
    System.out.print("Ücret Tutarını Giriniz: ");
    sayi = inp.nextInt();
    if (sayi > 0 && sayi<1000){
        double kdv=0.18;
        kdvücreti = sayi+ (sayi * kdv);
        System.out.println("KDV dahil ücret: " +kdvücreti);
    }
    else {
        double kdv = 0.08;
        kdvücreti = sayi+(sayi*kdv);
        System.out.println("KDV dahil ücret: " +kdvücreti);
    }
    }
}
