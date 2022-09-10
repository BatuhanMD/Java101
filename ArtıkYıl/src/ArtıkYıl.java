import java.util.Scanner;
public class ArtıkYıl {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;
        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();
        if(year%4==0 || year%400==0)
            System.out.println(year+" Artık bir yıldır.");
        else
            System.out.println(year+" Artık bir yıl değildir.");
    }
}
