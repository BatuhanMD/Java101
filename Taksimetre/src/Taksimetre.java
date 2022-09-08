import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
    double km,perKm = 2.2,toplamTutar;
    int taksi = 10;

    Scanner input = new Scanner(System.in);
    System.out.print("Gitmek istediğiniz mesafeyi km cinsinden yazınız: ");
    km = input.nextDouble();
    toplamTutar= taksi + (km*perKm);
    if (toplamTutar<20){
        System.out.println("Ödenecek Tutar: 20Tl'dir");
    }
    else {
        System.out.println("Ödenecek Tutar: "+toplamTutar +" Tl'dir");
    }
    }
}
