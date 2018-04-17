package interviews;

public class Swap {
public static void main(String [] args){
	int a=9;int b=5;
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println();
	
	System.out.println("a is:"+a);
	System.out.println("b is:"+b);
	
	a=9;b=5;
	
	a=a-b;
	b=a+b;
	a=b-a;
	System.out.println();
	
	System.out.println("a is:"+a);
	System.out.println("b is:"+b);
	
	a=9;b=5;
	
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println();
	
	System.out.println("a is:"+a);
	System.out.println("b is:"+b);
	
}
}
