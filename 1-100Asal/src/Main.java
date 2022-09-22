public class Main {
    public static void main(String args[]) {
        for(int sayi = 1;sayi<=100;sayi++){
            int sayac = 0;
            for(int i=2;i<=sayi/2;i++){
                if(sayi%i==0){
                    sayac++;
                    break;
                }
            }
            if(sayac==0 && sayi!= 1)
                System.out.print(sayi+" ");
        }
    }
}
