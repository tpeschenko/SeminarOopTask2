package Task2OOP;

public class Wall extends Obstacle{

    public Wall(int lengthObstacle) {
        super(lengthObstacle);
    }

    @Override
    boolean passingAllObstacles(AbleToJumpAbleToRun able) {
        return able.jump(lengthObstacle);
    }
}