package code_wars.sixth_kyu;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/541c8630095125aba6000c00">here</a>
 */
public class DigitalRoot {

    public int digitalRoot(Integer input) {
        int sum = 0;
        while (input > 0) {
            sum = sum + input % 10;
            input = input / 10;
        }
        return sum < 10 ?  sum :  digitalRoot(sum);
    }
}
