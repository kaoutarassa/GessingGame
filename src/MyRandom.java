import java.util.Random;
import java.util.Scanner;


public class MyRandom {

	public static void main(String[] args)
	{
		Random myrandom = new Random();
		int randomInt = myrandom.nextInt(100);
		//System.out.println("Random number generated is : " + randomInt);
	
		Scanner sc = new Scanner(System.in);
		
		boolean win = false;
		int guess;
		for(int i=1;i<11;i++){
		while(win==false)
	     {			
			System.out.println("guess a number between 1 and 100 :");
			guess = sc.nextInt();
				if(guess != randomInt)
			
		    { i++;
				   win=false;
						if(guess>randomInt)
						{
							System.out.println("Less");
							
							
						}
						if(guess<randomInt)
						{
							System.out.println("More");
							 
						}
						if(i>10)
						{
						    System.out.println("Please consult a doctor !");
						    System.out.println("Game is Over !! ");
						    break;
							
						}
						
		     }
				
			  
		else if(guess==randomInt){
		win=true;
		System.out.println("Congrats!Your gess is right"); 
		System.out.println("the number was : " +randomInt);
		   if(i==1) 
			{
				
			    System.out.println("Tasleem!");
			}
			if(i<5)
			{
				  
			    System.out.println("Excellent!");
			}
			if(i==5) 
			{
				  
			    System.out.println("You can do better!");
			}
			if(i>5) 
			{
				  
			    System.out.println("Not bad!");
			}
		}
				}
			
 
	    
			 
} }
		
	    
	   

}
