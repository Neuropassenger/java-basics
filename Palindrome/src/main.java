/**
 * Created by turge on 002 02.10.16.
 */
public class main {
    public static void main(String[] args) {
        String text = "OllO";
        String regEx = "[^A-Za-z0-9]";
        text = text.replaceAll(regEx, "");
        StringBuilder textReverse = new StringBuilder(text);
        textReverse.reverse();
        if(text.toUpperCase().equals(textReverse.toString().toUpperCase()))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
