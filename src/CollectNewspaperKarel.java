import stanford.karel.*;

import java.awt.*;

public class CollectNewspaperKarel extends SuperKarel { // INHERITANCE
    public void run() {
        /**
         * main solution with decomposition into sub-problems:
         * 1. Go to the newspaper (beeper)
         * 2. Pick up the newspaper (beeper)
         * 3. Go back to the initial position
         */
        goToBeeper();
        pickBeeper();
        goBack();
    }

       private void goToBeeper() {
        /**
         * Karel goes to the newspaper (beeper)
         */
        /**
         * YOUR CODE HERE
         */
    }

    private void goBack() {
        /**
         * Karel goes back to the initial position
         */
        /**
         * YOUR CODE HERE
         */

    }

    // main method (Do not modify!)
    public static void main(String []args){
        (new CollectNewspaperKarel()).start(args);
    }

}
