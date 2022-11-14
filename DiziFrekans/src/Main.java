public class Main {
    static int Counter(int[] arr, int value) {
        int count = 0;
        for (int i : arr) {
            if (i == value)
                count++;
        }
        return count;
    }
    static  boolean Next(int[] arr,int value,int x){
        for (int i = 0; i < x; i++) {
            if (value == arr[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int sayac = 0;
        int[] dizi = {10,20,20,10,10,20,5,20};
        for (int i = 0; i < dizi.length; i++) {
            if(Next(dizi,dizi[i],i))
                System.out.println(dizi[i] + " sayısı " + Counter(dizi, dizi[i]) + " kez tekrar edildi.");


        }
    }
}
