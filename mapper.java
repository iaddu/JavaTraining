import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

class WordCount {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line);

                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken().toLowerCase();

                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            reader.close();

            for (String word : wordCountMap.keySet()) {
                System.out.println(word + ": " + wordCountMap.get(word));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
