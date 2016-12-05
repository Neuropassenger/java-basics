/**
 * Created by turge on 007 07.10.16.
 */
public class IllegalPackageException extends Throwable {
    IllegalPackageException(String msg) {
        super(msg);
    }

    IllegalPackageException(String msg, Exception e) {
        super(msg, e);
    }
}
