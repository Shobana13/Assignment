package ass;
import java.io.IOException;
import java.io.File;
public class File2 {
	public static void main(String[] args) throws IOException{
	File fis = new File("C:\\Users\\Acer\\Desktop\\shobi.txt");
	System.out.println("fileName:" +fis.getName());
	System.out.println( "file exists:"+fis.exists());
	System.out.println("Readable:"+fis.canRead());
	System.out.println(fis.canWrite()?true:false);
	System.out.println("Is a directory: "+fis.isDirectory());
	System.out.println("File size: " + fis.length() + " Bytes");
	
}
}