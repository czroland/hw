package appello.hw.elements;

/**
 * The {@code Inline} class represents an inline element,
 * and that if the element it's in new line.
 */
public class Inline extends AbstractComponent {

    private boolean inNewLine;

    /**
     * Returns {@code true} if the element is in new line, otherwise returns {@code false}
     *
     * @return isInNewLine
     */
    public boolean isInNewLine() {
        return inNewLine;
    }

    /**
     * Set if the element is in new line
     *
     * @param inNewLine {@code true} if the element is in new line, otherwise returns {@code false}
     */
    public void setInNewLine(boolean inNewLine) {
        this.inNewLine = inNewLine;
    }

    @Override
    public String generateHTMLCode() {
        return null;
    }
}
