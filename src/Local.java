public class Local extends CounterControl {

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
    public static void conditions() {

        //Checking input
        String userInput = Reader.getInput();
        if (userInput.equals("x")) {
            Menu.display();
        } else if (userInput.equals("c")) {
            Local.getCounter();
            Local.flow();
        } else if(!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissors")) {
            System.out.println("Invalid entry");
            Local.flow();
        }

        String opponentInput = Reader.getInput();
        if (opponentInput.equals("x")) {
            Menu.display();
        } else if (opponentInput.equals("c")) {
            Local.getCounter();
            Local.flow();
        } else if(!opponentInput.equals("rock") && !opponentInput.equals("paper") && !opponentInput.equals("scissors")) {
            System.out.println("Invalid entry");
            Local.flow();
        }

        //Winning Conditions
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
