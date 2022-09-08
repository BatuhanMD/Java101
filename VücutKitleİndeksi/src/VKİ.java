import java.util.Scanner;
public class VKİ {
    public static void main(String[] args) {
        double boy,vki;
        int kilo;
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextInt();
        vki = kilo / (Math.pow(boy,2));

        if (vki>40){
            System.out.println("Vücut Kitle İndeksiniz: "+vki+" = Morbid Obezite");
        }
        else if (35<vki && vki<40){
            System.out.println("Vücut Kitle İndeksiniz: "+vki+" = 2.Derece Obezite");
        }
        else if (30<vki && vki<34.9){
            System.out.println("Vücut Kitle İndeksiniz: "+vki+" = 1.Derece Obezite");
        }
        else if (25<vki && vki<29.9){
            System.out.println("Vücut Kitle İndeksiniz: "+vki+" = Fazla Kilolu");
        }
        else if (18.5<vki && vki<24.9){
            System.out.println("Vücut Kitle İndeksiniz: "+vki+" = Normal Kilolu");
        }
        else
            System.out.println("Vücut Kitle İndeksiniz: "+vki+" = Zayıf");
    }
}
