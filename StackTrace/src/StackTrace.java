/**
 * Created by turge on 007 07.10.16.
 */
public class StackTrace {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        String str;
        try {
            throw new Exception("Исключение!");
        } catch (Exception e) {
            StackTraceElement[] elements = e.getStackTrace();
            if(elements.length < 3)
                return null;
            str = elements[2].getClassName() + "#" + elements[2].getMethodName();
        }
        return str;
    }
}
