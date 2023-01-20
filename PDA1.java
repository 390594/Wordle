
import java.util.Scanner; 
import java.util.InputMismatchException;
public class PDA1
{
    
    int age;
    Scanner scanner = new Scanner(System.in);
    int LOWER_BOUND = 14;
    int UPPER_Bound = 130;
    double YoungerAge;
    double OlderAge;
    boolean shouldContinue = true;

    /**
     * Constructor for objects of class PDA
     */
    public PDA1()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    public void youngerAgeCalc(int age){
        //check if there is a decimal after dividing by 2
        if(age % 2 != 0){
            YoungerAge = (age/2) + 8;
        } else{
            YoungerAge = (age/2) + 7;
        }
        // add one if there is
    }

    public void olderAgeCalc(int age){
        OlderAge = (age*2) - 14;
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        while (shouldContinue) {
            System.out.println("How old are you?");
            System.out.println("Enter 0 to stop the program");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND && age != 0) {
                    System.out.println(age+" is too young!!");
                }
                else if(age == 0){
                    System.out.println("this program has stopped!");
                    shouldContinue = false;
                }
                else {
                    youngerAgeCalc(age);
                    olderAgeCalc(age);
                    System.out.println("Lower Bound: " + YoungerAge);
                    System.out.println("Upper Bound: " + OlderAge);   
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
