/**
 * Program to test the Quiz class using the Data class to calculate the average and maximum score
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public class QuizTester
{
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		// create quiz array
		Quiz[] quizList = init();
	
		// print output
		System.out.printf("Average quiz score: %3.2f\n", Data.average(quizList));
		System.out.println("Expected: 69.23");
		System.out.println("Maximum quiz: " + ((Quiz) Data.max(quizList)).toString());
		System.out.println("Expected: Score[91.8], Grade[A]");
	}
	
	public static Quiz[] init()
	{
		// create some quizzes
		Quiz q1 = new Quiz(50.5, "D");
		Quiz q2 = new Quiz(87.0, "B+");
		Quiz q3 = new Quiz(64.8, "C-");
		Quiz q4 = new Quiz(59.5, "C-");
		Quiz q5 = new Quiz(71.9, "B-");
		Quiz q6 = new Quiz(77.8, "B");
		Quiz q7 = new Quiz(49.5, "F");
		Quiz q8 = new Quiz(81.5, "B");
		Quiz q9 = new Quiz(91.8, "A");
		Quiz q10 = new Quiz(58, "C-");
	
		// add quizes to list
		Quiz[] quizList = new Quiz[10];
		
		quizList[0] = q1;
		quizList[1] = q2;
		quizList[2] = q3;
		quizList[3] = q4;
		quizList[4] = q5;
		quizList[5] = q6;
		quizList[6] = q7;
		quizList[7] = q8;
		quizList[8] = q9;
		quizList[9] = q10;
		
		return quizList;
	}
}