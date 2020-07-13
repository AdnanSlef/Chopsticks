/**
 * A game state, with info on hands and turn.
 * Can be linked to other states.
 *
 * @author Adrian Self
 * @version V0.0.0, 07/13/2020
 */
public class State
{
    private char[][] hands; //how many fingers on each hand?
    private char turn; //whose turn is it?
    private boolean resolved; //has this state been resolved yet?
    private State[] children; //states reachable by a single valid action in this state
    private State[] parents; //TODO implement

    /**
     * Constructor for objects of class State
     */
    public State(char turn, char[][] hands)
    {
        this.hands = hands;
        this.turn = turn;
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
            Logic.Hit_ARL(this),
            Logic.Hit_ALR(this),
            Logic.Hit_BRL(this),
            Logic.Hit_BLR(this),
            Logic.Split_A(this),
            Logic.Split_B(this)
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
        
        working_children[0] = Logic.Hit_ARL(this);
        working_children[1] = Logic.Hit_ALR(this);
        working_children[2] = Logic.Hit_BRL(this);
        working_children[3] = Logic.Hit_BLR(this);
        working_children[4] = Logic.Split_A(this);
        working_children[5] = Logic.Split_B(this);
        
        char num_children = 0;
        for(State child:working_children) {
            if(child != null) {
                num_children++;
            }
        }
        
        this.children = new State[num_children];
        
        char index = 0;
        for(State child:working_children) {
            if(child != null) {
                this.children[index]=child;
                index++;
            }
        }
        
        this.resolved = true;
    }
}