package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
//        if (firstBoarder == secondBoarder){
//            System.out.println(firstBoarder);
//        }
        int sum = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++){
            sum = sum +i;
        }
        System.out.println(sum);
    }
    public static void main (String [] args){
        RangeSum rangeSum = new RangeSum();
        int first = 2;
        int second = 2;
        rangeSum.printSumInclusive(first, second);
    }
}
