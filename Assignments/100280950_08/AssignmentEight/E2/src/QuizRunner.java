import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program to receive a list of quizzes with scores and grade letters<br>
 * The output is the average from the list of quiz scores and the quiz with maximum score 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public class QuizRunner
{
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int counter = 1;
		ArrayList<Quiz> quizList = new ArrayList<Quiz>();
		
		System.out.println("----- Please enter quiz score and letter grade (q to exit) -----");
		
		while(true)
		{
			System.out.print("Quiz[" + counter + "] score: ");
			String strScore = in.next();
			
			if (strScore.equals("q"))
			{
				break;
			}
			
			System.out.print("Grade[" + counter + "] letter grade: ");
			String grade = in.next();

			if (grade.equals("q"))
			{
				break;
			}

			double score = 0;
			
			try
			{
				score = Integer.parseInt(strScore);
			}
			catch (Exception e)
			{
				System.out.println("Score must be a number!");
				System.exit(1);
			}
			
			Quiz q = new Quiz(score, grade);
			
			quizList.add(q);
			
			counter++;
		}
		
		if (quizList.size() > 0)
		{
			Measurable[] meas = new Quiz[quizList.size()];
			
			for (int i = 0; i < quizList.size(); i++)
			{
				meas[i] = quizList.get(i);
			}
			
			System.out.printf("Average quiz score: %3.2f\n", Data.average(meas));
			System.out.println("Maximum quiz: " + ((Quiz) Data.max(meas)));			
		}
		else
		{
			System.out.println("No quiz to show.");
		}
		
		in.close();
	}
}