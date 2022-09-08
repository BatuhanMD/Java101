import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,islem;
        System.out.print("Birinci sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme\nYapmak istediğiniz işlemi seçiniz: ");
        islem = input.nextInt();
        switch (islem){
            case 1:
                System.out.print("İşlem sonucu: "+ (a+b));
                break;
            case 2:
                System.out.print("İşlem Sonucu: "+ (a-b));
                break;
            case 3:
                System.out.print("İşlem Sonucu: "+ (a*b));
                break;
            case 4:
                System.out.print("İşlem Sonucu: "+ (a/b));
                break;
        }
    }
}
