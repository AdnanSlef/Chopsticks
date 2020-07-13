/**
 * Provides static methods for game logic
 *
 * @author Adrian Self
 * @version V0.0.0, 07/13/2020
 */
public class Logic
{
    /**
     * Player A hits Player B's left hand with A's right
     */
    public static char[] Hit_ARL(State state)
    {
        return new char[]{0,1,1,1,1}; //example; returns root state index
    }
    
    /**
     * Player A hits Player B's right hand with A's left
     */
    public static char[] Hit_ALR(State state)
    {
        return new char[]{0,1,1,1,1}; //example; returns root state index
    }
    
    /**
     * Player B hits Player A's left hand with B's right
     */
    public static char[] Hit_BRL(State state)
    {
        return new char[]{0,1,1,1,1}; //example; returns root state index
    }
    
    /**
     * Player B hits Player A's right hand with B's left
     */
    public static char[] Hit_BLR(State state)
    {
        return new char[]{0,1,1,1,1}; //example; returns root state index
    }
    
    public static char[] Split_A(State state)
    {
        return new char[]{};
    }
}
