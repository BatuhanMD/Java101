import java.util.Scanner;

public class Main {
    static boolean isFind(int[] arr,int value){
        for(int i: arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = {2,6,87,51,6,8,15,6,3,8,15,11};
        int[] rpt = new int[dizi.length];
        int sayac, item, toplam = 0;
        int firstIndex = 0;
        for (int i=0; i<dizi.length; i++) {
            item = dizi[i];
            sayac = 0;
            if (item%2 == 0) {
                sayac +=1;
                if(!isFind(rpt,dizi[i])){
                rpt[firstIndex++] = item;
                }
            }
            toplam += sayac;
        }
        int[] newStorage = new int[toplam];
        for (int i=0; i<toplam; i++) {
            newStorage[i] = rpt[i];
        }
        for (int value : rpt){
            if(value !=0){
                System.out.print(value+ " ");
            }
        }
    }
}