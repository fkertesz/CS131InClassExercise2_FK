import java.io.*;
import java.util.*;

public class ExceptionsTwo
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("test.dat");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
		
		scan.close();
	}	
}
