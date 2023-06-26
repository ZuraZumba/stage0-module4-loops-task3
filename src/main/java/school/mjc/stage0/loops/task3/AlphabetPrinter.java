package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        for (char letter = 'a'; letter <= 'z'; letter++){
            System.out.println(letter);
        }
    }
    public static void main (String [] args){
        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();
        alphabetPrinter.printAlphabet();
    }
}
