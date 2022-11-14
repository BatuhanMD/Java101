import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println("0-100 Arasında Bir Sayı Tuttum Tahmin Edebilir Misin?");
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğinin sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Bilemedin!");
                if (selected > number) {
                    System.out.println(selected + " sayısı, tuttuğum sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, tuttuğum sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkın : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettin ! ");
            System.out.println("Tuttuğum sayı: " + number);
            if (!isWrong) {
                System.out.println("Tahminlerin : " + Arrays.toString(wrong));
            }
        }

    }
}