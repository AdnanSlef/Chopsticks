/**
 * Runs the Chopsticks game
 *
 * @author Adrian Self
 * @version V0.0.0, 07/13/2020
 */
public class Runner
{
    /**
     * A simple test which calls the Game() constructor
     * and prints "Success" if no errors occur
     */
    private static void Test1()
    {
        Game game = new Game();
        System.out.println("Success");
    }
    
    /**
     * A simple test which calls the Game() constructor
     * then calls Game.resolveStates()
     * and prints "Success" if no errors occur
     */
    private static void Test2()
    {
        Game game = new Game();
        game.resolveStates();
        System.out.println("Success");
    }
    
    public static void main(String[] args)
    {
        Test1();
    }
}
