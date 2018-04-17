package Comparision;

public class BitOperators {
 public static void main(String [] args)
 {
	/*if(Compare(5,5))
		System.out.println(" equal");
	if(!Compare(5,5))
		System.out.println("not equal");*/
	 if(Compare(5,5)==0)
			System.out.println(" equal");
		if(Compare(5,5) !=0)
			System.out.println("not equal");
	 
 }
 public static int Compare(int a, int b)
 {
	 /*boolean flag=false;
	if((a^b) ==0)
	{
		flag=true;
	}
	 return flag; */
	 return (a^b);
	 
 }
	 
}
