
public class charSearch {
	public static void main(String[] args) {
		String str="snbdfikdhbfgid";
		System.out.println(charSearch(str,'b'));
	}
	
	static int charSearch(String str, char ch) {
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				return i;
			}
		}
		return -1;
	}
}
