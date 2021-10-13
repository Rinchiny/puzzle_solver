package code_wars.sixth_kyu;

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
