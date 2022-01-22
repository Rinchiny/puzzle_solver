package assessment;

public class FindIndexOfSubstring {

    public int findIndexOfSubstring(String string, String substring) {
        if (substring.length() > string.length())
            return -1;
        var indexCandidate = -1;
        var substringIndex = 0;
        var s1 = string.toCharArray();
        var s2 = substring.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            if (s1.length - s2.length < i && indexCandidate == -1)
                return -1;
            if (substringIndex == s2.length - 1)
                return indexCandidate;
            if (s1[i] == s2[substringIndex]) {
                if (indexCandidate == -1)
                    indexCandidate = i;
                substringIndex++;
            } else {
                indexCandidate = -1;
                substringIndex = 0;
            }
        }
        return indexCandidate;
    }
}
