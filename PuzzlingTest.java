public class PuzzlingTest {
	public static void main(String[] args) {
		Puzzling testOne = new Puzzling();
		int[] x = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
		System.out.println(testOne.sumGreaterThanArray(x));

		Puzzling testTwo = new Puzzling();
		String[] xTwo = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		System.out.println(testTwo.shuffleNames(xTwo));

		Puzzling testThree = new Puzzling();
		System.out.println(testThree.shuffleLetters());

		Puzzling testFour = new Puzzling();
		System.out.println(testFour.randomNumber());

		Puzzling testFive = new Puzzling();
		System.out.println(testFive.sortRandomNumber());		

		Puzzling testSix = new Puzzling();
		System.out.println(testSix.randomString());

		Puzzling testSeven = new Puzzling();
		System.out.println(testSeven.randomStringArray());
	}
}