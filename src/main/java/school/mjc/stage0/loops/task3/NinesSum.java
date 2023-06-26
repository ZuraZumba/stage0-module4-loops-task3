package school.mjc.stage0.loops.task3;


    public class NinesSum {
        public void calculateSum(int lengthOfLastNumber) {
            int lastNumber = 0;
            for (int i = 0; i < lengthOfLastNumber; i++) {
                lastNumber = lastNumber * 10 + 9;
            }
     int sum = 0;
            for (int i = 9; i <= lastNumber; i = i * 10 + 9) {
                sum += i;
            }

            // Print the sum
            System.out.println(sum);
        }


    public static void main (String [] args){
        NinesSum ninesSum = new NinesSum();
        int n = 3;
        ninesSum.calculateSum(n);
    }
}
