/**
 * A game state, with info on hands and turn.
 * Can be linked to other states.
 *
 * @author Adrian Self
 * @version V0.0.0, 07/13/2020
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
        return 0;
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
        
        this.children = new State[]{
            Logic.hitARL(this),
            Logic.hitALR(this),
            Logic.hitBRL(this),
            Logic.hitBLR(this),
            Logic.splitA(this),
            Logic.splitB(this)
        };
        
        for(State child:this.children) {
            if(child != null){
                child.resolve();
            }
        }
    }
    
    /**
     * Old strategy to
     * recursively resolve all states reachable from this state
     * by considering valid Chopsticks moves
     */
    public void old_resolve()
    {
        State[] working_children = new State[6];
        
        if(this.resolved) {
            return;
        }
        
        working_children[0] = Logic.hitARL(this);
        working_children[1] = Logic.hitALR(this);
        working_children[2] = Logic.hitBRL(this);
        working_children[3] = Logic.hitBLR(this);
        working_children[4] = Logic.splitA(this);
        working_children[5] = Logic.splitB(this);
        
        byte num_children = 0;
        for(State child:working_children) {
            if(child != null) {
                num_children++;
            }
        }
        
        this.children = new State[num_children];
        
        byte index = 0;
        for(State child:working_children) {
            if(child != null) {
                this.children[index]=child;
                index++;
            }
        }
        
        this.resolved = true;
    }
}