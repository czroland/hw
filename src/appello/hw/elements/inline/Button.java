package appello.hw.elements.inline;

import appello.hw.elements.Inline;

/**
 * The {@code Button} class represents a Button element.
 */
public class Button extends Inline {

    private static final String TAG = "button";
    private static final String DISABLED = "disabled";

    private String value;

    private boolean clickable;

    /**
     * Class constructor.
     *
     * @param value     buttons text
     * @param clickable buttons availability
     */
    public Button(String value, boolean clickable) {
        this.value = value;
        this.clickable = clickable;
    }

    /**
     * @return buttons text
     */
    public String getValue() {
        return value;
    }

    /**
     * @return buttons availability
     */
    public boolean isClickable() {
        return clickable;
    }

    /**
     * @return button tag
     */
    public static String getTAG() {
        return TAG;
    }

    /**
     * @return disabled string
     */
    public static String getDISABLED() {
        return DISABLED;
    }

    /**
     * Generates the html code of button element.
     *
     * @return string of generated code
     */
    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getStartTag())
                .append(this.getTAG());
        if (!isClickable()) {
            stringBuilder.append(" ")
                    .append(this.getDISABLED());
        }
        stringBuilder.append(this.getEndTag())
                .append(getValue())
                .append(getStartTag())
                .append(getSLASH())
                .append(getTAG())
                .append(getEndTag());

        return stringBuilder.toString();
    }
}
