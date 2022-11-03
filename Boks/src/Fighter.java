public class Fighter {
    String name;
    int dmg,healt,weight,dodge,first;
    Fighter(String name,int dmg, int healt, int weight,int dodge,int first){
        this.name = name;
        this.dmg = dmg;
        this.healt = healt;
        this.weight = weight;
        this.first = first;
        if(dodge >=0 && dodge <= 100){
            this.dodge = dodge;
        }
        else
            this.dodge =0;
    }
    int hit(Fighter oppenent){
        System.out.println(this.name+ " -> " +oppenent.name + " " + this.dmg +" hasar vurdu.");
        if(oppenent.dodge()){
            System.out.println(oppenent.name + " Gelen yumruğu blokladı");
            return oppenent.healt;
        }
        if (oppenent.healt - this.dmg < 0) {
            return 0;
        }

        return oppenent.healt -this.dmg;
    }
    boolean dodge(){
        double random = Math.random()*100;
        return random <= this.dodge;
    }

}
