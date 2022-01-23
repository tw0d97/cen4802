package cen4802;

public class Assignment2 {

	public static void main(String[] args) {
		
		int input = 10;
		int output = calculateFib(input);
		System.out.println("The " + input + "th term in the Fibonacci Sequence is: " + output);

	}
	
	static int calculateFib(int n) {
			
		if(n <= 1)
			return n;
		return calculateFib(n-1) + calculateFib(n-2);
			
	}

}
