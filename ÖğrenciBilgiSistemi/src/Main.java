public class Main {
    public static void main(String[] args) {
        Ogretmen t1 =   new Ogretmen("Murat","5050000000","TRH");
        Ogretmen t2 =   new Ogretmen("Elif","5050000000","MAT");
        Ogretmen t3 =   new Ogretmen("Leyla","5050000000","FZK");
        Dersler tarih = new Dersler("Tarih","101","TRH");
        tarih.ogretmenEkle(t1);
        Dersler matematik = new Dersler("Matematik","101","MAT");
        matematik.ogretmenEkle(t2);
        Dersler fizik = new Dersler("Fizik","101","FZK");
        fizik.ogretmenEkle(t3);
        Ogrenci o1 = new Ogrenci("Batuhan","21120205317","2",tarih,fizik,matematik);
        o1.NotGirdileri(100,51,34);
        o1.SNotGirdileri(100,50,45);
        o1.GK();
    }
}
