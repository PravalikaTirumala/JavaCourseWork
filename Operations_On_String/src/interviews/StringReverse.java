package interviews;

public class StringReverse {
	public static void main(String[] args){
		String str="This is a message to test";
		int len=str.length();
	
	for(int i=(len-1);i>=0;i--){
		System.out.print(str.charAt(i));}	
	System.out.println();

	char[] a=str.toCharArray();
	for(int i=(a.length-1);i>=0;i--){
		System.out.print(a[i]);		
	}
	System.out.println();

	
}
}
