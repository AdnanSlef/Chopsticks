import java.util.ArrayList;
/**
 * A game state, with info on hands and turn.
 * Can be linked to other states.
 *
 * @author Adrian Self
 * @version V0.2.0, 07/14/2020
 */
public class State
{
    private byte[][] hands; //how many fingers on each hand?
    private byte turn; //whose turn is it?
    private boolean resolved; //has this state been resolved yet?
    private ArrayList<State> children; //states reachable by a single valid action in this state
    private ArrayList<State> parents; //states which can lead directly to this state

    /**
     * Constructor for objects of class State
     */
    public State(byte turn, byte[][] hands)
    {
        this.hands = hands;
        this.turn = turn;
        this.resolved = false;
        this.parents = new ArrayList<State>();
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
    
    public ArrayList<State> getChildren()
    {
        return children;
    }
    
    public ArrayList<State> getParents()
    {
        return parents;
    }
    
    /**
     * Recursively resolve all states reachable from this state
     * by considering valid Chopsticks moves
     */
    public void resolve(State state)
    {
        this.parents.add(state);
        
        if(this.resolved) {
            return;
        }
        
        this.resolved = true; //TODO verify that this pre-marking works as expected
        
        this.children = Logic.stateChildren(this);
        
        for(State child:this.children) {
            if(child != null){
                child.resolve(this);
            }
        }
    }
}