import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsAflevering {
    public static void singleplayer() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("You chose singleplayer!");
        System.out.println("Please write your name: ");
        String singleplayerName = scanner.next();

        String welcomePlayer = "Hi " + singleplayerName + "! \nI hope you're ready to play a round!";
        System.out.println(welcomePlayer);

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        String[] optionsInGame = {"1. Rock", "2. Paper 📜", "3. Scissors ✂"};
        int[] optionsInGameIndex = new int[3];

        System.out.println("It's time to play 😄\nPlease type the number of your choice:");

        for (String option : optionsInGame) {
            System.out.println(option);
        }

        int singleplayerChoice;
        int computerChoice;

        singleplayerChoice = scanner.nextInt();
        computerChoice = random.nextInt(3) + 1;

        System.out.println("You choose " + singleplayerChoice);
        System.out.println("The computer choose " + computerChoice);

        if (singleplayerChoice >= 4)
            System.out.println(singleplayerName + " your choice is not valid");
        else if (singleplayerChoice == computerChoice)
            System.out.println("It's a draw");
        else if (singleplayerChoice == rock && computerChoice == scissors || singleplayerChoice == paper && computerChoice == rock || singleplayerChoice == scissors && computerChoice == paper) {
            System.out.println("You win!");
        } else {
            System.out.println("The computer wins!");
        }
    }

    public static void multiplayer () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You chose multiplayer!");
        System.out.println("Please write the name of the first player: ");
        String playerOne = scanner.next();

        System.out.println("Please write the name of your opponent:");
        String playerTwo = scanner.next();

        int playerOneChoice;
        int playerTwoChoice;

        String[] optionsInGame = {"1. Rock", "2. Paper 📜", "3. Scissors ✂"};
        int[] optionsInGameIndex = new int[optionsInGame.length + 1];

        System.out.println(playerOne  + " you choose first:");
        System.out.println("Please type the number of your choice:");

        for (String option : optionsInGame) {
            System.out.println(option);
        }

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        playerOneChoice = scanner.nextInt();

        System.out.println(playerTwo  + " now it's your turn:");
        System.out.println("Please type the number of your choice:");

        for (String option : optionsInGame) {
            System.out.println(option);
        }

        playerTwoChoice = scanner.nextInt();

        System.out.println(playerOne + " you choose " + playerOneChoice);
        System.out.println(playerTwo + " you choose " + playerTwoChoice);

        if (playerOneChoice >= 4 || playerTwoChoice >= 4){
            System.out.println("one of your choices are not valid - try again");
        }
        else if (playerOneChoice == playerTwoChoice)
            System.out.println("It's a draw");
        else  if (playerOneChoice == rock && playerTwoChoice == scissors || playerOneChoice == paper && playerTwoChoice == rock || playerOneChoice == scissors && playerTwoChoice == paper){
            System.out.println(playerOne + " you win!");
        } else {
            System.out.println(playerTwo + " you win!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Hi! Welcome til rock, paper and scissors game!");
        System.out.println("press 1 for singleplayer - press 2 for multiplayer");
        int singleplayerOrMultiplayer = scanner.nextInt();

        if (singleplayerOrMultiplayer == 1) {
            singleplayer();
        } else if (singleplayerOrMultiplayer == 2){
            multiplayer();
        } else {
            System.out.println("choice not valid");
        }
    }
}

