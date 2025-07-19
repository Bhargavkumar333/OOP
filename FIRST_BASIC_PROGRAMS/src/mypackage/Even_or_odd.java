package mypackage;

public class Even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number:");
	        int number = scanner.nextInt();
	        if (number % 2 == 0) {
	            System.out.println("The number is even.");
	        } else {
	            System.out.println("The number is odd.");
	        }

	        scanner.close();
	    }
	}
	
