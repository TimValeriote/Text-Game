
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author valet8115
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //strings to check answers
        //check points / checks
        boolean mark1 = false;
        boolean mark2 = false;
        boolean las = false;
        boolean ny = false;

        while (true) {
            System.out.println("Please enter your name: ");
            String name = scan.next();

            System.out.println("Hi " + name + " welcome to Text Terp!");

            System.out.println("Here are your rules: ");
            System.out.println("If you answer a question wrong you'll be send back to your checkpoint.");
            System.out.println("But be careful because a few question will cause you to lose the game!");
            System.out.println("You'll be notifed when you hit a checkpoint!");
            System.out.println("Some questions will change! So dont think just because you missed one it will be the same next time!");
            System.out.println("Are you ready to go?");
            String check = scan.next(); //q1

            if (check.contains("no")) {
                System.out.println("So what should I do then?");
                break;
            } else {
                System.out.println("Ok lets begin");
            }

            System.out.println("You walk up to a door, one door is red, one is blue. Which do you go in?");
            String q1Check = scan.next();

            if (q1Check.contains("red")) {
                System.out.println("Wrong! Red means bad....");
                break;
            } else {
                System.out.println("Correct!");
            }

            System.out.println("You walk through the blue door and comes 2 portals.");
            System.out.println("One leads to New York city.");
            System.out.println("One leads to Las Vegas");
            System.out.println("Which one do you go into (there is no wrong answer here)");
            String q2Check = scan.next();

            if (q2Check.contains("Las")) {
                las = true;
                System.out.println("Congrats you went to Las Vegas!");
                System.out.println("You also hit a check point!");
                System.out.println("From now on questions will change if you lose!");
            } else if (q2Check.contains("New")) {
                ny = true;
                System.out.println("Congrats you went to New York City!");
                System.out.println("You also hit a check point!");
                System.out.println("From now on questions will change if you lose!");
                mark1 = true;
            } else {
                System.out.println("Wrong");
                break;
            }
            if (las == true) {
                System.out.println("You arrive in Las Vegas");
                System.out.println("After you arrive you are asked a simple math question");
                System.out.println("What is 5 X 5?");
                int q3Check = scan.nextInt();
                
                if (q3Check == 25) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect!");
                    break;
                }

                System.out.println("Because you answered the math question correctly, an person of big importance takes intrest in you.");
                System.out.println("He asks you if you if you would like to join him at a company party");
                System.out.println("Do you go?");
                String q4 = scan.next();

                while (true) {
                    if (q4.contains("yes")) {
                        System.out.println("You follow him to his hotel to get ready for the party!");
                        System.out.println("You arrive at the hotel and are booked a free room.");
                        System.out.println("You are suprised how little work it took to get so far and you question how real this is");
                        System.out.println("What do you ask the mysterious man who booked you the hotel?");
                        String q5 = scan.next();
                        if (q5.contains("why")) {
                            System.out.println("The man is not happy with you can he kicks you out");
                            break;
                        } else if (q5.contains("who")) {
                            System.out.println("The man is not happy with you can he kicks you out");
                            break;
                        } else if (q5.contains("where")) {
                            System.out.println("The man is not happy with you can he kicks you out");
                            break;
                        } else {
                            System.out.println("The man says he is interested in your skills");
                        }
                    } else {
                    }
                }
                System.out.println("Now you are alone and cold on the streets of Las Vegas");






            } else if (ny == true) {
                break;
            }



        }
    }
}
