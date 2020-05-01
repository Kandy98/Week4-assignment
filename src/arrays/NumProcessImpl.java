package arrays;

public class NumProcessImpl {
	public static void main(String[] args) {
		
		NumProcess add = (x, y) -> x + y;
		NumProcess subtract = (x, y) -> x - y;
		NumProcess multiply = (x, y) -> x * y;
		NumProcess divide = (x, y) -> {
			if (y != 0) {
				return x / y;

			} else {
				System.out.println("Cannot divide by zero!!");
				return -1;
			}
		};

		NumProcess[] operations = { add, subtract, multiply, divide };

		System.out.print("Enter two numbers: ");
		int num1 = Scan.sc.nextInt();
		int num2 = Scan.sc.nextInt();

		System.out.println("Available operations are: ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");

		System.out.print("Enter your choice(1-4): ");
		int choice = Scan.sc.nextInt();

		if (choice < 1 || choice > 4) {
			System.out.println("Invalid choice!!");
		} else {
			System.out.print("Result: ");
			System.out.println(operations[choice - 1].cal(num1, num2));
		}

	}

}
