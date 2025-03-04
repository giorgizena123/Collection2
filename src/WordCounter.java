import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        String[] words = {"ვაშლი", "ბანანი", "ვაშლი", "ფორთოხალი", "ბანანი", "ვაშლი", "ატამი"};

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);
    }
}
