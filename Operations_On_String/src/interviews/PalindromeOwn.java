package interviews;

public class PalindromeOwn {

	public static void main(String[] args){
		String str="abbbba";
		isPalindromeString(str);
		}
		
		 private static void isPalindromeString(String str) {
		        if (str == null)
		            return;
		        int length = str.length();
		       System.out.println(length / 2);
		       int count=0;
		        for(int i=0;i<length/2;i++){
		        	for(int j=length-1;j>length/2;j--){
		        		if(str.charAt(i)==str.charAt(j)){
		        			count++;
		        		}
		        		else{
		        			break;
		        			}
		        	}
		        	if(count==0)
		        		break;
		        }
		        if(count==0)
		        	System.out.println("not Palindrome");
		        else
		        	System.out.println(" Palindrome");
		        }
	}
