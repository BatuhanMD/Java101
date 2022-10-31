public class Ogrenci {
    String ad,no,sinif;
    Dersler d1,d2,d3;
    Double ort;
    boolean GK;
    Ogrenci(String ad,String no,String sinif,Dersler d1,Dersler d2,Dersler d3){
        this.ad= ad;
        this.no= no;
        this.sinif = sinif;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.ort =0.0;
        this.GK = false;
    }
    void NotGirdileri(int not1,int not2,int not3){
        if(not1>0 && not1<=100){
         this.d1.not = not1;
        }
        if(not2>0 && not2<=100){
           this.d2.not = not2;
        }
        if(not3>0 && not3<=100){
            this.d3.not = not3;
        }
    }
    void SNotGirdileri(int snot1,int snot2,int snot3){
        this.d1.snot = snot1;
        this.d2.snot = snot2;
        this.d3.snot = snot3;
    }
    void GK(){
        this.ort = ((this.d1.not * 0.8 + this.d1.snot * 0.2)+(this.d2.not * 0.8 + this.d2.snot * 0.2)+(this.d3.not * 0.8 + this.d3.snot * 0.2)) / 3.0;
        if(this.ort>55){
            System.out.println("Sınıfı Geçti");
        }
        else
            System.out.println("Sınıfta kaldı");
        infonot();
    }
    void infonot(){
        System.out.println(this.d1.ad +" Sınav Notu: " + this.d1.not + "\t    Sözlü Notu: " + this.d1.snot);
        System.out.println(this.d2.ad +" Sınav Notu: " + this.d2.not + "\t    Sözlü Notu: " + this.d2.snot);
        System.out.println(this.d3.ad +" Sınav Notu:"  + this.d3.not + "\t\tSözlü Notu: " + this.d3.snot);
        System.out.println("Genel Ortalamanız: " +this.ort);
        System.out.println("Dersin Ortalaması = Sınav notu %80 + Sözlü Notu %20 şeklinde hesaplanmıştır");
    }



}
