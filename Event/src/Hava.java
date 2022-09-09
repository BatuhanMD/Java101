import java.util.Scanner;
public class Hava {
    public static void main(String[] args) {
        int derece;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz:");
        derece = input.nextInt();
        if(derece<5) {System.out.println("Kayak yapmaya gidebilirsiniz.");}
        if(5<=derece && derece<=10) {
            System.out.println("Sinemaya gidebilirsiniz.");}
        if(10<derece && derece <25){
            int secim;
            System.out.print("1-Açık alan mı?\n2-Kapalı alan mı?\nSeçiminiz:");
            secim = input.nextInt();
                switch (secim){
                    case 1:
                        System.out.println("Piknik yapmaya gidebilirsiniz");
                        break;
                    case 2:
                        System.out.println("Sinemaya gidebilirsiniz.");
                        break;
                }
        }
        if (25<derece)
            {System.out.println("Yüzmeye gidebilirsiniz.");}
    }
}
