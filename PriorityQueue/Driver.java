import java.util.Random;
/*
 * Driver to simulate a line for 60 seconds. 
 * Prints out the total number of customers served and line size at end of simulation
 * @version 9/29/16
 * @author Loi phung
 */
public class Driver {

	public static void main(String[] args) {
		Random r1 = new Random();
		PriorityQueue q1 = new PriorityQueue();
		int probability = 0;
		int maxLineSize = 0, servedCust = 0;

		// simulating the 60 minutes
		for (int i = 0; i < 60; i++) {

			probability = r1.nextInt(4) + 1;
			// 25% chance that a customer will show up. If true, add customer to
			// queue and print indication
			if (probability == 1) {

				q1.add(new PriorityCustomer());//adds a new customer into the queue
				System.out.println("New customer!\nCustomers In Line: " + q1.getSize());
				servedCust++;

				if (maxLineSize < q1.getSize()) { // calcualtes max line size

					maxLineSize = q1.getSize();
				}
			}

			System.out.println("---------------------------------");
			q1.serve();// serves the customer for 1 minute

		} // end of for loop

		System.out.println("\n\nTotal customers served: " + servedCust + "\nMax Line Size: " + maxLineSize);
	}

}