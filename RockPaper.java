import java.util.Scanner;

public class RockPaper {
    final String[] answers = { "Rock", "Paper", "Scissors" };
    private Scanner scanner = new Scanner(System.in);
    private boolean running = true;
    private int player;
    private int computer;
    private String PLAYER;
    private String COMPUTER;

    // Start game
    public void startGame() {
        System.out.println("=====+++====Pick One=====+++=====");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        while (running) {
            System.out.println("");
            System.out.print("Make move: ");
            player = scanner.nextInt();
            PLAYER = answers[player - 1];
            while (player > 3 || player < 0) {
                System.out.println("The option is out of range");
                System.out.print("Pick a new move: ");
                player = scanner.nextInt();
                PLAYER = answers[player - 1];
            }
            computer = (int) Math.ceil(Math.random() * 3);
            COMPUTER = answers[computer - 1];
            System.out.println("Your move => " + PLAYER);
            System.out.println("Computers move => " + COMPUTER);
            checkWinner();
        }
        System.out.println("Done");
    }

    private void checkWinner() {
        if (COMPUTER.equals("Rock") && PLAYER.equals("Paper")) {
            System.out.println("Paper covers Rock");
            System.out.println("Player wins!!!");
            running = false;
        } else if (COMPUTER.equals("Paper") && PLAYER.equals("Rock")) {
            System.out.println("Paper covers Rock");
            System.out.println("Computer wins!!!");
            running = false;
        } else if (COMPUTER.equals("Scissors") && PLAYER.equals("Paper")) {
            System.out.println("Scissors cuts Paper");
            System.out.println("Computer wins!!!");
            running = false;
        } else if (COMPUTER.equals("Paper") && PLAYER.equals("Scissors")) {
            System.out.println("Scissors cuts Paper");
            System.out.println("Player wins!!!");
            running = false;
        } else if (COMPUTER.equals("Scissors") && PLAYER.equals("Rock")) {
            System.out.println("Scissors can not cut Rock");
            System.out.println("Player wins!!!");
            running = false;
        } else if (COMPUTER.equals("Rock") && PLAYER.equals("Scissors")) {
            System.out.println("Scissors can not cut Rock");
            System.out.println("Computer wins!!!");
            running = false;
        } else {
            System.out.println("Its a tie, Try again");
        }
    }
}
