/**
 * Created by turge on 007 07.10.16.
 */
public class StolenPackageException extends Throwable {
    StolenPackageException(String msg) {
        super(msg);
    }

    StolenPackageException(String msg, Exception e) {
        super(msg, e);
    }
}
