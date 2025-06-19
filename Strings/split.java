import java.util.*;

public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitIntoWords(text);
        String[][] wordLengthPairs = getWordLengthPairs(words);
        int[] result = findMinMax(wordLengthPairs);

        System.out.println("Shortest word: " + wordLengthPairs[result[0]][0]);
        System.out.println("Longest word: " + wordLengthPairs[result[1]][0]);
    }

 public static String[] splitIntoWords(String text) {
    String[] words = new String[100];
    char[] word = new char[100];
    int wordIndex = 0;
    int wordCount = 0;

    for (int i = 0; i < getLength(text); i++) {
        char c = text.charAt(i);
        if (c != ' ') {
            word[wordIndex++] = c;
        } else if (wordIndex > 0) {
            words[wordCount++] = new String(word, 0, wordIndex);
            wordIndex = 0;
        }
    }

    if (wordIndex > 0) {
        words[wordCount++] = new String(word, 0, wordIndex);
    }

    String[] finalWords = new String[wordCount];
    for (int i = 0; i < wordCount; i++) {
        finalWords[i] = words[i];
    }

    return finalWords;
}


    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[][] getWordLengthPairs(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findMinMax(String[][] wordLengthPairs) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < wordLengthPairs.length; i++) {
            int len = Integer.parseInt(wordLengthPairs[i][1]);
            int minLen = Integer.parseInt(wordLengthPairs[minIndex][1]);
            int maxLen = Integer.parseInt(wordLengthPairs[maxIndex][1]);
            if (len < minLen) {
                minIndex = i;
            }
            if (len > maxLen) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
}
