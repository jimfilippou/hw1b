import java.io.File;
import java.util.ArrayList;

public class ExercisesSet1 {

	public static void main(String args[]) {
		// exercise1();
		exercise2();
	}

	public static void exercise1() {
		ArrayList<Integer> list = parseData("1.1-sm.txt"); // extract numbers in increasing order
		Exercise1 exercise1 = new Exercise1(9, list); // create the object for exercise 1, implementing the previous
														// list and the required number
		int[] answers = exercise1.getAnswers(); // get the solution

		// The following table includes your solutions.
		int[] solutions = new int[2];
		solutions[0] = 18;
		solutions[1] = 23;

		// Evaluation
		if (exercise1Correction(solutions, answers))
			System.out.println("Answers are correct!");
		else
			System.out.println("Problem with your implementation.");

	}

	public static void exercise2() {
		ArrayList<Integer> list = parseData("1.2-sm.txt"); // extract numbers in random order
		Exercise2 exercise2 = new Exercise2(list); // create the object for exercise 2.
		int[] answers = exercise2.getAnswers(); // get the solution

		// The following table includes your solutions.
		ArrayList<Integer> solutions = parseData("solutions.txt"); // extract numbers in increasing order

		// Evaluation
		if (exercise2Correction(solutions, answers)) {
			System.out.println("Answers are correct!");
		}
		else {
			System.out.println("Problem with your implementation.");
		}
	}

	public static boolean exercise1Correction(int[] solutions, int[] answers) {
		if ((answers[0] == solutions[0]) && (answers[1] == solutions[1]))
			return true;
		else
			return false;
	}

	public static boolean exercise2Correction(ArrayList<Integer> solutions, int[] answers) {
		for (int i = 0; i < solutions.size(); i++) {
			if (solutions.get(i) != answers[i])
				return false;
		}
		return true;
	}

	public static ArrayList<Integer> parseData(String fileName) {
		File file = new File(fileName);
		ArrayList<Integer> list = null;
		try {
			list = (ArrayList) Utilities.convertFileSequenceToList(file);
		} catch (Exception e) {
			System.out.println("- Problem with file-reading.");
			System.out.println(file);
		}
		return list;
	}

}
