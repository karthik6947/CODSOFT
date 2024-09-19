import java.util.Scanner;
import java.util.Random;
class Guessing
{
	
	public static void main(String[] args) 
	{
		Scanner myObj= new Scanner(System.in);
		int score=0;
		System.out.println("Welcome to the Number Guessing Game");
		System.out.println("Guess The Number And Win the Game");
		Random rand=new Random();
		int r=rand.nextInt(100)+1;
		System.out.println(r);
		System.out.println("Enter the Required No.of Chhances to Guess the Number: ");
		int chances=myObj.nextInt();
		System.out.println("you have " + chances + " chances to Guess The Number");
		System.out.println("Guess the number within the chances");
		for (int i=1;i<=chances ;i++)
		{
			System.out.println("Enter the Guessing Number: ");
			int guess=myObj.nextInt();
			if (guess==r)
			{
			System.out.println("YOU GUESSED THE CORRECT NUMBER "+ r);
            score = 100 - ((i - 1) * (100 / chances));
			System.out.println("Your score is :"+ score);
			System.out.println("You Guessed the right number in "+ i +"chance ");
			
			break;
			}
			else{
				if (guess<r)
				{
					
					System.out.println("Your Guess is less than The Actual Number");
					System.out.println("TRY AGAIN");
					
				}
				if (guess>r)
				{
					
					System.out.println("Your Guess is greater than The Actual Number");
					System.out.println("TRY AGAIN");
				}
				
				
		        if(i==chances)
		        {
		 	System.out.println("your out of chances,Your score is zero");
		        }
			}
		}
			
		
	}
}
