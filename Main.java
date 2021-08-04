import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome(int n) {

		int r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10; // taking remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Yayy! It's a Palindrome number \n");
		else
			System.out.println("Oops! Not a Palindrome number \n ");
	}

	// function to printPattern

	public void printPattern(int n) {

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// function to check no is prime or not

	public void checkPrimeNumber(int n) {
		boolean flag = false;
		int m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println("Oops! " + n + " is not prime number\n");
		}

		else {

			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("Oops! " + n + " is  not prime number\n");
			} else {
				System.out.println("Yayy! " + n + " is   prime number\n");
			}

		}
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries(int n) {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1;

		for (int i = 1; i <= n; ++i) {
			if (i == n) {
				System.out.print(first);
			} else {
				System.out.print(first + ",");
			}

			// compute the next term
			int next = first + second;
			first = second;
			second = next;

		}
		System.out.println();
	}

	// main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;
		int number;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
			System.out.println("Selection: ");

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {
				System.out.println("Enter the number to check for Palindrome:");

				number = sc.nextInt();

				obj.checkPalindrome(number);

			}

				break;

			case 2: {
				System.out.println("Enter the number to print Pattern:");

				number = sc.nextInt();

				obj.printPattern(number);

			}

				break;

			case 3: {
				System.out.println("Enter the number to check whether it is Prime :");

				number = sc.nextInt();

				obj.checkPrimeNumber(number);

			}

				break;

			case 4: {
				System.out.println("Enter the number to print the Fibionacci series:");

				number = sc.nextInt();

				obj.printFibonacciSeries(number);

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
