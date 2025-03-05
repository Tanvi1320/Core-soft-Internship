/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class NumberGame
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chances=6;
		int finals=0;
		boolean playAgain=true;
		System.out.println("WELCOME BUDDY!!");
		System.out.println("Hey Buddy you have about "+chances+" chances to win the game");
		while(playAgain){
		    int rand=getrandN(1,100);
		    boolean guess=false;
		    for(int i=0;i<chances;i++){
		        System.out.println("Chance"+(i+1)+" Enter your Guess:");
		        int user=sc.nextInt();
		        if(user==rand){
		            guess=true;
		            finals+=1;
		            System.out.println("YOU WON IT");
		            break;
		        }
		        else if(user>rand){
		            System.out.println("Too High");
		        }
		        else if(user<rand){
		            System.out.println("Too Low");
		        }
		    }
		    if(guess==false){
		        System.out.println("SORRY BUDDY YOU LOST THE CHANCES.The number is"+rand);
		    }
		    System.out.println("Do you want to play again(y/n");
		    String pA=sc.next();
		    playAgain=pA.equalsIgnoreCase("y");
		}
		System.out.println("That's it Buddy,Hope you enjoyed it.");
		System.out.println("here is your Score "+finals);
	}
		public static int getrandN(int min,int max){
		    return (int)(Math.random()*(max-min+1)+min);
		}	
		
}
