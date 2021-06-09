import java.util.Scanner;

public class Problem3
{
	public static void main(String[] args) {
		try
		(Scanner scanner = new Scanner(System.in)){
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		String result = "";
		for (int i = arr.length - 1; i >= 0; i--) {
     result = result + arr[i];
  }
     System.out.println(result);
		}catch(Exception e) { //process exceptions if an error has occurred
		    e.printStackTrace();
		}
	}
}