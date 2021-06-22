import stanford.karel.Karel;

public class MidpointFindingKarel extends Karel {
    public void run() {
        /**
         * main solution with decomposition into sub-problems:
         * 1. Mark the length with beepers
         * 2. Get center by removing beepers on opposite ends
         *  until no beeper is left
         */
        putMarkers();
        getMarkers();
    }

    private void getMarkers() {
        /**
         * Karel finds the middle by picking beepers on opposite
         * ends, until no beeper is left
         */
        while (beepersPresent()) {
            while (beepersPresent() && frontIsClear()) {
                move();
            }
            turnAround();
            if (frontIsClear()) {
                move();
            }
            pickBeeper();
            if (frontIsClear()) {
                move();
            }
        }
        aboutFace();
    }

    private void putMarkers() {
        /**
         * Karel puts beepers as markers of visited corners
         * Note: Karel's final action is to turn around and move forward
         */
        while (frontIsClear()) {
            move();
            putBeeper();
        }
        aboutFace();
    }

    private void aboutFace() {
        /**
         * Karel turns around in opposite direction,
         * picks up beeper and move forward
         */
        turnAround();
        if (beepersPresent()) {
            pickBeeper();
        }
        if (frontIsClear()) {
            move();
        }
    }

    private void turnAround() {
        /**
         * Karel turns around in opposite direction
         */
        turnLeft();
        turnLeft();
    }

    public static void main(String[] args) {
        (new MidpointFindingKarel()).start(args);
    }
}
