/**
 * Program to test the student class.
 * It creates 3 students and test calling the Student object methods.
 * 
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-28
 */
public class StudentTester {
	/**
	 * This is the main method.
	 * Used to test the Student class.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// creates 3 students.
		Student joao = new Student("Joao");
		Student student2 = new Student("Student 2");
		Student student3 = new Student("Student 3");

		// add some quiz scores to the first student
		joao.addQuiz(5);
		joao.addQuiz(7);
		joao.addQuiz(9);
		joao.addQuiz(8);
		joao.addQuiz(6);
		
		// add some quiz scores to the second student
		student2.addQuiz(7);
		student2.addQuiz(6);
		student2.addQuiz(7);
		student2.addQuiz(8);
		student2.addQuiz(6);
		
		// add some quiz scores to the third student
		//student3.addQuiz(5);
		student3.addQuiz(6);
		student3.addQuiz(6);
		student3.addQuiz(7);
		student3.addQuiz(7);
		
		// print information of the first student
		printStudents(joao.getName(), joao.getNumberOfQuizzes(), 
						joao.getAverageScore(), joao.getTotalScore());
		// print information of the second student
		printStudents(student2.getName(), student2.getNumberOfQuizzes(),
						student2.getAverageScore(), student2.getTotalScore());
		// print information of the third student
		printStudents(student3.getName(), student3.getNumberOfQuizzes(),
						student3.getAverageScore(), student3.getTotalScore());
	}
	
	/**
	 * Method to print the student information.
	 * It prints the student's name, total number of quizzes taken, average score and total score on console.
	 * @param studentName Student's name
	 * @param numberOfQuizzes Number of total quizzes taken by a student
	 * @param averageScore Average score of all quizzes taken by a student
	 * @param totalScore Sum of every quiz score
	 * @return Nothing.
	 */
	private static void printStudents(String studentName, int numberOfQuizzes, double averageScore, int totalScore) {
		System.out.println("Student name: " + studentName);
		System.out.println("Number of quizzes: " + numberOfQuizzes);
		System.out.println("Average Score: " + averageScore);
		System.out.println("Total Score: " + totalScore);
		System.out.println();
	}
}