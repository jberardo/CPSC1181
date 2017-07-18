package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DuplicateRunner
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inputFile = null;
		Scanner userInput = null;
		PrintWriter userOutput = null;

		inputFile = new File("input.txt");
		userInput = new Scanner(inputFile);

		userOutput = new PrintWriter("output.txt");
		
		userInput.close();
		userOutput.close();
	}
}