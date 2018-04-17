package interviews;

public class StringRevSubString {

	public static void main(String[] args) {
		String str="This is the message to test";
		int len=str.length();
		int word=0;
		String rev="";
		for(int i=(len-1);i>=0;i--){
			if((str.charAt(i)== ' ')){
			rev+= str.substring(i+1, len)+" ";
			len=(len)-(word+1);
			word=0;
			}
			else if(i==0){
				rev+= str.substring(i, len)+" ";	
			}
			else{
				word++;
			}                                
		}
		System.out.println(rev);


	}

}
