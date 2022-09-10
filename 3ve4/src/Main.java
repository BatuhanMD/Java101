import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,toplam=0,i,k=0;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
        n = input.nextInt();
        for(i=0;i<=n;i++){
            if(i%3==0 && i%4==0) {
                toplam +=i ;
                k+=1;
                System.out.println(i);
            }
            }
        ortalama = toplam/(k-1);  // 0 rakamını ortalamaya dahil etmemek için k kadar bölenden -1 adet çıkartıyoruz.
        System.out.println("Ortalama: "+ortalama);
        }

    }

