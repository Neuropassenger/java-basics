/**
 * Created by turge on 007 07.10.16.
 */
public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);
    @Override
    void close();
}
