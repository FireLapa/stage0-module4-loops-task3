package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int a = 0;
        int b = 0;
        int i = 0;
        if (first > second) {
            a = first;
            b = second;
        } else if (second > first) {
            a = second;
            b = first;
        } else {
            a = b = first = second;
        }
        if (a == b) {
            System.out.println(a);
        } else if (b == 0) {
            System.out.println(a);
        } else {
            for (i = 2; i < b; i++) {
                if (a % i == 0 & b % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
