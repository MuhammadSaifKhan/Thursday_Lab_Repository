package javatraining;
public class CountTheVowel {
	public int countVowels(char[] CharArr) {
		int count = 0;
		for (char ch : CharArr) {
		
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
			try {
				if(ch=='x') {
					System.out.println("Exception is Checked");
				}
			}catch(Exception e){
				System.out.println(e);
			}

		}
		return count;

	}

	public static void main(String[] args) {
		CountTheVowel obj = new CountTheVowel();
		char[] CharArray = { 'a', 'b', 'c', 'd', 'e','x' };
		int countValueOfVowel = obj.countVowels(CharArray);
		System.out.println(countValueOfVowel);

	}

}