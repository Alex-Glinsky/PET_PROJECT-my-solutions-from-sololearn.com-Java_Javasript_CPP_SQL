import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		try 
		(Scanner scanner = new Scanner(System.in)){
		int days = scanner.nextInt();
		int result = days*86400;
  System.out.println (result);
		}catch(Exception e) { 
		    e.printStackTrace();}
		
		
	}
}