package Assessment.One;

import java.util.Scanner;

public class barrenmoor {
	public static void main (String args[]){
		
		Scanner ref= new Scanner(System.in);
		System.out.println("You awaken to find yourself in a barren moor. Try 'look'");
		
	boolean input=false;
		
	do {
		String look=ref.nextLine();
			if (look.equals("look")){
				input=true;
			}
			else {
				System.out.println ("Try Again!");
			}
} 
	while (input == false);

			System.out.println("Grey foggy clouds float oppressively close to you,");
			System.out.println("reflected in the murky grey water which reaches up to your shins.");
	        System.out.println("Some black plants barely poke out of the shalloow water.");
	        System.out.println("You notice a small watch like device in your left hand.");
	        System.out.println("It has hands like a watch, but the hands dont seem to tell the time");
	        System.out.println("The dial reads 5m");
	        System.out.println("Try, 'up', 'down', 'right' or 'left'.");
		}
	
	int rightleft = 5;
	int updown = -5;
	
	Scanner input= new Scanner(System.in);{

do {
	String pos=input.nextLine();{
		if (pos.equals("up")){
			updown--;
			System.out.println("Cold!");
		}
		else if (pos.equals("down")) {
				updown++;
				System.out.println("Warm!");
		} 
		else if (pos.equals("right")) {
			updown--;
			System.out.println("Warm!");
} 	
		else if (pos.equals("left")) {
			updown++;
			System.out.println("Cold!");
} 
	}
		}
	while (!(rightleft == 0 && updown == 0));

	System.out.println ("Congratulations! You found the treasure.");
	}
}
	

