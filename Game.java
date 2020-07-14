/**
 * A game of chopsticks.
 * 
 *
 * @author Adrian Self
 * @version 07/13/2020
 */
public class Game
{
    private static State[][][][][] states;

    /**
     * Generates states array to start a new game
     * 
     * TODO: improve efficiency by reusing arrays
     */
    public Game()
    {
        states = new State[2][5][5][5][5];
        for(byte i0=0;i0<2;i0++)
            for(byte i1=0;i1<5;i1++)
                for(byte i2=0;i2<5;i2++)
                    for(byte i3=0;i3<5;i3++)
                        for(byte i4=0;i4<5;i4++)
                            states[i0][i1][i2][i3][i4] = 
                            new State(
                                i0,
                                new byte[][]{
                                    new byte[]{i1,i2},
                                    new byte[]{i3,i4}
                                }
                            );
    }

    /**
     * Calls .resolve() on the root state
     * to resolve all reachable states
     */
    public void resolveStates()
    {
        states[0][1][1][1][1].resolve(null);
    }
    
    public static State[][][][][] getStates() //TODO create and implement getState()
    {
        return states;
    }
}