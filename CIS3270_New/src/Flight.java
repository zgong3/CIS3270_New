	import javafx.application.Application;
	import java.util.Calendar;

	// A comment for test
	public class Flight {

		
		private int flightId;
		private Calendar departureDate;
		private Calendar arrivalDate;
		private String departureCity;
		private String arrivalCity;
		private String flightNum;
		private String price;
		private int maxPassengers;
		private int currentPassengers = 0;
		private boolean isFull = false;

		public Flight(Calendar departureDate, Calendar arrivalDate,
				String departureCity, String arrivalCity, String flightNum,
				String price, int max_passengers) {
			this.departureDate = departureDate;
			this.arrivalDate = arrivalDate;
			this.departureCity = departureCity;
			this.arrivalCity = arrivalCity;
			this.flightNum = flightNum;
			this.price = price;
			this.maxPassengers = maxPassengers;
		}

		public int getFlightId() {
			return flightId;
		}

		public void setFlightId(int flightId) {
			this.flightId = flightId;
		}

		public Calendar getDepartureDate() {
			return departureDate;
		}

		public void setDepartureDate(Calendar departureDate) {
			this.departureDate = departureDate;
		}

		public Calendar getArrivalDate() {
			return arrivalDate;
		}

		public void setArrivalDate(Calendar arrivalDate) {
			this.arrivalDate = arrivalDate;
		}

		public String getDepartureCity() {
			return departureCity;
		}

		public void setDepartureCity(String departureCity) {
			this.departureCity = departureCity;
		}

		public String getArrivalCity() {
			return arrivalCity;
		}

		public void setArrivalCity(String arrivalCity) {
			this.arrivalCity = arrivalCity;
		}

		public String getFlightNum() {
			return flightNum;
		}

		public void setFlightNum(String flightNum) {
			this.flightNum = flightNum;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public int getMaxPassengers() {
			return maxPassengers;
		}

		public void setMaxPassengers(int maxPassengers) {
			this.maxPassengers = maxPassengers;
		}

		public int getCurrentPassengers() {
			return currentPassengers;
		}

		public void setCurrentPassengers(int currentPassengers) {
			this.currentPassengers = currentPassengers;
		}

		public boolean isFull() {
			return isFull;
		}

		public void setFull(boolean isFull) {
			this.isFull = isFull;
		}

		public static void main(String[] args) {

		}

	}



