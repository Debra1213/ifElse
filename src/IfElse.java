import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner  scan = new Scanner(System.in);
		System.out.println("How many cars have you had before the age of 21?");
		
		int variable1=1;
		int variable2=2;
		int variable3=3;
		System.out.println();
		
		
		if( variable1 >= 1 ) {
			System.out.println ('A');
			
		}else if (variable2 >= 2 ) {
			System.out.print("B");
			
		}else if (variable3 >= 3 ) {
			System.out.print("C");
			
			
			System.out.print("number not in range");
		}
	}

}
