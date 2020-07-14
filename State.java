/**
 * A game state, with info on hands and turn.
 * Can be linked to other states.
 *
 * @author Adrian Self
 * @version V0.1.0, 07/13/2020
 */
public class State
{
    private byte[][] hands; //how many fingers on each hand?
    private byte turn; //whose turn is it?
    private boolean resolved; //has this state been resolved yet?
    private State[] children; //states reachable by a single valid action in this state
    private State[] parents; //TODO implement

    /**
     * Constructor for objects of class State
     */
    public State(byte turn, byte[][] hands)
    {
        this.hands = hands;
        this.turn = turn;
    }
    
    public byte getTurn()
    {
        return turn;
    }
    
    public byte[][] getHands()
    {
        return hands;
    }
    
    public byte getHand(int index)//use int for simplicity
    {
        return hands[index/2][index%2];
    }
    
    public byte getHand(int player, int hand)//use int for simplicity
    {
        return hands[player][hand];
    }
    
    /**
     * Recursively resolve all states reachable from this state
     * by considering valid Chopsticks moves
     */
    public void resolve()
    {
        if(this.resolved) {
            return;
        }
        
        this.children = new State[]{ //Do I really need to include both A and B moves?
            Logic.hitALL(this),
            Logic.hitALR(this),
            Logic.hitARL(this),
            Logic.hitARR(this),
            Logic.hitBLL(this),
            Logic.hitBLR(this),
            Logic.hitBRL(this),
            Logic.hitBRR(this),
            Logic.splitA(this),
            Logic.splitB(this)
        };
        
        for(State child:this.children) {
            if(child != null){
                child.resolve();
            }
        }
    }
}