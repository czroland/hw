package appello.hw.elements.block;


import appello.hw.elements.Block;
import appello.hw.enums.Alignment;

/**
 * The {@code Div} class represents a Div element.
 */
public class Div extends Block {

    private static final String TAG = "div";
    private static final String ALIGN = "alignment";

    private Alignment alignment;

    /**
     * Class constructor.
     *
     * @param alignment tags alignment
     */
    public Div(Alignment alignment) {
        this.alignment = alignment;
    }

    /**
     * @return div tag
     */
    public static String getTAG() {
        return TAG;
    }

    /**
     * @return one of {@link Alignment} values
     */
    public Alignment getAlignment() {
        return alignment;
    }

    /**
     * Set the alignment.
     *
     * @param alignment one of {@link Alignment} values
     */
    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    /**
     * @return alignment string
     */
    public static String getALIGN() {
        return ALIGN;
    }

    /**
     * Generates the html code of div and inside element.
     *
     * @return string of generated code
     */
    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder()
                .append(getStartTag())
                .append(getTAG())
                .append(" ")
                .append(getALIGN())
                .append(getEQUAL())
                .append(getQUOATION())
                .append(getAlignment().toString().toLowerCase())
                .append(getQUOATION())
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
