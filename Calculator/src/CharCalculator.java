import java.util.Scanner;

public class CharCalculator {

	public static void main(String[] args) {
		System.out.println("Make your arithmetic selection from the choices below:\n");
		System.out.println(" a. Addition");
		System.out.println(" s. Subtraction");
		System.out.println(" m. Multiplication");
		System.out.println(" d. Division\n");
		System.out.print(" Your choice?");
		
		Scanner kbReader = new Scanner(System.in);
		char choice = kbReader.next().charAt(0);
		System.out.print("\nEnter first operand. ");
		double op1 = kbReader.nextDouble();
		System.out.print("\nEnter second operand.");
		double op2 = kbReader.nextDouble();
		System.out.println("");
		
		switch(choice)
		{
		case 'a': // addition
		System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2));
		break;
		
		case 's': //subtraction
		System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
		break;
		
		case 'm': // multiplication
		System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
		break;
		
		case 'd':
		System.out.println(op1 + " divided by " + op2 + " = " + (op1/op2));
		break;
		
		default:
		System.out.println("Hey you! Enter only a, s, m, or d!");
		}
	}

}