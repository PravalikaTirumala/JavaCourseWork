package interviews;

public class StringRevWordsSplit {
public static void main(String[] args){
	
	String strarr[]= "This is the a string".split(" ");
	for(int i=(strarr.length-1);i>=0;i--){
		System.out.print(strarr[i]+" ");		
	}
}
}
