/**
 * A game state, with info on hands and turn.
 * Can be linked to other states.
 *
 * @author Adrian Self
 * @version V0.0.0, 07/13/2020
 */
public class State
{
    private char[][] hands; //how many fingers on each hand?
    private char turn; //whose turn is it?

    /**
     * Constructor for objects of class State
     */
    public State()
    {
        this.hands = new char[2][2];
        this.turn = 0;
    }
    
    /**
     * Recursively resolve all states reachable from this state
     * by considering valid Chopsticks moves
     */
    public void resolve()
    {
        
    }
}