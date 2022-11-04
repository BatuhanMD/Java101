public class Main {
    public static void main(String[] args) {
        float toplam = 0;
        double harm;
        int[] dizi = {1,2,3,4,5};
        for (int i=0; i< dizi.length;i++){
            toplam += 1.0/dizi[i];
        }
        harm = dizi.length/toplam;
        System.out.println("Dizideki elemanların harmonik ortalaması: "+harm);
    }
}
