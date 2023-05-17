package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int a;
        int result = 0;
        for (a = firstBoarder; a <= secondBoarder; a++){
                result += a;
        }
        System.out.println(result);
    }
}
