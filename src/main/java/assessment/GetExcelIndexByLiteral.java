package assessment;

public class GetExcelIndexByLiteral {

    public int getIndexByLiteral(String literal) {
        int result = 0;
        for (int i = 0; i < literal.length(); i++) {
            result *= 26;
            result += literal.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public int getIndexByLiteral2(String literal) {
        var charArray = literal.toCharArray();
        var accum = 0;
        for (int i = 0; i < charArray.length; i++) {
            var c = charArray[charArray.length - 1 - i];
            accum += ((c - 'A' + 1) * Math.pow(26, i));
        }

        return accum;
    }
}
