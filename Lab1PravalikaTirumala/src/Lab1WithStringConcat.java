import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab1WithStringConcat {
	public static void main(String[] args)throws IOException{
	
		File file=new File("D:\\JavaEclipseWorkspace\\LablaPravalikaTirumalaData.txt");
		Scanner in=new Scanner(file);
		PrintWriter out=new PrintWriter("OutputStrngConcat.txt");
		
		String str=" ";
		
		while(in.hasNextLine()){
			str=in.nextLine()+"\r\n"+str;
			
		}
	
		out.write(str);
		
		in.close();
		out.close();	
	}
	
}
