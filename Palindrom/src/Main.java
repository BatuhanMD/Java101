import java.util.Scanner;
public class Main {
    static boolean Palindrom(int sayi){
        int temp = sayi, sayiters=0;
        int sonb;
        while(temp !=0){
            sonb= temp%10;
            sayiters= (sayiters*10)+sonb;
            temp /=10;
        }
        if(sayi==sayiters)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Palindrom(242));
        System.out.println(Palindrom(593));
    }
}
