import java.util.Scanner;
public class Zodyak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yıl,kalan;
        System.out.print("Doğum yılınızı giriniz:");
        yıl = inp.nextInt();
        kalan = yıl%12;
        switch (kalan){
            case 0:System.out.println("Çin Zodyak Burcunuz: Maymun"); break;
            case 1:System.out.println("Çin Zodyak Burcunuz: Horoz"); break;
            case 2:System.out.println("Çin Zodyak Burcunuz: Köpek"); break;
            case 3:System.out.println("Çin Zodyak Burcunuz: Domuz"); break;
            case 4:System.out.println("Çin Zodyak Burcunuz: Fare"); break;
            case 5:System.out.println("Çin Zodyak Burcunuz: Öküz"); break;
            case 6:System.out.println("Çin Zodyak Burcunuz: Kaplan"); break;
            case 7:System.out.println("Çin Zodyak Burcunuz: Tavşan"); break;
            case 8:System.out.println("Çin Zodyak Burcunuz: Ejderha"); break;
            case 9:System.out.println("Çin Zodyak Burcunuz: Yılan"); break;
            case 10:System.out.println("Çin Zodyak Burcunuz: At"); break;
            case 11:System.out.println("Çin Zodyak Burcunuz: Koyun"); break;
        }
    }
}
