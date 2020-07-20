
public class Elevator {
	int topfloor=6;
	int current=0;
	int lowestfloor=0;
	void goup(int currentfloor, int travel, int total) { // void inte returnar

		if (travel > total)
			
			System.out.println("\n" + "Topfloor is " + topfloor +"\n\nTry again ");
		else
			
			for (int i = currentfloor; i < travel; i++) {
				current++;
				System.out.println();
				System.out.println(i + 1 + " Pling");
				
				
			}
		}

	void godown(int currentfloor, int travel, int toolow) {
		
	
		if(travel<toolow)
			System.out.println("\nYou can't go lower then " + lowestfloor+ "\n\nTry again ");
			
		else {
			
			for (int i = currentfloor; i >travel ; i--) {
				
				current--;
				System.out.println();
				System.out.println(i-1 + " Pling");
				//System.out.println(current);
				
				
			}
		
		
			
	}
	

 }

	@Override
	public String toString() {
		
		return "Elevator [current=" + current + " "+ "Topfloor="+ topfloor+"]";
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
		
	}


}

	
