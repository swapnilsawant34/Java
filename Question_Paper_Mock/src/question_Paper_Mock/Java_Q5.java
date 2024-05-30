package question_Paper_Mock;

import java.util.Scanner;

class Encrypt {
	char ch[];
	String string;

	Encrypt(String string) {
		this.string = string;
		ch = string.toCharArray(); // conversion string to array inbuilt //toCharArray is to convert in single
									// character.
	}

	void beforeEncrypt() {
		System.out.println("Before Encrypt:");
		System.out.println(string);
	}

	void afterEncrypt() {
		int count;
		for (int i = 'a'; i <= 'z'; i++) // logic for small letters
		{
			count = 0;
			for (int j = 0; j < string.length(); j++) {
				if (ch[j] == i) // ch is compare with char letter present in string then count++
				{
					count++;
				}
			}
			if (count != 0) {
				System.out.printf("%c%d", i, count); // print the count and single
			}
		}
		for (int i = 'A'; i <= 'Z'; i++) // logic for capital letters
		{
			count = 0;
			for (int j = 0; j < string.length(); j++) {
				if (ch[j] == i) // ch is compare with char letter present in string then count++
				{
					count++;
				}
			}
			if (count != 0) {
				System.out.printf("%c%d", i, count);
			}
		}
	}
}

public class Java_Q5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string:");
		String string = s.nextLine();
		Encrypt e = new Encrypt(string);
		e.beforeEncrypt();
		System.out.println("After Encrypt:");
		e.afterEncrypt();
	}
}
