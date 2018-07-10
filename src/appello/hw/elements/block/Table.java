package appello.hw.elements.block;

import appello.hw.elements.Block;

/**
 * The {@code Table} class represents a Table element.
 */
public class Table extends Block {

    private static final String TABLE_TAG = "table";
    private static final String ROW_TAG = "tr";
    private static final String BORDER = "bordered";
    private static final String COLUMN_TAG = "td";

    private boolean bordered;
    private int rowNumber;
    private int columnNumber;

    /**
     * Class constructor.
     *
     * @param bordered     if is bordered
     * @param rowNumber    number of rows
     * @param columnNumber number of columns
     */
    public Table(boolean bordered, int rowNumber, int columnNumber) {
        this.bordered = bordered;
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
    }

    /**
     * @return bordered string
     */
    public static String getBORDER() {
        return BORDER;
    }

    /**
     * @return {@code true} if table is bordered, otherwise {@code false}
     */

    public boolean isBordered() {
        return bordered;
    }

    /**
     * Set the border.
     *
     * @param bordered {@code true} if table is bordered, otherwise {@code false}
     */
    public void setBordered(boolean bordered) {
        this.bordered = bordered;
    }

    /**
     * @return number of rows.
     */
    public int getRowNumber() {
        return rowNumber;
    }

    /**
     * Set number of rows.
     *
     * @param rowNumber number of rows
     */
    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    /**
     * @return number of columns
     */
    public int getColumnNumber() {
        return columnNumber;
    }

    /**
     * Set number of columns.
     *
     * @param columnNumber numer of columns
     */
    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    /**
     * @return table tag
     */
    public static String getTableTag() {
        return TABLE_TAG;
    }

    /**
     * @return row tag
     */
    public static String getRowTag() {
        return ROW_TAG;
    }

    /**
     * @return column tag
     */
    public static String getColumnTag() {
        return COLUMN_TAG;
    }

    /**
     * Generates the html code of table element and inside elements.
     *
     * @return string of generated code
     */
    public String generateHTMLCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getStartTag())
                .append(getTableTag());
        if (isBordered()) {
            stringBuilder.append(" ")
                    .append(getBORDER())
                    .append(getEQUAL())
                    .append(getQUOATION())
                    .append("1")
                    .append(getQUOATION());
        }
        stringBuilder.append(getEndTag())
                .append(getNewLine());

        for (int i = 0; i < getRowNumber(); i++) {
            stringBuilder.append(getStartTag())
                    .append(getRowTag())
                    .append(getEndTag())
                    .append(getNewLine());

            for (int j = 0; j < getColumnNumber(); j++) {
                stringBuilder.append(getStartTag())
                        .append(getColumnTag())
                        .append(getEndTag())
                        .append(getStartTag())
                        .append(getSLASH())
                        .append(getColumnTag())
                        .append(getEndTag());
            }
            stringBuilder.append(getNewLine())
                    .append(getStartTag())
                    .append(getSLASH())
                    .append(getRowTag())
                    .append(getEndTag());
        }

        generateInsideElements(stringBuilder);

        stringBuilder.append(getNewLine())
                .append(getStartTag())
                .append(getSLASH())
                .append(getTableTag())
                .append(getEndTag());

        return stringBuilder.toString();
    }
}
