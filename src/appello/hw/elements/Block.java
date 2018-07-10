package appello.hw.elements;


import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Block} class represents a block element with it's
 * possible inside elements.
 */
public class Block extends AbstractComponent {

    /**
     * A list that contains {@link AbstractComponent} objects.
     */
    List<AbstractComponent> elements = new ArrayList<>();

    /**
     * The method used for generating the inside elements for the block elements.
     * If the inside element is an inline element is possible to put that in new line.
     *
     * @param stringBuilder stringbuilder object to append the element
     */
    public void generateInsideElements(StringBuilder stringBuilder) {

        getElements().stream().forEach((element) -> {
            if (element instanceof Inline) {
                if (((Inline) element).isInNewLine()) {
                    stringBuilder.append(element.getStartTag()).append(element.getBrTag()).append(element.getEndTag());
                }
            }
            stringBuilder.append(element.generateHTMLCode());
        });
    }

    /**
     * @return the elements list
     */
    public List<AbstractComponent> getElements() {
        return elements;
    }

    /**
     * Set the elements list.
     *
     * @param elements The list of the elements
     */
    public void setElements(List<AbstractComponent> elements) {
        this.elements = elements;
    }

    @Override
    public String generateHTMLCode() {
        return null;
    }
}
