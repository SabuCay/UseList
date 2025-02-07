import java.util.*;
import java.io.*;

public class UseList {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("mobydick.txt"));
		List<String> words = new ArrayList<>();
		readFile(input, words);

		System.out.println("Removing the word...");
		int count = 0;
		while(!words.isEmpty())
		{
			words.remove(0);
			count++;
		}
		System.out.println("Done... "+count);

	}

	
	public static void readFile(Scanner input, List<String> words)
	{
		System.out.println("Reading the file...");
		
		while(input.hasNext())
		{
			String word = input.next();
			words.add(word);
		}
	}

}
