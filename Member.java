package flights;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents a member of the frequent-flier programme
 * 
 * @author Wafa Khan Tareen 
 */

public class Member {
	// name of the member
	private String name;
	// the total miles earned by the member
	private int milesBalance;
	// current frequent flier rank of the member
	private Rank rank;
	// flights booked by the member
	private List<Flight> bookedFlights;

	/**
	 * Constructor to initialise all the fields
	 * 
	 * @param name
	 * @param milesBalance
	 * @param rank
	 * @param bookedFlights
	 */
	public Member(String name, int milesBalance, Rank rank, List<Flight> bookedFlights) {
		this.name = name;
		this.milesBalance = milesBalance;
		this.rank = rank;
		this.bookedFlights = new ArrayList<>(bookedFlights);
	}

	/**
	 * A method that allows the member to purchase a flight
	 * 
	 * @param flight
	 * @throws IllegalArgumentException
	 */
	public void purchaseFlight(Flight flight) throws IllegalArgumentException {
		/**
		 * if member has enough miles to book this flight then deduct the miles from the
		 * member's balance and add the flight to the list of the member's booked
		 * flights
		 */
		if (flight.getPriceInMiles() <= this.milesBalance) {
			this.milesBalance = this.milesBalance - flight.getMilesEarned();
			bookedFlights.add(flight);
			// else throw an exception
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * If there is at least one booked flight in the list, it is removed from the
	 * list and the miles for that flight are added to the member's miles balance
	 */
	public void takeNextFlight() {
		if (!bookedFlights.isEmpty()) {
			this.milesBalance += (bookedFlights.get(0)).getMilesEarned();
			bookedFlights.remove(0);
		}
	}

	/**
	 * If the user can rank up – that is, their level is not Gold and they have
	 * enough miles to move up to the next level – then their rank is updated to the
	 * next level and the necessary miles are deducted from their total
	 */

	public void rankUp() {
		if (this.rank != Rank.GOLD) {
			if (this.rank == Rank.BASIC) {
				if (this.milesBalance >= 100) {
					this.milesBalance -= 100;
					this.rank = Rank.BRONZE;
				}
			} else if (this.rank == Rank.BRONZE) {
				if (this.milesBalance >= 500) {
					this.milesBalance -= 500;
					this.rank = Rank.SILVER;
				}
			} else if (this.rank == Rank.SILVER) {
				if (this.milesBalance >= 1000) {
					this.milesBalance -= 1000;
					this.rank = Rank.GOLD;
				}
			}
		}
	}
}
