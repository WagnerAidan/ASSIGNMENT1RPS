import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player A:");
        System.out.print("Choose the move (R, P, S or r, p, s): ");
        String a_choice = sc.next();

        if(! (a_choice.equalsIgnoreCase("R") || a_choice.equalsIgnoreCase("P") || a_choice.equalsIgnoreCase("S")))
        {

            System.out.println("You have not chosen a valid move. Ending game...");
            System.exit(0);
        }
        System.out.println("Player B:");
        System.out.print("Choose the move (R, P, S or r, p, s): ");
        String b_choice = sc.next();

        if(! (b_choice.equalsIgnoreCase("R") || b_choice.equalsIgnoreCase("P") || b_choice.equalsIgnoreCase("S")))
        {

            System.out.println("You have not chosen a valid move. Ending game...");
            System.exit(0);
        }


        if(a_choice.equalsIgnoreCase("R") && b_choice.equalsIgnoreCase("P"))
            System.out.println("Player B wins");

        else if(a_choice.equalsIgnoreCase("R") && b_choice.equalsIgnoreCase("S"))
            System.out.println("Player A wins");

        else if(a_choice.equalsIgnoreCase("P") && b_choice.equalsIgnoreCase("R"))
            System.out.println("Player A wins");

        else if(a_choice.equalsIgnoreCase("P") && b_choice.equalsIgnoreCase("S"))
            System.out.println("Player B wins");

        else if(a_choice.equalsIgnoreCase("S") && b_choice.equalsIgnoreCase("R"))
            System.out.println("Player B wins");

        else if(a_choice.equalsIgnoreCase("S") && b_choice.equalsIgnoreCase("P"))
            System.out.println("Player A wins");

        else if(a_choice.equalsIgnoreCase("R"))
            System.out.println("Rock vs Rock it's a Tie!");

        else if(a_choice.equalsIgnoreCase("P"))
            System.out.println("Paper vs paper it's a Tie!");
        else
            System.out.println("Scissors vs Scissors it's a Tie!");
    }
}