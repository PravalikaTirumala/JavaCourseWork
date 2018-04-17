package Comparision;
public class CompInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
if(equal(5,6))
{
	System.out.println("nums are equal");
}
else
{
	System.out.println("nums are not equal");	
}
	}
	public static boolean equal(int x,int y)
	{
		try
		{
		int r=1/(x-y);	
		}catch(RuntimeException e)
		{
			return true;
		}
		return false;
	}

}
