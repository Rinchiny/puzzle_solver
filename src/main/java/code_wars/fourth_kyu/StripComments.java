package code_wars.fourth_kyu;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/strip-comments/train/java">here</a>
 */
public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {

        StringBuilder commentSymbolsRegExBuilder = new StringBuilder("(");
        for (int i = 0; i < commentSymbols.length; i++) {
            String symbol = commentSymbols[i];
            commentSymbolsRegExBuilder.append(symbol.equals("$") ? "\\$" : symbol);
            if (i < commentSymbols.length -1) {
                commentSymbolsRegExBuilder.append("|");
            } else commentSymbolsRegExBuilder.append(")");
        }
        String commentSymbolsRegEx = "(" + commentSymbolsRegExBuilder.toString() + ".*" + "(\\n|$)" + ")";

        StringBuilder resultText = new StringBuilder();
        String[] textLines = text.split("\n");
        for (int i = 0; i < textLines.length; i++) {
            String textLine = textLines[i];
            textLine = textLine.replaceFirst(commentSymbolsRegEx, "");
            textLine = textLine.stripTrailing();
            resultText.append(textLine);
            if (i < textLines.length - 1) {
                resultText.append("\n");
            }
        }

        return resultText.toString();
    }
}