public class MatchUp {
    Fighter player1;
    Fighter player2;
    int minWeight,maxWeight;

    MatchUp(Fighter player1,Fighter player2,int minWeight,int maxWeight){
        this.player1 = player1;
        this.player2 = player2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }
    void fight(){
        if(CheckWeight()){
            while(this.player1.healt > 0 && this.player2.healt >0) {
                System.out.println("====New Round====");
                double isWho = Math.random() * 100;
                if(isWho <= 50) {
                    this.player2.healt = this.player1.hit(this.player2);
                    if (isWin()) {
                        break;
                    }
                    this.player1.healt = this.player2.hit(this.player1);
                    if (isWin()) {
                        break;
                    }
                }
                else{
                this.player1.healt = this.player2.hit(this.player1);
                if(isWin()){
                    break;
                }
                this.player2.healt = this.player1.hit(this.player2);
                if (isWin()) {
                    break;
                }

            }
            }
        }
        else
            System.out.println("Dövüşçülerin sikletleri farklı");
    }
    boolean CheckWeight(){
        return (this.player1.weight >= minWeight && this.player1.weight <= maxWeight) && (this.player2.weight >= minWeight && this.player2.weight <= maxWeight) ;
    }
    boolean isWin(){
        if(this.player1.healt == 0){
            System.out.println(this.player2.name+ " Kazandı ");
            return true;
        }
        if (this.player2.healt == 0){
            System.out.println(this.player1.name + " Kazandı");
            return true;
        }
        return  false;
    }

}
