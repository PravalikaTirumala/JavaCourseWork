import java.util.Scanner;

public class Test {

	static Scanner s=new Scanner(System.in);
	//static int genarray[]=new int[3];
	static int genarray[];
	static int inparray[]=new int[3];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean loop=true;
		
		while(loop){
			inparray=inputThreeDigits();//calling method to take input 				from the user
			System.out.print("\nYou guessed: ");
				printValues(inparray);//prints user entered digits
		
				/*
				//generating 3 random numbers
				for(int i=0;i<3;i++){							
					genarray[i]=(int) (Math.random()*(10-0)+0); // 						0 is inclusive and 10 is inclusive
				}
	*/
				genarray=new int[]{6,3,1};
			System.out.print("\nwinning number is: ");
				printValues(genarray);	//prints randomly generated 						number				
			
				//comparision of user input and random number
				compare2Values(inparray,genarray);//calling method to compare each digit
		
			System.out.println("\nDo you want to play one more time ? press Y/y for yes and n/N for no");		
		
			String input=s.next();
			loop=checkInput(input);//calling method to repeat the loop	until user presses otherthan Y or N
			
					
			}
	}
	
//method to repeat the loop	
private static boolean checkInput(String input1) {
		// TODO Auto-generated method stub
		boolean value=true;
		switch(input1.toLowerCase()){
		case "y":
			value=true;
			break;
		case "n":
			value=false;
			System.out.println("Game Over");
			break;
		default:
			System.out.println("press only Y or N");
			//value=false;
			checkInput(s.next());
		}
		return value;
	}




	//method to compare input and randomly generated numbers
	private static void compare2Values(int[] inp, int[] gen) {
		// TODO Auto-generated method stub
		int samePlace=0;
		int match=0;
		int nomatch=0;
		//int matchFin=0;
		for(int i=0;i<3;i++){
	
			//match=0;
			for(int j=0;j<3;j++){
				if((i==j) && (inp[i]==gen[j])){
				samePlace++;
				gen[j]= -1;
				break;
				}
				else if(inp[i]==gen[j]){
					match++;
					//matchFin=matchFin+match;
					gen[j]= -1;
					 break;
				
				}
				else{
					nomatch++;
				}
			}
	
			
		} 
		if(samePlace == 3){//when all the places matches exactly
			System.out.println("\nYou have won $1,000,000");
		}
		else if(nomatch == 9){//when no digit matches
			System.out.println("\nYou lost the game");
		}
	
		else{
				//numOfMatches(samePlace+matchFin);
			numOfMatches(samePlace+match);
			}
			
	}

	private static void printValues(int[] array2) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			System.out.print(array2[i]);
		}
	}

	//accepting input from the user: 3 digits
	private static int[] inputThreeDigits() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			if(i==0){
				System.out.print("Enter 1st digit: ");
				inparray[i]=s.nextInt();
			}
			else if (i==1){
				System.out.print("Enter 2nd digit: ");
				inparray[i]=s.nextInt();	
			}
			else{
				System.out.print("Enter 3rd digit: ");
				inparray[i]=s.nextInt();	
			}
		}
		return inparray;
		
	}

	// method to print award winnings
	public static void numOfMatches(int number){
		System.out.println();
		switch(number){
		case 1:
			System.out.println("\nYou have won $10");
			break;
		case 2:
			System.out.println("\nYou have won $100");
			break;
		case 3:
			System.out.println("\nYou have won $1000");
			break;
		}
	}
}

