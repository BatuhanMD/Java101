public class Dersler {
    String ad,derskodu,prefix;
    int not;
    int snot;
    Ogretmen ogretmen;
    Dersler(String ad, String derskodu, String prefix){
        this.ad = ad;
        this.derskodu = derskodu;
        this.prefix = prefix;
        int not = 0;
        int snot = 0;
    }
    void ogretmenEkle(Ogretmen ogretmen){
        if(ogretmen.brans.equals(this.prefix)){
        this.ogretmen = ogretmen;

        }
        else
            System.out.println("Öğretmen ve Ders bölümleri uyuşmamaktadır.");

    }
    void infoOgretmen(){
        this.ogretmen.info();
    }

}
