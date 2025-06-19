import java.util.*;

public class WordLengthTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = extractWords(input);
        String[][] wordInfo = getWordLengthArray(words);
        displayWordLengths(wordInfo);
    }

    public static String[] extractWords(String text) {
        ArrayList<String> wordList = new ArrayList<>();
        String word = "";
        for (int i = 0; i < getStringLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    wordList.add(word);
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            wordList.add(word);
        }
        String[] result = new String[wordList.size()];
        for (int i = 0; i < wordList.size(); i++) {
            result[i] = wordList.get(i);
        }
        return result;
    }

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static void displayWordLengths(String[][] result) {
        System.out.println("Word\t\tLength");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + Integer.parseInt(result[i][1]));
        }
    }
}
