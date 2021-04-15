package ass;
import java.util.HashMap;
import java.util.Map;
public class Hash2 {
public static Map<Character, Integer> countChars(char[] arr) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character character : arr) {
			Integer characterCount = map.get(character);
			if (characterCount == null) {
				characterCount = 0;
			}
			characterCount++;
			map.put(character, characterCount);
		}
		System.out.println(map);
		return null;
	}

	public static void main(String[] args) {
		char arr[] = { 'a', 'a', 'a', 'b','c' };
		countChars(arr);
	}

}
