import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//throws FileNotFoundException - no handling
		//try catch - we can hanlde what to do when the exception arises 
		
		try {
			RandomAccessFile file=new RandomAccessFile("input.dat","rw");
			file.writeUTF("hello world");
			file.seek(8);
			file.writeUTF("its me");
			file.seek(0);
			String str;
			while(file.getFilePointer() < file.length()){
				str=file.readUTF();
				System.out.println(str);
			}
			file.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //print the track of exception
		}
		catch (IOException e){
			System.out.println("This is IO Exception"); // to print a msg	
		}
	
	
	
	}

}
