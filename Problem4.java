import java.util.Scanner;

	//your code goes here


	public class Problem4 {
	    public static void main(String[ ] args) {
	    	try
	        (Scanner sc = new Scanner(System.in)){
	        int num = sc.nextInt();
	        String binary="";
	        while(num > 0) {
	           binary = (num%2)+binary;
	           num /= 2;
	        }
	        System.out.print(binary);
	        }catch(Exception e) { //process exceptions if an error has occurred
			    e.printStackTrace();
			}
	    }
	}