import java.util.Scanner;

public class WordSplitterFromMiddle {

    private static WordSplitterFromMiddle wordSplitterFromMiddle;

    private WordSplitterFromMiddle() {
    }

    public void createOutputFormString() {
        System.out.println("Please Provided the input String : ");
        String input = getScannerInput().next();
        int inputStringLength = input.length();
        int middleCharCount = inputStringLength / 2;
        int j = 0;
        System.out.println("Middle Letter Count : " + middleCharCount);
        for (int k = 0; k < inputStringLength; k++) {
            for (int i = 0; i <= j; i++) {
                if ((middleCharCount + i) < inputStringLength)
                    System.out.println(input.charAt(middleCharCount + i));
                else if (i > middleCharCount){
                    System.out.println(input.charAt(i - (middleCharCount + 1)));
                }
            }
            System.out.println("\n");
            j++;
        }
    }

    private Scanner getScannerInput() {
        return new Scanner(System.in);
    }

    public static WordSplitterFromMiddle Instance() {
        synchronized (WordSplitterFromMiddle.class) {
            if (wordSplitterFromMiddle == null)
                wordSplitterFromMiddle = new WordSplitterFromMiddle();
            return wordSplitterFromMiddle;
        }
    }
}
