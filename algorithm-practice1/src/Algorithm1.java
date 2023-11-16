import java.util.Map;
import java.util.TreeMap;

public class Algorithm1 {
    // Đếm số lần xuất hiện các ký tự trong chuỗi.
    public static void CountLetter(String input) {
        Map<Character, Integer> countCharacter = new TreeMap<>();
        for (char character : input.toCharArray()) {
            if (countCharacter.containsKey(character)) {
                countCharacter.put(character, countCharacter.get(character) + 1);
            } else {
                countCharacter.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countCharacter.entrySet()) {
            System.out.println("Ký tự " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
        }
    }

    public static void main(String[] args) {
        String a = "abcbdc";
        CountLetter(a);
    }
}
