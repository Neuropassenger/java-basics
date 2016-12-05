/**
 * Created by turge on 007 07.10.16.
 * Программа для фильтрации комментариев по
 * - наличию спама
 * - максимальной длине
 * - негативному оттенку
 */
public class TextAnalyzerApp {
    public static void main(String[] args) {
        String text = new String("Привет, мир! Какой грустный день. А может быть?");

        String[] keywords = {"веселый", "вечер"};
        SpamAnalyzer san = new SpamAnalyzer(keywords);

        NegativeTextAnalyzer nan = new NegativeTextAnalyzer();

        TooLongTextAnalyzer tan = new TooLongTextAnalyzer(100);

        TextAnalyzer[] analyzers = new TextAnalyzer[3];
        analyzers[0] = san;
        analyzers[1] = nan;
        analyzers[2] = tan;

        System.out.println(checkLabels(analyzers, text));
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label lb = Label.OK;

        for (TextAnalyzer tan : analyzers) {
            lb = tan.processText(text);
            if (lb != Label.OK)
                break;
        }

        return lb;
    }
}
