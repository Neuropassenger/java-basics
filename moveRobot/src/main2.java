public class main2 {
    public static void main(String[] args) {
        Robot robot = new Robot(100, -50, Direction.DOWN);
        moveRobot(robot, 0, -10);
        System.out.println("Робот сейчас находится в (" + robot.getX() + ", " + robot.getY() + ").");
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // Передвижение по X
        if (toX > robot.getX()) {
            changeDirection(robot, Direction.RIGHT);
            for(int i = 0, nX = toX - robot.getX(); i < nX; i++)
                robot.stepForward();
        } else if (toX < robot.getX()) {
            changeDirection(robot, Direction.LEFT);
            for(int i = 0, nX = Math.abs(toX - robot.getX()); i < nX; i++)
                robot.stepForward();
        }

        // Передвижение по оси Y
        if (toY > robot.getY()) {
            changeDirection(robot, Direction.UP);
            for(int i = 0, nY = Math.abs(toY - robot.getY()) ; i < nY; i++)
                robot.stepForward();
        } else if (toY < robot.getY()) {
            changeDirection(robot, Direction.DOWN);
            for(int i = 0, nY = Math.abs(toY - robot.getY()); i < nY; i++)
                robot.stepForward();
        }
    }

    private static void changeDirection(Robot robot, Direction neededDirection) {
        if (neededDirection == Direction.UP) {
            if (robot.getDirection() == Direction.RIGHT)
                robot.turnLeft();
            else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }
            else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
        } else if (neededDirection == Direction.RIGHT) {
            if (robot.getDirection() == Direction.DOWN)
                robot.turnLeft();
            else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
            else if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
        } else if (neededDirection == Direction.DOWN) {
            if (robot.getDirection() == Direction.LEFT)
                robot.turnLeft();
            else if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }
            else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (neededDirection == Direction.LEFT) {
            if (robot.getDirection() == Direction.UP)
                robot.turnLeft();
            else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
                robot.turnRight();
            }
            else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
        }
    }
}