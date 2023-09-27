package numbers;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatingLetters {

	public static void main(String[] args) 
	{
		String input = "aapppttiiiie";
        Map<Character, Integer> letterCounts = new HashMap<>();

        for (char c : input.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }

        System.out.println("Letter frequencies:");
        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
		

	}

}
