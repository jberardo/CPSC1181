/**
 * Student class.
 * This class models a student.
 * A student has a name and a total quiz score.
 * This class methods provide the following:
 * 		Total Score: Sum of all student's scores.
 * 		Average Score: Average of all student's quizzes.
 * 		Number of Quizzes: The total number of quizzes attempted by the student.
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since 2017-05-28
 */
public class Student {
	// attributes
	private String name;
	private int totalScore;
	private int numberOfquizzes;
	
	/**
	 * Class constructor.
	 * @param newName Name of the student.
	 */
	public Student(String newName) {
		name = newName;
	}

	/**
	 * Returns student's name.
	 * @return Student's name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Adds a quiz.
	 * Increments the total number of quizzes attempted
	 * and adds the score to the total score.
	 * @return Nothing.
	 */
	public void addQuiz(int score) {
		numberOfquizzes++;
		totalScore += score;
	}
	
	/**
	 * Returns student's total score.
	 * @return Student's total score.
	 */
	public int getTotalScore() {
		return totalScore;
	}
	
	/**
	 * Returns average score of all quizzes taken.
	 * @return Average score.
	 */
	public double getAverageScore() {
		// divide totalScore by 1.0, so the result is a double
		return ( totalScore / 1.0 ) / numberOfquizzes;
	}
	
	/**
	 * Returns the total number of quizzes taken.
	 * @return Total number of quizzes.
	 */
	public int getNumberOfQuizzes() {
		return numberOfquizzes;
	}
}