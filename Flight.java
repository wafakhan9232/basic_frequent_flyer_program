package flights;

import java.util.Objects;

/**
 * represents a flight that can be purchased or taken.
 */

public class Flight {
	// origin of the flight
	private String origin;
	// destination of the flight
	private String destination;
	// price of the flight
	private int priceInMiles;
	// miles earned with this flight
	private int milesEarned;

	/**
	 * Constructor to initialise the fields
	 * 
	 * @param origin
	 * @param destination
	 * @param priceInMiles
	 * @param milesEarned
	 */
	public Flight(String origin, String destination, int priceInMiles, int milesEarned) {
		this.origin = origin;
		this.destination = destination;
		this.priceInMiles = priceInMiles;
		this.milesEarned = milesEarned;
	}

	// Getters for all the fields
	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public int getPriceInMiles() {
		return priceInMiles;
	}

	public int getMilesEarned() {
		return milesEarned;
	}

	/**
	 * Overridden version of equals and hashcode for all the fields
	 */
	@Override
	public int hashCode() {
		return Objects.hash(destination, milesEarned, origin, priceInMiles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(destination, other.destination) && milesEarned == other.milesEarned
				&& Objects.equals(origin, other.origin) && priceInMiles == other.priceInMiles;
	}

	// Overridden toString method to return a nice representation of all the fields
	@Override
	public String toString() {
		return "Flight [origin=" + origin + ", destination=" + destination + ", priceInMiles=" + priceInMiles
				+ ", milesEarned=" + milesEarned + "]";
	}

}
