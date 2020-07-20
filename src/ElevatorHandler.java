import java.util.Scanner;

public class ElevatorHandler {

	public static void main(String[] args) {
		Elevator elevatorE = new Elevator(); //?
	
		
		
		Scanner input= new Scanner(System.in);
		
		
		System.out.println(elevatorE.toString());
		System.out.println("\nCurrent floor is "+elevatorE.getCurrent());
		int floors[]= {0,1,2,3,4,5}; // antal våningar= längden av matrisen
		while(true) {
			
			
			System.out.println();
			//System.out.println("Current floor is "+elevatorE.getCurrent());
			
			int destination=input.nextInt();
			
			if(destination==elevatorE.current) 
				System.out.println("\nYou are ready here");
			 //
			if(destination>elevatorE.current)
				elevatorE.goup(elevatorE.current, destination, floors.length); // go up vill specifik ha 3 parametrarna
				
				//System.out.println(current);
			
			
			if (elevatorE.current>destination)
				
				elevatorE.godown(elevatorE.current, destination, 0);
				
			System.out.println("\nCurrent floor is "+elevatorE.getCurrent());
		
	}
}
	
}