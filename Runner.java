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
    
    /**
     * A unit test to verify that state.getHand(index)
     * is working properly
     */
    private static void TestGetHandsIndex()
    {
        Game game = new Game();
        game.resolveStates();
        for(byte i=0;i<4;i++) {
            System.out.print(game.getStates()[0][1][2][3][4].getHand(i));
        }
        System.out.println("\nCompleted. Should read 1234");
    }
    
    public static void main(String[] args)
    {
        Test1();
        Test2();
        TestGetHandsIndex();
    }
}
