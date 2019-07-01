import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Puzzling {
	public ArrayList sumGreaterThanArray(int[] array) {
		ArrayList<Integer> greaterThanTen = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		for(int i=0; i<array.length; i++) {
			if(array[i] > 10) {
				greaterThanTen.add(array[i]);
			}
		}
		return greaterThanTen;
	}
	public ArrayList shuffleNames(String[] arrayNames) {
		ArrayList<String> nameList = new ArrayList<String>();
		for(int i=0; i<arrayNames.length; i++) {
			nameList.add(arrayNames[i]);
		}
		Collections.shuffle(nameList);
		System.out.println(nameList);
		ArrayList<String> namesGreaterThanFive = new ArrayList<String>();
		for(int i=0; i<arrayNames.length; i++) {
			String name = arrayNames[i];
			if(name.length() > 5) {
				namesGreaterThanFive.add(arrayNames[i]);
			}
		}
		return namesGreaterThanFive;
	}
	public ArrayList shuffleLetters() {
		String[] alphaArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		ArrayList<String> alphaList = new ArrayList<String>();
		for(int i=0; i<alphaArray.length; i++) {
			alphaList.add(alphaArray[i]);
		}
		Collections.shuffle(alphaList);
		alphaArray[0] = alphaList.get(0);
		alphaArray[25] = alphaList.get(25);
		System.out.println(alphaArray[25]);
		System.out.println(alphaArray[0]);
		if(alphaArray[0] == "a") {
			System.out.println("This is a vowel!");
		}
		if(alphaArray[0] == "e") {
			System.out.println("This is a vowel!");
		}
		if(alphaArray[0] == "i") {
			System.out.println("This is a vowel!");
		}
		if(alphaArray[0] == "o") {
			System.out.println("This is a vowel!");
		}
		if(alphaArray[0] == "u") {
			System.out.println("This is a vowel!");
		}
		return alphaList;
	}
	public ArrayList randomNumber() {
		ArrayList<Integer> randomList = new ArrayList<Integer>();
		for(int i=0; i<=9; i++) {
			Random number = new Random();
			randomList.add(number.nextInt(45) + 55);
		}
		return randomList;
	}
	public Integer sortRandomNumber() {
		ArrayList<Integer> randomList = new ArrayList<Integer>();
		for(int i=0; i<=9; i++) {
			Random number = new Random();
			randomList.add(number.nextInt(45) + 55);
		}
		Collections.sort(randomList);
		System.out.println(randomList);
		System.out.println(randomList.get(0));
		return randomList.get(9);
	}
	public String randomString() {
		ArrayList<String> randString = new ArrayList<String>();
		String[] alphaNum = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		for(int i=0; i<=4; i++) {
			Random letter = new Random();
			randString.add(alphaNum[letter.nextInt(35)]);
		}
		String finalString = randString.get(0) + randString.get(1) + randString.get(2) + randString.get(3) + randString.get(4);
		return finalString;
	}
	public ArrayList randomStringArray() {
		String[] randString = new String[5];
		ArrayList<String> finalArray = new ArrayList<String>();
		String[] alphaNum = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		for(int i=0; i<=4; i++) {
			Random letter = new Random();
			for(int j=0; j<=4; j++) {
				randString[j] = alphaNum[letter.nextInt(35)];
			}
			String finalString = randString[0] + randString[1] + randString[2] + randString[3] + randString[4];
			finalArray.add(finalString);
		}
		return finalArray;
	}
}