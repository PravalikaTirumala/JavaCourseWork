/*
 * LotteryPravalikaTirumala.java
 * @ generates 3 digits and compares them with the user input digits and awards with cash 
 * based on the number of digits guessed correctly
 * @author: Pravalika Tirumala
 * @ Assignment CSCI 531 Bonus exercise
 * CWID 50180701 
 */
import java.util.Scanner;

public class LotteryPravalikaTirumala {
	static Scanner s=new Scanner(System.in);
//	static int genarray[]=new int[3];
	static int genarray[];
	static int inparray[]=new int[3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		inparray=inputThreeDigits();
		System.out.print("\nYou guessed: ");
		printValues(inparray);
		/*
		//generating 3 random numbers
		for(int i=0;i<3;i++){
			genarray[i]=(int) (Math.random()*(10-0)+0); // 0 is inclusive and 10 is inclusive
		}*/
		genarray=new int[]{6,6,1};
	
		System.out.print("\nwinning number is: ");
		printValues(genarray);
			
		//comparision of user input and random numbers
		compare2Values(inparray,genarray);

	}
	
	//method to compare input and randomly generated numbers
	private static void compare2Values(int[] inp, int[] gen) {
		// TODO Auto-generated method stub
		int samePlace=0;
		int match=0;
		int nomatch=0;
		int matchFin=0;
		for(int i=0;i<3;i++){
			match=0;
			for(int j=0;j<3;j++){
				if((i==j) && (inp[i]==gen[j])){
				samePlace++;	
				}
				else if(inp[i]==gen[j]){
					if(match>=1)
						break;
					else
					match++;
				}
				else{
					nomatch++;
				}
			}
			matchFin=matchFin+match;
			
		}
		if(samePlace == 3){//when all the places matches exactly
			System.out.println("\nYou have won $1,000,000");
		}
		else if(nomatch == 9){//when no digit matches
			System.out.println("\nYou lost the game");
		}
		else{//mixture of matching and non matching
			if(matchFin==0 || matchFin-samePlace==0 )
				numOfMatches(samePlace);
			else
				numOfMatches(matchFin-samePlace);
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


