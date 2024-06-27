package hashtables;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "swiss";
		String str2 = "aabbccdd";
		String str3 = "akakfhheelloob";

		FirstNonRepeatingChar obj = new FirstNonRepeatingChar();
		System.out.println(obj.firstNonRepeatingChar(str));
		System.out.println(obj.firstNonRepeatingChar(str2));
		System.out.println(obj.firstNonRepeatingChar(str3));
		

	}
	
	public Character firstNonRepeatingChar(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = str.toLowerCase().toCharArray();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (char c : charArray) {
			if (map.get(c) == 1) {
				return c;
			}
		}
		return null;
	}

}
