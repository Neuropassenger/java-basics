/**
 * Created by turge on 007 07.10.16.
 */
public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    public Label processText(String text) {
        for (String word : getKeywords()) {
            if(text.contains(word)) {
                return getLabel();
            }
        }

        return Label.OK;
    }
}
