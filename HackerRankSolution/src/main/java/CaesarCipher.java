import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "www.abc.xy";
		int k = 87;
		String newValue = caesarCipher(s, k);
		System.out.println(newValue);

	}

	static String caesarCipher(String s, int k) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Integer, Character> map2 = new HashMap<Integer, Character>();

		loadMap(map1, map2);

		StringBuilder builder = new StringBuilder();
		Character newChar = null;
		for (Character ch : s.toCharArray()) {
			Integer value = map1.get(ch) != null ? map1.get(ch) : map1.get(Character.toLowerCase(ch));
			if (value != null) {
				Integer newValue = value + k <= 26 ? (value + k) : (value + k) % 26;
				newChar = map2.get(newValue);
			} else {
				newChar = ch;
			}
			if (Character.isUpperCase(ch)) {
				builder.append(String.valueOf(Character.toUpperCase(newChar)));
			} else {
				builder.append(String.valueOf(newChar));
			}
		}
		return builder.toString();
	}

	private static void loadMap(Map<Character, Integer> map1, Map<Integer, Character> map2) {
		String value = "abcdefghijklmnopqrstuvwxyz";
		int counter = 1;
		for(Character ch: value.toCharArray()){
			map1.put(ch, counter);
			map2.put(counter, ch);
			counter++;
		}
	}

}
