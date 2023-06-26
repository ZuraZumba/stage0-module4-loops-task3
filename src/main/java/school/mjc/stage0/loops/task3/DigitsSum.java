package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int absNumber = Math.abs(number);
        String numberString = absNumber + "";

        int sum = 0;

        for (char digitChar : numberString.toCharArray()) {
            int digit = digitChar-'0';
            sum += digit;
        }

        System.out.println(sum);
    }

}
