/**
 * A game of chopsticks.
 * 
 *
 * @author Adrian Self
 * @version V0.0.0, 07/13/2020
 */
public class Game
{
    private State[][][][][] states;
    public State NULL_STATE;

    /**
     * Constructor for objects of class Game
     * 
     * TODO: improve efficiency by reusing arrays
     */
    public Game()
    {
        states = new State[2][5][5][5][5];
        for(char i0=0;i0<2;i0++)
            for(char i1=0;i1<5;i1++)
                for(char i2=0;i2<5;i2++)
                    for(char i3=0;i3<5;i3++)
                        for(char i4=0;i4<5;i4++)
                            states[i0][i1][i2][i3][i4] = 
                            new State(
                                i0,
                                new char[][]{
                                    new char[]{i1,i2},
                                    new char[]{i3,i4}
                                }
                            );
        NULL_STATE = states[0][0][0][0][0];
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