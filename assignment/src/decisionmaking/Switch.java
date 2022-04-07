package decisionmaking;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("Welcome");
			case 2:
				System.out.println("Harish");
				break;
			case 3:
				System.out.println("RRR");
				break;
			case 4:
				System.out.println("Ash");
				break;
			default:
				System.out.print("Invalid data");
s.close();		}

	}

}
