/**
 * Created by turge on 007 07.10.16.
 */
public class Rc extends Throwable implements RobotConnection {
    @Override
    public void moveRobotTo(int x, int y) {
        //throw new RobotConnectionException("connection didn't finish well"); //remember to check if your method counts till 3 before throw exception.
        System.out.println("Success"); //comment this string and uncomment previous one if you want to check connection error during moving robot
    }

    @Override
    public void close() {
        //throw new RobotConnectionException("we moved robod but couldn't close connection");
    }
}
