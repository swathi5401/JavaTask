package oops;

public class T5Room {


	    private String roomNumber;
	    private String roomType; // e.g., "Deluxe", "Suite"
	    private double price;
	    private boolean isBooked;

	    public T5Room(String roomNumber, String roomType, double price) {
	        this.roomNumber = roomNumber;
	        this.roomType = roomType;
	        this.price = price;
	        this.isBooked = false; // All rooms are available by default
	    }

	    public String getRoomNumber() {
	        return roomNumber;
	    }

	    public String getRoomType() {
	        return roomType;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public boolean isBooked() {
	        return isBooked;
	    }

	    public void book() {
	        this.isBooked = true;
	    }

	    public void checkout() {
	        this.isBooked = false;
	    }
	}