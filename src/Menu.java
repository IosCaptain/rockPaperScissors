public class Menu {

    public static void display() {
        System.out.println
                ("---------------------\n" +
                        "MENU\n" +
                        "---------------------\n" +
                        "1. Type 'Play' to play.\n" +
                        "2. Type anything else to exit.");

        switch (Reader.getInput()) {
            case "play":
                OpponentMenu.display();
                break;
            case "counter":
                System.out.println("ERROR: Counter needs to be set");
                break;
            default:
                System.out.println("See you next time!");
                System. exit(0);
        }


    }
}
