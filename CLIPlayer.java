import java.util.Scanner;
/**
 * CLIPlayer is a human player who plays chopsticks at the command line.
 *
 * @author Adrian Self
 * @version 07/14/2020
 */
public class CLIPlayer extends Player
{
    private Scanner input = new Scanner(System.in);
    private State knownState;
    
    public void move()
    {
        
    }
    
    /*
    public void move()
    {
        String fromLetter, toLetter;
        byte from, to;
        
        System.out.println(knownState);
        System.out.println("Move?");
        
        while(true) {
            fromLetter = input.next();
            toLetter = input.next();
            if(fromLetter.toUpperCase().equals("L")) {
                from=0;
            }
            else if(fromLetter.toUpperCase().equals("R")) {
                from=0;
            }
            else if(fromLetter.toUpperCase().equals("S")) {
                
            }
            else {
                System.out.printf("The move <%s %s> is invalid.%n",fromLetter, toLetter);
                System.out.println("Please enter a move such as <R L> or <S>");
            }
            break;
        }
        
        System.out.printf("Thanks for moving from '%d' to '%d'",from,to);
    }
    */
    
    public void inform(State state)
    {
        System.out.printf("%d%d%n",state.getHand(0),state.getHand(1));
    }
}