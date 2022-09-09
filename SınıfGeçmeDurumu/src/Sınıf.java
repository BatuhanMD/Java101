import java.util.Scanner;
public class Sınıf {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz,toplam=0,n=0;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu giriniz:");
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu giriniz:");
        fiz = input.nextInt();
        System.out.print("Türkçe Notunuzu giriniz:");
        tur = input.nextInt();
        System.out.print("Kimya Notunuzu giriniz:");
        kim = input.nextInt();
        System.out.print("Müzik Notunuzu giriniz:");
        muz = input.nextInt();
        if(mat>=0 && mat<=100){toplam +=mat; n++;}
        if(fiz>=0 && fiz<=100){toplam +=fiz; n++;}
        if(tur>=0 && tur<=100){toplam +=tur; n++;}
        if(kim>=0 && kim<=100){toplam +=kim; n++;}
        if(muz>=0 && muz<=100){toplam +=muz; n++;}
        ort= toplam /n;

        if(ort > 55){
            System.out.println("Genel Ortalama:"+ort);
            System.out.println("Sınıf Geçildi");
        }
        else
            System.out.println("Sınıfta Kaldı");
    }
}
