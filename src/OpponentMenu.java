public class OpponentMenu {

    public static void display() {
        System.out.println
                ("---------------------\n" +
                        "CHOOSE OPPONENT\n" +
                        "---------------------\n" +
                        "1. Type 'C' to play against the computer .\n" +
                        "2. Type 'L' to play locally with a friend.\n" +
                        "3. Type anything else to return to the main menu.");

        switch(Reader.getInput()) {
            case "c":
                Game.flow();
                //System.out.println("Future steps need to be set"); //call the function to ask for an input RPC
                break;
            case "l":
                System.out.println("Playing against another human is being developed");
                break;
            default:
                Menu.display();

        }
    }
}