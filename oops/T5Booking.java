package oops;

public class T5Booking {


	    private T5Customer customer;
	    private T5Room room;
	    private String checkInDate;
	    private String checkOutDate;

	    public T5Booking(T5Customer customer, T5Room room, String checkInDate, String checkOutDate) {
	        this.customer = customer;
	        this.room = room;
	        this.checkInDate = checkInDate;
	        this.checkOutDate = checkOutDate;
	    }

	    public void displayBookingDetails() {
	        System.out.println("\n--- Booking Details ---");
	        System.out.println("Customer: " + customer.getName());
	        System.out.println("Contact: " + customer.getContact());
	        System.out.println("Room Number: " + room.getRoomNumber());
	        System.out.println("Room Type: " + room.getRoomType());
	        System.out.println("Price per night: $" + room.getPrice());
	        System.out.println("Check-in Date: " + checkInDate);
	        System.out.println("Check-out Date: " + checkOutDate);
	        System.out.println("-------------------------");
	    }
	}