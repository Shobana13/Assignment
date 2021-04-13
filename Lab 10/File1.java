package ass;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException{
		FileReader fis = new FileReader("C:\\Users\\Acer\\Desktop\\shobi.txt");
		BufferedReader bis = new BufferedReader(fis);
		String line;
		int count = 0;
		line = bis.readLine();
		count++;
		while (line != null)
		{
		System.out.println("Line number:" +count);
		System.out.println(line);
		line = bis.readLine();
		count++;
		}
		fis.close();
		
	}

}