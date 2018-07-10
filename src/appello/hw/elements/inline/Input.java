package appello.hw.elements.inline;


import appello.hw.elements.Inline;

/**
 * The {@code Input} class represents a Input element.
 */
public class Input extends Inline {

    private static final String TAG = "input";
    private static final String DISABLED = "disabled";
    private static final String PLACEHOLDER = "placeholder";


    private String placeHolderText;

    private boolean available;

    /**
     * Class constructor.
     *
     * @param placeHolderText placeholder of input tag
     * @param available       availability of input tag
     */
    public Input(String placeHolderText, boolean available) {
        this.placeHolderText = placeHolderText;
        this.available = available;
    }

    /**
     * @return input tag
     */
    public static String getTAG() {
        return TAG;
    }

    /**
     * @return placeholders text
     */
    public String getPlaceHolderText() {
        return placeHolderText;
    }

    /**
     * Set the placeholders text.
     *
     * @param placeHolderText placeholders text
     */
    public void setPlaceHolderText(String placeHolderText) {
        this.placeHolderText = placeHolderText;
    }

    /**
     * @return {@code true} if the input tag is available otherwise {@code false}
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Set the input tag availability.
     *
     * @param available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * @return disabled string
     */
    public static String getDISABLED() {
        return DISABLED;
    }

    /**
     * @return placeholder string
     */
    public static String getPLACEHOLDER() {
        return PLACEHOLDER;
    }

    /**
     * Generates the html code of input element.
     *
     * @return string of generated code
     */
    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getStartTag())
                .append(this.getTAG());
        if (!isAvailable()) {
            stringBuilder.append(" ")
                    .append(getDISABLED());
        }
        stringBuilder.append(" ")
                .append(getPLACEHOLDER())
                .append(getEQUAL())
                .append(getQUOATION())
                .append(getPlaceHolderText())
                .append(getQUOATION())
                .append(getEndTag())
                .append(getNewLine());

        return stringBuilder.toString();
    }
}
