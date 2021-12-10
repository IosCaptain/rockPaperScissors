public class Enemy {

    public static String Reaction() {
        String[] options = {"Rock", "Paper", "Scissors"};
        int max = 2;
        int min = 0;
        int random = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Opponent chose " + options[random]);
        return options[random].toLowerCase();
    }
}
