public class Ogretmen {
    String ad;
    String telno;
    String brans;

    Ogretmen(String ad,String telno,String brans){
        this.ad = ad;
        this.telno = telno;
        this.brans = brans;
    }
    void info(){
        System.out.println("Adı: "+this.ad);
        System.out.println("telno: "+this.telno);
        System.out.println("Bölümü: "+this.brans);
    }
}
