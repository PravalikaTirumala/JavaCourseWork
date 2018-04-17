/**
 * Pravalika Tirumala
 * 50180701
 * CSCI 531 Spring 2018 Lab1 Q2
 * Program reads data from Lab02PravalikaTirumala.txt file, reverses its lines, and writes them to
 * another file named Lab02PravalikaTirumalaOutput.txt
 */

	import java.io.*;
	import java.util.*;

	public class ReverseToOtherFile {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			//variables File, Scanner, PrintWriter
			File file= new File("D:\\JavaEclipseWorkspace\\Lab02PravalikaTirumala.txt");
			Scanner in = new Scanner(file); // System.in
			PrintWriter out= new PrintWriter("Lab02PravalikaTirumalaOutput.txt");
			
			//ArrayList declaration
			ArrayList<String> revFile = new ArrayList<String>();
			
			// read lines with data and adding to the ArrayList						 
			while(in.hasNextLine()){
				revFile.add(in.nextLine());
			}
			
			//Writing lines in revers order to the new file
			for(int j=revFile.size()-1;j>0;j--){
				out.write(revFile.get(j) + "\r\n");
			}
			
			in.close();
			out.close();
			
		}

	}
