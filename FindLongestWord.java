// Program Written by Muhammad Saif Khan 
// Given Program gives the code for LongestWord in a text file
// Program is written under package javatraining 
// FileNotFoundException used here is displayed when the attempt to open the file has failed
// Scanner is a class which take input from a user for any primitive datatype
package javatraining;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FindLongestWord {
	public static void main(String[] args) throws FileNotFoundException {
		new FindLongestWord().getLongestWords();
	}

	public String getLongestWords() throws FileNotFoundException {

		String longestWord = "";
		String current;
		Scanner scan = new Scanner(new File("C:\\Users\\muham\\OneDrive\\Desktop\\LLOFA.txt"));//path of the file

		while (scan.hasNext()) {
			current = scan.next();
			if (current.length() > longestWord.length()) {
				longestWord = current;
			}

		}
		System.out.println(longestWord);
		return longestWord;
	}

}