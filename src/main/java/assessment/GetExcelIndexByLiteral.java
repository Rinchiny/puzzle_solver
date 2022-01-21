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
}
