import java.util.HashMap;
import java.util.Map;

public class Main {
    public static HashMap<String, Integer> countOfElements(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {

        String[] words = {"apple", "apple", "orange", "watermelon", "watermelon", "watermelon"};
        HashMap<String, Integer> result = countOfElements(words);

        System.out.println(result);


    }
}