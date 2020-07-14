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
     * Validate hit
     */
    private static boolean hitValid(State state, int player, int from, int to)
    {
        return state.getTurn()==player 
            && state.getHand(player, from)!=0 
            && state.getHand(flp(player),to)!=0;
    }
    
    /**
     * Player A hits Player B's left hand with A's left
     */
    public static State hitALL(State state)
    {
        if(hitValid(state, 0, 0, 0)) {
            
        }
        return null;
    }
    
    /**
     * Player A hits Player B's right hand with A's left
     */
    public static State hitALR(State state)
    {
        if(hitValid(state, 0, 0, 1)) {
            
        }
        return null;
    }
    
    /**
     * Player A hits Player B's left hand with A's right
     */
    public static State hitARL(State state)
    {
        if(hitValid(state, 0, 1, 0)) {
            
        }
        return null;
    }
    
    /**
     * Player A hits Player B's right hand with A's right
     */
    public static State hitARR(State state)
    {
        if(hitValid(state, 0, 1, 1)) {
            
        }
        return null;
    }
    
    /**
     * Player B hits Player A's left hand with B's left
     */
    public static State hitBLL(State state)
    {
        if(hitValid(state, 1, 0, 0)) {
            
        }
        return null;
    }
    
    /**
     * Player B hits Player A's right hand with B's left
     */
    public static State hitBLR(State state)
    {
        if(hitValid(state, 1, 0, 1)) {
            
        }
        return null;
    }
    
    /**
     * Player B hits Player A's left hand with B's right
     */
    public static State hitBRL(State state)
    {
        if(hitValid(state, 1, 1, 0)) {
            
        }
        return null;
    }
    
    /**
     * Player B hits Player A's right hand with B's right
     */
    public static State hitBRR(State state)
    {
        if(hitValid(state, 1, 1, 1)) {
            
        }
        return null;
    }
    
    /**
     * Player A splits
     */
    public static State splitA(State state)
    {
        if(state.getTurn()==0) {
            if(state.getHand(0,0)==0 && state.getHand(0,1)%2==0) {
                return Game.getStates()
                    [0]
                    [state.getHand(0,1)/2]
                    [state.getHand(0,1)/2]
                    [state.getHand(1,0)]
                    [state.getHand(1,1)]
                ;
            }
            else if(state.getHand(0,1)==0 && state.getHand(0,0)%2==0) {
                return Game.getStates()
                    [0]
                    [state.getHand(0,0)/2]
                    [state.getHand(0,0)/2]
                    [state.getHand(1,0)]
                    [state.getHand(1,1)]
                ;
            }
        }
        return null;
    }
    
    /**
     * Player B splits
     */
    public static State splitB(State state)
    {
        if(state.getTurn()==0) {
            if(state.getHand(1,0)==0 && state.getHand(1,1)%2==0) {
                return Game.getStates()
                    [0]
                    [state.getHand(0,0)]
                    [state.getHand(0,1)]
                    [state.getHand(1,1)/2]
                    [state.getHand(1,1)/2]
                ;
            }
            else if(state.getHand(1,1)==0 && state.getHand(1,0)%2==0) {
                return Game.getStates()
                    [0]
                    [state.getHand(0,0)]
                    [state.getHand(0,1)]
                    [state.getHand(1,0)/2]
                    [state.getHand(1,0)/2]
                ;
            }
        }
        return null;
    }
}
