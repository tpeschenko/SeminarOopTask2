package Task2OOP;

public class TreadMill extends Obstacle {

    public TreadMill(int lengthObstacle) {
        super(lengthObstacle);
    }

    @Override
    boolean passingAllObstacles(AbleToJumpAbleToRun able) {
        return able.run(lengthObstacle);
    }
}