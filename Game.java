/**
 * A game of chopsticks.
 * 
 *
 * @author Adrian Self
 * @version V0.0.0, 07/13/2020
 */
public class Game
{
    State[][][][][] states;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        states = new State[2][5][5][5][5];
    }

    /**
     * Calls .resolve() on the root state
     * to resolve all reachable states
     */
    public void resolveStates()
    {
        states[0][1][1][1][1].resolve();
    }
}