
public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a =5;
	double b= 10;
	char c ='p';
	
	System.out.println("a = "+ a+ "b = "+b+ " c ="+c);
	System.out.println(" Hello World!");
	
	compare(a,b);
	}
	//a method to compare a and b
	public static void compare(double m, double n)
	{
		if (m>n)
		   System.out.println("a is larger");
		else
		   System.out.println("b is larger");
	}
	

}
