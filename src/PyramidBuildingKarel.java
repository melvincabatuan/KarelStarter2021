
import stanford.karel.Karel;

public class PyramidBuildingKarel extends Karel {

    int count;

    public void run() {
        /**
         * main solution with decomposition into sub-problems:
         */

        //  *********************************** YOUR CODE HERE ***********************************
        while (frontIsClear()){
            putBeeper();
            move();
            count++;
        }
        putBeeper();
        count++;
        int MAX = count;
        System.out.println("count = " + count);
        turnUp();
        if (frontIsClear()){
            move();
            turnLeft();
        }
        while (frontIsClear()){
            move();
            putBeeper();
            count--;
            if (count == 2){
                break;
            }
        }
        turnUp();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        int x = 5;
        while (x > 0){
            putBeeper();
            move();
            x--;
        }
        turnUp();
        move();
        turnLeft();
        move();
        move();
        x = 3;
        while (x > 0){
            putBeeper();
            move();
            x--;
        }
        turnUp();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        x = 1;
        while (x > 0){
            putBeeper();
            move();
            x--;
        }
    }

    void turnUp(){
        if (facingEast()){
            turnLeft();
        } else if (facingWest()){
            turnLeft();
            turnLeft();
            turnLeft();
        } else if (facingSouth()) {
            turnLeft();
            turnLeft();
        }
    }



    public static void main(String []args){
        PyramidBuildingKarel myCentroidKarel = new PyramidBuildingKarel(); // creating an object
        myCentroidKarel.start(args);
    }




}
