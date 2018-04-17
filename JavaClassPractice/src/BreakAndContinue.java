import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//breakFunction();
		continueFunction();
		
		
	}

	/*private static void breakFunction() {
		// TODO Auto-generated method stub
		int sum = 0;
		boolean val=true;
		Scanner in= new Scanner(System.in); 
		System.out.println("enter a number");
		int num=in.nextInt(); 
		while (val){
			if (num < 0){
				System.out.println("Negative number found in the data, exiting the loop ");
				break;
				} 
			sum = sum + num; 
			System.out.println(sum);
			System.out.println("enter other number");
			num=in.nextInt(); 
			}	
	}*/

	private static void continueFunction() {
		// TODO Auto-generated method stub
		int sum = 0;
		boolean val=true;
		@SuppressWarnings("resource")
		Scanner in= new Scanner(System.in); 
		System.out.println("enter a number");
		int num=in.nextInt(); 
		while (val){
			if (num < 0){
				System.out.println("Negative number found in the data,  ");
				num=in.nextInt(); 
					continue;
				} 
			sum = sum + num; 
			System.out.println(sum);
			System.out.println("enter other number");
			num=in.nextInt(); 
			}	
	}
	
	

}
