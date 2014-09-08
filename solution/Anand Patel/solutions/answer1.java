import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author anandpatel
 *Answer 1
 */
public class Test1 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in); //create Scanner object
		String inputString =in.nextLine();	//take input String 
		
		System.out.println(start(inputString));
		in.close();	
	}
	
	/**
	 *  Take a String from as parameter and remove the dulicate characters from it keeping the original order and return it. 
	 */
	private static String start(String inputString)
	{
		
		String answer="";
		ArrayList<Character> list=new ArrayList<Character>();//for storing all previous char 
		for(int i=0;i<inputString.length();i++)
		{
			if(list.contains(inputString.charAt(i))) //if duplicate character occure than skip it
			{
				continue;
			}
			answer+=inputString.charAt(i);	
			list.add(inputString.charAt(i));
		}
		return answer;	//return answer
				
	}
}
