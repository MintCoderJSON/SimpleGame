import java.util.Scanner;

public class SimpleGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String username = new String();
		String firstTurn = new String();
		String invalid = new String("Invalid input, please try again.");
		int gems = 0;
		boolean blacksmithVisited = false;


		
		System.out.println("Welcome to the game! (press any key to start).");
		scanner.nextLine();
		
		System.out.println("Please enter your username:");
		username = scanner.nextLine();
		
		System.out.println("Hey! Welcome " + username + "!");
		System.out.println("Let's start right away!");
		System.out.println("/");
		System.out.println("You are a traveller, and you just arrived in Village Japparikot");
		System.out.println("Be careful! During your stay in this land, you'll have to make the right choices!");
		System.out.println("ATTENTION: To interact with the game, you'll have to type the word previously \nproposed exactly as it's written.");
		System.out.println("/");
		System.out.println("/");
		System.out.println("/");
		
		
	while (true) {
		
		System.out.println("Do you want to go: left or right?");
		firstTurn = scanner.nextLine();
		
		if(firstTurn.equals("left")) {
			System.out.println("You encountered the blacksmith's house!");
			String enterOrLeave = new String();
			
		while (true) {
			System.out.println("Do you want to: enter or leave?");
			enterOrLeave = scanner.nextLine();
			
			if(enterOrLeave.equals("enter")) {
				if(!blacksmithVisited) {
					System.out.println("\n");
					System.out.println("The blacksmith is staring at you.");
					System.out.println("\n");
					System.out.println("Blacksmith: 'Hey traveller! What are you doing here?'");
					System.out.println("\n");
					System.out.println("You: '. . .'");
					System.out.println("\n");
					System.out.println("Blacksmith: 'Alrighhtt... here, take some gems, the will be useful in case you\nmeet elves.'");
					System.out.println("\n");
					
					String takeOrDecline = new String();
					System.out.println("Do you want to: take or decline the offer?");
					takeOrDecline = scanner.nextLine();
					
					if(takeOrDecline.equals("take")) {
						gems++;
						gems++;
						gems++;

						System.out.println("\n");
						System.out.println("Blacksmith: 'Ok, here you go. Now leave.'");
						System.out.println("*you leave*");
						System.out.println("You currently have: " + gems + " gems");
						System.out.println("\n");
						
						blacksmithVisited = true;

						break;
				
					}else if(takeOrDecline.equals("decline")) {
						System.out.println("\n");
						System.out.println("Alright then leave!");
						System.out.println("*you leave*");
						System.out.println("You currently have: " + gems + " gems");
						System.out.println("\n");
						
						blacksmithVisited = true;
						
						break;
					}else {
						System.out.println(invalid);
					}

				}else {
					System.out.println("Get out! I already gave you gems! You can't have more!");
				}
				


				
				
			}else if(enterOrLeave.equals("leave")) {
				System.out.println("");
				break;
			}else {
				System.out.println(invalid);
			}
		}
			
			
			
		}else if(firstTurn.equals("right")) {
			System.out.println("You encountered a cave! There are lots of KEEP OUT signs..");
		}else {
			System.out.println(invalid);
		}
		
	
		
		
	}
			
		
		
		
	}

}
