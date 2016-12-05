/**
 * Created by turge on 007 07.10.16.
 */
public class Rcm extends Throwable implements RobotConnectionManager {

    @Override
    public RobotConnection getConnection() {
        //throw new RobotConnectionException("you! shall not! paaaaass!");
        return new Rc(); //comment this string and uncomment previous in order to check 3 connection errors
    }
}
