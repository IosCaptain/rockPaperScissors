public class Game extends CounterControl{

    public static void flow() {
        System.out.println
                ("---------------------\n" +
                        "Choose one of the following:\n" +
                "---------------------\n" +
                "1. Type 'Rock'.\n" +
                "2. Type 'Paper'.\n" +
                "3. Type 'Scissors'.\n" +
                "---------------------\n" +
                "4. Type 'x' to go back to the main menu\n" +
                "5. Type 'c' to see the global counter");

        conditions();
    }
    //Conditionals
    public static void conditions(){

        //Checking input
        String userInput = Reader.getInput();
        if (userInput.equals("x")) {
            Menu.display();
        } else if (userInput.equals("c")) {
            Game.getCounter();
            Game.flow();
        } else if(!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissors")) {
            System.out.println("Invalid entry");
            Game.flow();
        }
        String opponentInput = Enemy.Reaction();


        if (userInput.equals("rock") && opponentInput.equals("paper")) {
            addOpponentWin();
            Game.flow();
        } else if (userInput.equals("paper") && opponentInput.equals("scissors")) {
            addOpponentWin();
            Game.flow();
        } else if (userInput.equals("scissors") && opponentInput.equals("rock")) {
            addOpponentWin();
            Game.flow();
        } else if (userInput.equals("scissors") && opponentInput.equals("paper")) {
            addUserWin();
            Game.flow();
        } else if (userInput.equals("rock") && opponentInput.equals("scissors")) {
            addUserWin();
            Game.flow();
        } else if (userInput.equals("paper") && opponentInput.equals("rock")) {
            addUserWin();
            Game.flow();
        } else if (userInput.equals(opponentInput)) {
            addDraw();
            Game.flow();
        }
    }

}

