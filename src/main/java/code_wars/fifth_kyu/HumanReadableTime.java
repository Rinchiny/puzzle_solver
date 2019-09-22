package code_wars.fifth_kyu;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java">here</a>
 */
public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        if (seconds > 359999)
            throw new RuntimeException("Seconds exceeded range");

        int h = seconds / 3600;
        int m = (seconds - h * 3600) / 60;
        int s = seconds - (h * 3600 + m * 60);

        return (h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m) + ":" + (s < 10 ? "0" + s : s);
    }
}