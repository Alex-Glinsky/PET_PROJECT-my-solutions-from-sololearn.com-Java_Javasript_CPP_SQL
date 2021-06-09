import java.util.Scanner; //import class Scanner to get user input

public class Problem2
{
	public static void main(String[] args) {  // create main method
		try(
		Scanner scanner = new Scanner(System.in)){
		int amount = scanner.nextInt();  //get user input
		int x = 3;
		while(x>0) // create loop
		{
			
			amount=amount*9/10; //calculate remaining amount for next month
			x--; // add 1 to the number of months
		}
		System.out.println(amount); //display
		}catch(Exception e) { //process exceptions if an error has occurred
		    e.printStackTrace();
		}
	}
	
}


