package interviews;

public class StringRevUsingSBuffSbui {
public static void main(String []args){
	StringBuffer str=new StringBuffer("this is to test");
	int len=0;
	int word=0;
	StringBuffer rev=new StringBuffer() ;
	if(str != null){
		len=str.length();
		for(int i=(len-1);i>=0;i--)
		{
			if((str.charAt(i)== ' '))
				{
				rev.append(str.substring(i+1, len));
				rev.append(" ");
				len=(len)-(word+1);
				word=0;
				}
	
			else if(i==0)
			{
			rev.append(str.substring(i, len));	
			}
			else
			{
			word++;
			}
         }
	System.out.println(rev.toString());
		//rev.toString();
	}
	else{
		System.out.println("string can not be null, enter a string");
	}
	}

}



	