public class Main {
    public static void main(String[] args) {
        Fighter player1 = new Fighter("Rocky Balboa",5,100,85,15,50);
        Fighter player2 = new Fighter("Adonis Creed",5,100,70,15,50);
        MatchUp mac1 = new MatchUp(player1,player2,70,85);
        mac1.fight();

    }
}
