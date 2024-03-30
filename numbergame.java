import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random random=new Random();
		String choice="yes";
		while(choice.equalsIgnoreCase("yes"))
		{
		        boolean guess=false;
		        int attempt=0;
		        int maxattempt=7;
		        int secretno=random.nextInt(100)+1;
		        System.out.println("Welcome to the number guessing game");
		        System.out.println("I have choosen a number between 1 to 100,can you guess it");
		        while(!guess && attempt < maxattempt)
		        {
		           try
		           {
		               System.out.println("Enter your guess");
		               int n=Integer.parseInt(s.nextLine());
		               attempt++;
		               if(n==secretno)
		               {
		                   System.out.println("congratulations! you have guessed the number "+secretno+
		                   " in "+attempt+"attempts");
		                   guess=true;
		               }
		               else if(n<secretno)   System.out.println("too low! try again");
		               else System.out.println("too high! try again");
		           }
		   
		    catch(NumberFormatException e) 
		    {
		        System.out.println("Invalid input! enter a valid number");
		    }
		}
		  if (!guess) 
		   {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + secretno + ".");
           }

            System.out.print("Do you want to play again? (yes/no): ");
            choice = s.nextLine();
        }

        System.out.println("Thank you for playing!");
        s.close();
	}
}
