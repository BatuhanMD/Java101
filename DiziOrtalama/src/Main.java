public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        int[] dizi = {1,2,3,4,5};
        for(int i=0; i<= dizi.length;i++){
            toplam += i;
        }
        System.out.println("Dizideki elemanların ortalaması: "+(toplam/dizi.length));
    }
}
