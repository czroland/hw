package appello.hw.elements.inline;

import appello.hw.elements.Inline;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Select} class represents a Select element.
 */
public class Select extends Inline {

    private static final String TAG = "select";
    private static final String OPTION = "option";

    private List<String> options = new ArrayList<>();

    /**
     * Class constructor.
     *
     * @param options list of the selectable options
     */
    public Select(List<String> options) {
        this.options = options;
    }

    /**
     * @return select tag
     */
    public static String getTAG() {
        return TAG;
    }

    /**
     * @return option tag
     */
    public static String getOPTION() {
        return OPTION;
    }

    /**
     * @return options list
     */
    public List getOptions() {
        return options;
    }

    /**
     * Set the list of the options
     *
     * @param options the list of the options
     */
    public void setOptions(List options) {
        this.options = options;
    }

    /**
     * Generates the html code of select element with options, that was specified in {@link #options} list
     *
     * @return string of generated code
     */
    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getStartTag())
                .append(getTAG())
                .append(getEndTag())
                .append(getNewLine());

        getOptions().stream().forEach((option) -> {
            stringBuilder.append(getStartTag())
                    .append(getOPTION())
                    .append(getEndTag())
                    .append(option)
                    .append(getStartTag())
                    .append(getSLASH())
                    .append(getOPTION())
                    .append(getEndTag())
                    .append(getNewLine());
        });
        stringBuilder.append(getStartTag())
                .append(getSLASH())
                .append(getTAG())
                .append(getEndTag())
                .append(getNewLine());

        return stringBuilder.toString();
    }
}
