package appello.hw.elements;

/**
 * The {@code AbstractComponent} class represents a possible element,
 * and contains basic HTML tags.
 */
public abstract class AbstractComponent {

    private static final String START_TAG = "<";
    private static final String END_TAG = ">";
    private static final String SLASH = "/";
    private static final String NEW_LINE = System.getProperty("line.separator");
    private static final String EQUAL = "=";
    private static final String QUOATION = String.valueOf('"');
    private static final String HTML_TAG = "html";
    private static final String HEAD_TAG = "head";
    private static final String TITLE_TAG = "title";
    private static final String DOCTYPE = "DOCTYPE";
    private static final String EXCLAMATION = "!";
    private static final String BR_TAG = "br";
    private static final String BODY_TAG = "body";

    /**
     * @return start tag
     */
    public static String getStartTag() {
        return START_TAG;
    }

    /**
     * @return end tag
     */
    public static String getEndTag() {
        return END_TAG;
    }

    /**
     * @return slash symbol
     */
    public static String getSLASH() {
        return SLASH;
    }

    /**
     * @return new line
     */
    public static String getNewLine() {
        return NEW_LINE;
    }

    /**
     * @return equal symbol
     */
    public static String getEQUAL() {
        return EQUAL;
    }

    /**
     * @return quoation symbol
     */
    public static String getQUOATION() {
        return QUOATION;
    }

    /**
     * @return html tag
     */
    public static String getHtmlTag() {
        return HTML_TAG;
    }

    /**
     * @return head tag
     */
    public static String getHeadTag() {
        return HEAD_TAG;
    }

    /**
     * @return title tag
     */
    public static String getTitleTag() {
        return TITLE_TAG;
    }

    /**
     * @return doctype string
     */
    public static String getDOCTYPE() {
        return DOCTYPE;
    }

    /**
     * @return exclamation mark
     */
    public static String getEXCLAMATION() {
        return EXCLAMATION;
    }

    /**
     * @return br tag
     */
    public static String getBrTag() {
        return BR_TAG;
    }

    /**
     * @return body tag
     */
    public static String getBodyTag() {
        return BODY_TAG;
    }

    /**
     * Abstract method for HTML CODE generation.
     *
     * @return the generated HTML code
     */
    public abstract String generateHTMLCode();
}
