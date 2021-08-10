import java.util.Scanner;
public class Number_Guessing_Game 
{
    public static void main(String[] args) 
    {
        int attempt = 0 ; 
        int gussedNo = 0;
        int randomNo = (int)(Math.random() * 99 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("* * * * * * * * * * * Welcome To Number Guessing Game * * * * * * * * * * *");
        System.out.println("You have maximum 5 attempts to guess the number\n");
        do 
        {            
            if (attempt < 5)
            {
                System.out.print("Enter a number between 1 to 100 : ");
                if (sc.hasNextInt()) 
                {   
                    gussedNo = sc.nextInt();
                    if (gussedNo == randomNo) 
                    {
                        System.out.println("\n* * * * * * You Win The Game :) * * * * * *");
                        break;
                    }
                    else if(gussedNo < randomNo)
                    {
                        System.out.println("Greater Number Please...");
                    }
                    else if(gussedNo > randomNo)
                    {
                        System.out.println("Smaller Number Please...");
                    }
                    else
                    {
                        System.out.println("Invalid input...");
                        break;
                    }
                    System.out.println("You have "+(4-attempt)+" attempts left..!\n");
                    attempt++;
                } 
            }
            else if (attempt == 5) 
            {
                System.out.println("* * * * * * You Lose :( * * * * * *");
                break;
            }
        } while (gussedNo != randomNo);
    }
}