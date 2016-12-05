/**
 * Created by turge on 007 07.10.16.
 */
public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public NegativeTextAnalyzer() {
        keywords = new String[] {":(", "=(", ":|"};
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
