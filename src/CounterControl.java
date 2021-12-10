public abstract class CounterControl {

    static int userWins = 0;
    static int opponentWins = 0;
    static int draws = 0;

    public static void getCounter () {
        System.out.println
                ("---------------------\n" +
                        "GLOBAL COUNT\n" +
                        "---------------------\n" +
                        "Player 1 wings: " + userWins + "\n" +
                        "Player 2 wings: " + opponentWins + "\n" +
                        "Draws: " + draws);
    }

    public static void addUserWin(){
        userWins += 1;
        System.out.println("***Player 1 wins***");
    }
    public static void addOpponentWin(){
        opponentWins += 1;
        System.out.println("***Player 2 wins***");
    }
    public static void addDraw(){
        draws += 1;
        System.out.println("***It's a draw***");
    }

}