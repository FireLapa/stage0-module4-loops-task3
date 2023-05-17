package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String string = Integer.toString(t);
        int lenght = string.length();
        int x = 0;
        int a = 10;
        int result = 0;
        for (int i = 0; i < lenght; i++) {
            x = t % a;
            if (x != 0) {
                t = t - x;
                result = result + (x / (a / 10));
                a *= 10;
            } else {
                t = t - x;
                a *= 10;
            }
        }
        if (result < 0) {
            result = result * (-1);
        System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}
