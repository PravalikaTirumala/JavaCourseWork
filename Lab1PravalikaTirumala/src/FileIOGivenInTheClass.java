/**
 * Pravalika Tirumala
 * 50180701
 * CSCI 531 Spring 2018 Lab1 Q1
 * Program reads data from LablaPravalikaTirumalaData.txt file and stores the output
 *  in the file named LablaPravalikaTirumalaOutput.txt with updated salary
 */

	import java.io.*;
	import java.util.*;

	public class FileIOGivenInTheClass {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			//variables File, Scanner, PrintWriter
			//reading file
			File file= new File("D:\\JavaEclipseWorkspace\\LablaPravalikaTirumalaData.txt");
			Scanner in = new Scanner(file); // System.in
			PrintWriter out= new PrintWriter("LablaPravalikaTirumalaOutput.txt");
			
			String lastName,firstName;
			double salary, increment ;
			
			while(in.hasNextLine()){	//runs as long as the lines with data exists
				
				lastName = in.next(); 	
				firstName = in.next();
				salary = Double.parseDouble(in.next());
				increment = Double.parseDouble(in.next());
				
				//writimg to the file with the updated salary
				out.write(firstName+" "+lastName+" ");
				out.format("%.2f",salary+(salary*increment/100)); //formatiing to 2 decimal points
				out.write("\r\n"); // next line
								
			}
			in.close();
			out.close();
	}
}
