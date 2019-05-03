import java.util.Scanner;

public class Assignment14_1_1
{
	public static int handshake(int hands)
	{
		if (hands < 2)
			return hands - 1;
		else
			return hands - 1 + handshake(hands - 1);
	}
	
	public static void main(String[] args)
	{
		int numberOfHands;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number the number of people in the room:");
		numberOfHands=input.nextInt();
		for (int i = 1; i <= numberOfHands; i++)
			//System.out.println(handshake(i));
			System.out.println("With " + i + " persons in the room there will be " +handshake(i) + " handshakes.");
	}
}