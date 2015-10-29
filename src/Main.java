
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
        String ready = "no";
        String Cq1 = "blue";
        String Cq2 = "Las Vegas";
        String CRq2 = "New York City";
        
        //check points / checks
        boolean mark1 = false;
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
            System.out.println(ready);

            if (check.contains(ready)) {
                System.out.println("So what should I do then?");
                break;
            } else {
                System.out.println("Ok lets begin");
            }

            System.out.println("You walk up to a door, one door is red, one is blue. Which do you go in?");
            String q1Check = scan.next();
            
            if (check.contains(Cq1)){
                System.out.println("Wrong! Red mean bad....");
                break;
            } else {
                System.out.println("Correct!");
            }
            
            System.out.println("You walk through the blue door and comes 2 portals.");
            System.out.println("One leads to New York City.");
            System.out.println("One leads to Las Vegas");
            System.out.println("Which one do you go into (there is no wrong answer here)");
            String q2Check = scan.next();
            
            if (q2Check.contains(Cq2)){
                las = true; 
                System.out.println("Congrats you went to Las Vegas!");
                System.out.println("You also hit a check point!");
                System.out.println("From now on questions will change if you lose!");
            } else if (q2Check.contains(CRq2)) {
                ny = true;
                System.out.println("Congrats you went to New York City!");
                System.out.println("You also hit a check point!");
                System.out.println("From now on questions will change if you lose!");
                mark1 = true;
            } else {
                System.out.println("You didnt choose one!");
                break;
            }
            
            if (las == true){
                System.out.println("You arrive in Las Vegas");
                
                
                
                
                
                
                
                
                
            }
            
            if (ny == true){
                
            }


        }
    }
}
