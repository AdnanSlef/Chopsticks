/**
 * Provides static methods for game logic
 * TODO: Possibly throw errors instead of returning null
 *
 * @author Adrian Self
 * @version V0.0.0, 07/13/2020
 */
public class Logic
{
    private static byte add(byte h1,byte h2)
    {
        return (byte)((h1+h2)%5);
    }
    
    /**
     * Flips byte as boolean
     * 
     * @param b A 1 or 0 byte to invert
     */
    private static byte flp(byte b)
    {
        return b==1?(byte)0:(byte)1;
    }
    
    /**
     * Flips int as boolean
     * 
     * @param b A 1 or 0 int to invert
     */
    private static int flp(int b)
    {
        return b==1?0:1;
    }
    
    /**
     * Generic hit logic
     */
    private static State hit(State state, int player, int from, int to)
    {
        if(state.getTurn()!=player || state.getHand(player, from)==0 || state.getHand(flp(player),to)==0){
            return null;
        }
        return Game.getStates()[flp(player)][state.getHand(0)][state.getHand(1)][0][0];
    }
    
    /**
     * Player A hits Player B's left hand with A's right
     */
    public static State hitARL(State state)
    {
        return hit(state, 0, 1, 0);
    }
    
    /**
     * Player A hits Player B's right hand with A's left
     */
    public static State hitALR(State state)
    {
        return hit(state, 0, 0, 1);
    }
    
    /**
     * Player B hits Player A's left hand with B's right
     */
    public static State hitBRL(State state)
    {
        return hit(state, 1, 1, 0);
    }
    
    /**
     * Player B hits Player A's right hand with B's left
     */
    public static State hitBLR(State state)
    {
        return hit(state, 1, 0, 1);
    }
    
    /**
     * Player A splits
     */
    public static State splitA(State state)
    {
        return null;
    }
    
    /**
     * Player B splits
     */
    public static State splitB(State state)
    {
        return null;
    }
}
