import java.util.Random;
import java.util.Scanner;

public class Project {
    public static void main(String args[]) {

        playGame();
    }

    private static void loopSpaces() {
        for (int a = 1; a <= 6; a++) {
            System.out.println();
        }
    }

    private static void minimumSpaces() {
        for (int a = 1; a <= 3; a++) {
            System.out.println();
        }
    }

    private static void Exitplay (){
        Scanner scan = new Scanner(System.in);
        minimumSpaces();
        System.out.println("Do you want to play again? (Y/N): ");
        char decide = scan.next().charAt(0);

        if (decide == 'y'|| decide == 'Y'){
            loopSpaces();
            loopSpaces();
            playGame();
        }else if (decide == 'n' || decide == 'N'){
            System.exit(0);
        } else{
            Exitplay();
        }
    }



    public static void playGame(){
        int random = 0 , max = 3, min = 1 , rand = 0;;
        Scanner scan = new Scanner(System.in);
        

        loopSpaces();

        System.out.println("Welcome to the Game");
        System.out.println("Rock , Paper and Scissor");

        loopSpaces();

        System.out.println("1.) Rock");
        System.out.println("2.) Paper");
        System.out.print("3.) Scissors");

        minimumSpaces();

        System.out.println("Pick your Choice : ");
        int choice = scan.nextInt();

        random = (int)Math.floor(Math.random() * (max - min + 1) + min);

        if (choice == 1){
            minimumSpaces();
            System.out.println("You pick Rock");
            if (choice == random){
                System.out.println("I pick Rock");
                minimumSpaces();
                System.out.println("Oopps both of us pick Rock");
            }else if(random == 2){
                System.out.println("I pick Paper");
                minimumSpaces();
                System.out.println("I won the game");
            }else if (random == 3){ 
                System.out.println("I pick Scissors");
                minimumSpaces();
                System.out.println("You won the game");
            }
        } else if (choice == 2){
            minimumSpaces();
            System.out.println("You pick Paper");
            if (choice == random){
                System.out.println("I pick Paper");
                minimumSpaces();
                System.out.println("Oopps both of us pick Rock");
            }else if (random == 1){
                System.out.println("I pick Rock");
                minimumSpaces();
                System.out.println("You won the game");
            } else if (random == 3){
                System.out.println("I pick Scissors");
                minimumSpaces();
                System.out.println("I won the game");
            }
        } else if (choice == 3){
            minimumSpaces();
            System.out.println("You pick Scissors");
            if (choice == random){
                System.out.println("I pick Scissors");
                minimumSpaces();
                System.out.println("Oopps both of us pick Rock");
            }else if (random == 1){
                System.out.println("I pick Rock");
                minimumSpaces();
                System.out.println("I won the game");
            } else if (random == 2){
                System.out.println("I pick Paper");
                minimumSpaces();
                System.out.println("You won the game");
            }
        } else {
            playGame();
        }

        Exitplay();
    
    }


}
