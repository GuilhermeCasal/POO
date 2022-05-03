package aula03;
import java.util.Scanner;
public class Ex7 {
  public static final Scanner sc= new Scanner(System.in);  
    public static void main(String[] args) {

		int secret = (int) (Math.random()*99 + 1);
		int n = Integer.MIN_VALUE;

		int currMin = 0, currMax = 100;

		int i = 0;
		while( i<10 ) {
			n = readInRange(
					"\nTentativa "+(++i)+"\nPick a number ("+currMin+","+currMax+"): ",
					currMin,
					currMax
				); 
			if( n<secret ) {
				System.out.println("Higher!");
				currMin = n+1;
			} else if( n>secret ) {
				System.out.println("Lower!");
				currMax = n-1;
			} else {
				System.out.println("Parabéns, Ganhou em "+i+" tentativas!");
				return;
			}
			System.out.printf("Pretende continuar? Prima (S)im: ");
			String ans = sc.next();
			if( ans.compareTo("S")!=0 && ans.compareTo("Sim")!=0 && ans.compareTo("s")!=0 ) break;
		}
		System.out.println("You run out of tries :(");

		sc.close();
	}
    
    public static Double readDouble(String text) {
		while(true) {
			System.out.print(text);
			if(!sc.hasNextDouble()) {
				System.out.println("Not a Number!");
				sc.next();
				continue;
			}
			return sc.nextDouble();
		}
	}
    public static int readInteger(String text) {
		while(true) {
			System.out.print(text);
			if(!sc.hasNextInt()) {
				System.out.println("Not a Number!");
				sc.next();
				continue;
			}
			return sc.nextInt();
		}
	}

	// read a double in a interval [min,max]
	public static Double readInRange(String text, double min, double max) {
		double n;
		while( true ) {
			System.out.print(text);
			if(!sc.hasNextDouble()) {
				sc.next();
				continue;
			}
			n = sc.nextDouble();
			if( n>=min && n<=max ) // if number in range
				break;
			else
				System.out.println("Number not in range!");
		}
		return n;
	}

	// read a integer in a interval [min,max]
	public static int readInRange(String text, int min, int max) {
		int n;
		while( true ) {
			System.out.print(text);
			if(!sc.hasNextInt()) {
				sc.next();
				continue;
			}
			n = sc.nextInt();
			if( n>=min && n<=max ) // if number in range
				break;
			else
				System.out.println("Number not in range!");
		}
		return n;
	}
}
