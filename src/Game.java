public class Game {

    public static void flow() {
        System.out.println("Choose one of the following:\n" +
                "---------------------\n" +
                "1. Type 'Rock' for Rock.\n" +
                "2. Type 'Paper' for Paper.\n" +
                "3. Type 'Scissors' for Scissors.\n" +
                "---------------------\n" +
                "4. Type 'x' to go back to the main menu");

        //Checking input
        String userInput = Reader.getInput();
        if (userInput.equals("x")) {
            Menu.display();
        }
        String opponentInput = Enemy.Reaction();



        if (userInput.equals("rock") && opponentInput.equals("paper")){
            System.out.println("Opponent Wins");
            Game.flow();
        } else if (userInput.equals("paper") && opponentInput.equals("scissors")){
            System.out.println("Opponent Wins");
            Game.flow();
        } else if (userInput.equals("scissors") && opponentInput.equals("rock")){
            System.out.println("Opponent Wins");
            Game.flow();
        } else if (userInput.equals("scissors") && opponentInput.equals("paper")) {
            System.out.println("User Wins");
            Game.flow();
        } else if (userInput.equals("rock") && opponentInput.equals("scissors")) {
            System.out.println("User Wins");
            Game.flow();
        } else if (userInput.equals(opponentInput)) {
            System.out.println("It's a tie");
            Game.flow();
        }

    }
}
