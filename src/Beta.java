
public class Beta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a variable to hold the quantity of available plane seats on a flight
		int seatsStillAvailableOnThePlane = 7;
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceriesAtCheckOut = 24.25;
		//create a variable to hold a person's middle initial
		char middleInitial = 'B';
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isItHotOutside = false; 
		//create a variable to hold a customer's first name
		String firstName = "Richard";
		//create a variable to hold a street address
		String streetAddress = "921 S. 8th Ave Pocatello ID 83201";
		System.out.println(seatsStillAvailableOnThePlane);
		System.out.println(costOfGroceriesAtCheckOut);
		System.out.println(middleInitial);
		System.out.println(isItHotOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);
	//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		seatsStillAvailableOnThePlane -= 2; 
		
		
	//Impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceriesAtCheckOut += 2.15;
		System.out.println(costOfGroceriesAtCheckOut);
	
		
	//birth certificate was printed incorrectly, change the middle initial to something else 
		middleInitial = 'C';
		System.out.println(middleInitial);
	
		
	//the season has changed, update the hot outside variable to be opposite of what it was
		isItHotOutside = !isItHotOutside;
		System.out.println(isItHotOutside);
	//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String fullName = firstName + " " + middleInitial + " " +"Atkins";
		System.out.println(fullName);
	//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("Please say hello to "+ fullName +" who lives at "+ streetAddress);
		
	}

}
