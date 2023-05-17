package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        if (lengthOfLastNumber <= 0) {
            System.out.println("0");
        } else {
            for (int b = 0; b <= lengthOfLastNumber; b++) {
                int x = 0;
                for (int a = 0; a < b; a++) {
                    x = x * 10 + 9;
                }
                result += x;
            }
            System.out.println(result);
        }
    }
}