import java.util.Scanner;


/**
 * @author anandpatel
 *	Answer 2
 */
public class Test2
{
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);   //create Scanner object
		String testString=in.nextLine();	//take input String 
		
		System.out.println(start(testString));
		in.close();
	}
	
	/**
	 *  Take a String as parameter and remove the consecutive dulicate characters from it keeping the original order and return it. 
	 */
	public static String start(String testString)
	{
		char lastchar=testString.charAt(0);	//keeping track of last char
		String answer=""+lastchar;
		for(int i=1;i<testString.length();i++)
		{
			if(testString.charAt(i)==lastchar)	//if consecutive duplicate char is there then skip it
				continue;
			
			lastchar=testString.charAt(i);
			answer+=lastchar;
		}
		return answer;	//return answer 
	}
}
