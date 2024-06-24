package arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str = "abhi";
		ReverseString obj = new ReverseString();
		System.out.println(obj.reverseString(str));		
	}
	
	
	public String reverseString(String str) {
		int length = str.length();
		String result = "";

		if (length == 0 || length == 1) {
			return str;
		}

		char[] charArray = str.toCharArray();

		char temp;
		for (int i = 0; i < length / 2; i++) {
			temp = charArray[i];
			charArray[i] = charArray[length - 1 - i];
			charArray[length - 1 - i] = temp;
		}
		for (int i = 0; i < length; i++) {
			result = result.concat(charArray[i] + "");
		}
		return new String(charArray);
	}

}
