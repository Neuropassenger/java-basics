/**
 * Created by turge on 007 07.10.16.
 */
public class Main {
    public static void main(String[] args) {
        RobotConnectionManager woof = new Rcm();

        moveRobot(woof, 0, 0);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean flag = false;
        for (int i = 0; i < 3 && flag != true; i++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                flag = true;
            } catch (RobotConnectionException e) {
                System.out.println(e.getMessage());
            }
        }
        if (flag == false)
            throw new RobotConnectionException("Ошибка!");
    }
}
