// Emoji Builder Scaffold Code

import bridges.games.NonBlockingGame;
import bridges.base.Color;
import bridges.base.NamedColor;
import bridges.base.NamedSymbol;

public class EmojiBuilder extends NonBlockingGame {
    // Grid must be less than 1024 cells total. The largest square grid is 32 x 32

    // class (static) variables -- numRows, numCols
    private static int numRows = 10; // change the numRows dimension if you would like
    private static int numCols = 10;
    //YOUR LINE OF CODE HERE:

    // constructor
    public EmojiBuilder(int assid, String login, String apiKey, int numRows, int numCols) {
        super(assid, login, apiKey, numRows, numCols);
        // set game title
        setTitle("Give you emoji a title");
        // Set a description which will show under the title
        setDescription("Give your emoji a description");
        // start method
        initialize();
        start();
    }

    //main method
    public static void main(String args[]) {
        // Create an EmojiBuilder object -- Don't forget to fill in your assignment number, username, and apiKey
        // (numRows and numCols values are passed in from the class variables above)
        EmojiBuilder emoji = new EmojiBuilder(0, "jpreble", "250600616660", numRows, numCols);
    }

    // initialize
    public void initialize() {
        // Use nested loops to set the background color of your emoji
        // HINT: Remember that getBoardHeight() and getBoardWidth() exist for your use
        // YOUR CODE HERE:+
        for(int r = 0; r < getBoardHeight(); r++){
            for(int c = 0; c < getBoardWidth(); c++){
                setBGColor(r,c, NamedColor.lightyellow);
            }
        }
        // use setBGColor calls for your emoji
        // for example:
        //setBGColor(2,3, NamedColor.darkmagenta);
        //setBGColor(2,5, NamedColor.darkmagenta);
        //YOUR CODE HERE:
        //Fills top of head with hair
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < getBoardWidth(); j++){
                setBGColor(i,j, NamedColor.saddlebrown);
            }
        }
        //Loop to fill left eyeball 3x3 with white
        for(int i = 2; i<5; i++){
            for(int j=1; j<4; j++){
                setBGColor(i, j, NamedColor.white);
            }
        }
        //loop to fill right eyeball 3x3 with white
        for(int i = 2; i<5; i++){
            for(int j=6; j<9; j++){
                setBGColor(i, j, NamedColor.white);
            }
        }
        //Hair in front of eyes
        setBGColor(2,0, NamedColor.saddlebrown);
        setBGColor(2,1, NamedColor.saddlebrown);
        setBGColor(2,2, NamedColor.saddlebrown);
        setBGColor(2,3, NamedColor.saddlebrown);
        //Pupils
        setBGColor(4, 1, NamedColor.black);
        setBGColor(2, 8, NamedColor.black);
        //Teeth
        setBGColor(6, 4, NamedColor.white);
        setBGColor(6, 5, NamedColor.white);
        //Mouth
        setBGColor(7, 4, NamedColor.black);
        setBGColor(7, 5, NamedColor.black);
        //Tongue
        setBGColor(8, 4, NamedColor.red);
        setBGColor(8, 5, NamedColor.red);

    }

    // gameloop
    public void gameLoop() {
        // Since we are drawing only once (this is not a game yet),
        // we do not need any code inside the gameLoop() method.
    }
} // end class

