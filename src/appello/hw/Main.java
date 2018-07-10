package appello.hw;

import appello.hw.elements.AbstractComponent;
import appello.hw.elements.block.Div;
import appello.hw.elements.block.FieldSet;
import appello.hw.elements.block.Table;
import appello.hw.elements.inline.Input;
import appello.hw.elements.inline.Select;
import appello.hw.enums.Alignment;
import appello.hw.elements.inline.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * The program implements an application that
 * displays some HTML elements to the standard output.
 */
public class Main {

    /**
     * This method is used for display the skeleton HTML page with
     * the received element in the standard output.
     *
     * @param component an abstract component that must be displayed
     */
    public static void display(AbstractComponent component) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(component.getStartTag())
                .append(component.getEXCLAMATION())
                .append(component.getDOCTYPE())
                .append(" ")
                .append(component.getHtmlTag())
                .append(component.getEndTag())
                .append(component.getNewLine())

                .append(component.getStartTag())
                .append(component.getHtmlTag())
                .append(component.getEndTag())
                .append(component.getNewLine())

                .append(component.getStartTag())
                .append(component.getHeadTag())
                .append(component.getEndTag())
                .append(component.getStartTag())
                .append(component.getTitleTag())
                .append(component.getEndTag())
                .append("Sample Page")
                .append(component.getStartTag())
                .append(component.getSLASH())
                .append(component.getTitleTag())
                .append(component.getEndTag())
                .append(component.getStartTag())
                .append(component.getSLASH())
                .append(component.getHeadTag())
                .append(component.getEndTag())
                .append(component.getNewLine())

                .append(component.getStartTag())
                .append(component.getBodyTag())
                .append(component.getEndTag())
                .append(component.getNewLine())

                .append(component.generateHTMLCode())

                .append(component.getStartTag())
                .append(component.getSLASH())
                .append(component.getBodyTag())
                .append(component.getEndTag())
                .append(component.getNewLine())

                .append(component.getStartTag())
                .append(component.getSLASH())
                .append(component.getHtmlTag())
                .append(component.getEndTag())
                .append(component.getNewLine());

        System.out.println(stringBuilder.toString());
    }

    /**
     * Main method with some sample inputs.
     *
     * @param args
     */
    public static void main(String[] args) {
        Table table = new Table(true, 3, 1);

        Div div = new Div(Alignment.CENTER);

        Input input = new Input("pholder", true);
        //display(input);

        Button button = new Button("button", false);
        button.setInNewLine(true);

        FieldSet fieldSet = new FieldSet();
        fieldSet.getElements().add(table);
        //display(fieldSet);

        table.getElements().add(button);
        div.getElements().add(button);
        //display(div);

        List<String> options = new ArrayList<>();
        options.add("apple");
        options.add("pear");
        Select select = new Select(options);

        //display(select);
    }
}
