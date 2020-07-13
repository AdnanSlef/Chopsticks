/**
 * Provides static methods for game logic
 * TODO: Switch errors from NULL_STATE to proper error handling
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
     * Player A hits Player B's left hand with A's right
     */
    public static State hitARL(State state)
    {
        return null;
    }
    
    /**
     * Player A hits Player B's right hand with A's left
     */
    public static State hitALR(State state)
    {
        return null;
    }
    
    /**
     * Player B hits Player A's left hand with B's right
     */
    public static State hitBRL(State state)
    {
        return null;
    }
    
    /**
     * Player B hits Player A's right hand with B's left
     */
    public static State hitBLR(State state)
    {
        return null;
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
