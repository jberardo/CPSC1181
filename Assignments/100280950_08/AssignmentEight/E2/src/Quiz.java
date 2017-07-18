/**
 * Quiz that implements the Measurable interface.
 * A quiz has a score and a letter grade (such as B+).
 * Data class (Exercise E10.1) to process an array of quizzes.
 * Display the average score and the quiz with the highest score (both letter grade and score).
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public class Quiz implements Measurable
{
	// instance variables
	private double score;
	private String letterGrade;
	
	/**
	 * Create a quiz with given score and letter grade
	 * @param newScore quiz score
	 * @param newLetterGrade quiz letter grade
	 */
	public Quiz(double newScore, String newLetterGrade)
	{
		this.score = newScore;
		this.letterGrade = newLetterGrade;
	}

	/**
	 * Retrieves the quiz score
	 * @return score quiz score
	 */
	public double getMeasure()
	{
		return score;
	}

	/**
	 * Retrieves the quiz letter grade
	 * @return letter grade
	 */
	public String getLetterGrade()
	{
		return letterGrade;
	}

	/**
	 * Returns a string representation of the object (score and letter grade)
	 * @return string representation of the object
	 */
	public String toString()
	{
		return "Score[" + this.score + "], Grade[" + this.letterGrade + "]";
	}
	
	/**
	 * Compares this object with a given object
	 * @param q quiz object to test this object against
	 * @return true if both objects have the same values
	 */
	public boolean equals(Quiz q)
	{
		if (this.score == q.score && this.letterGrade == q.letterGrade)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}