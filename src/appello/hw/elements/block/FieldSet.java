package appello.hw.elements.block;

import appello.hw.elements.Block;

/**
 * The {@code FieldSet} class represents a FieldSet element.
 */
public class FieldSet extends Block {

    private static final String TAG = "fieldset";

    /**
     * @return fieldset tag
     */
    public static String getTAG() {
        return TAG;
    }

    /**
     * Generates the html code of fieldset and inside element.
     *
     * @return string of generated code
     */
    public String generateHTMLCode() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getStartTag())
                .append(getTAG())
                .append(getEndTag())
                .append(getNewLine());

        generateInsideElements(stringBuilder);

        stringBuilder.append(getNewLine())
                .append(getStartTag())
                .append(getSLASH())
                .append(getTAG())
                .append(getEndTag())
                .append(getNewLine());

        return stringBuilder.toString();
    }

}
