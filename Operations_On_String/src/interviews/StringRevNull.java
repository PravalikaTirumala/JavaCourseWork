package interviews;

public class StringRevNull {

	public static void main(String[] args) {
		String str=null;
		int len=0;
		int word=0;
		String rev =null;
		if(str != null) 
		{
			len=str.length();
			for(int i=(len-1);i>=0;i--)
			{
				if((str.charAt(i)== ' '))
					{
					rev+= str.substring(i+1, len)+" ";
					len=(len)-(word+1);
					word=0;
					}
				else if(i==0)
				{
				rev+= str.substring(i, len)+" ";	
				}
				else
				{
				word++;
				}
	         }
		System.out.println(rev);
		}
		else{
			System.out.println("string can not be null, please enter a string");
		}
		}

}



		