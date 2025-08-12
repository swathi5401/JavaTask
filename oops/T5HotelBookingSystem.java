package oops;
import java.util.ArrayList;
import java.util.List;

public class T5HotelBookingSystem {

	    private List<T5Room> rooms;

	    public T5HotelBookingSystem() {
	        this.rooms = new ArrayList<>();
	        // Initialize with some sample rooms
	        rooms.add(new T5Room("101", "Deluxe", 150.00));
	        rooms.add(new T5Room("102", "Deluxe", 150.00));
	        rooms.add(new T5Room("201", "Suite", 300.00));
	    }
	    
	    // Method to find an available room of a specific type
	    public T5Room findAvailableRoom(String roomType) {
	        for (T5Room room : rooms) {
	            if (room.getRoomType().equalsIgnoreCase(roomType) && !room.isBooked()) {
	                return room;
	            }
	        }
	        return null;
	    }
	    
	    // Method to book a room for a customer
	    public T5Booking bookRoom(T5Customer customer, String roomType, String checkIn, String checkOut) {
	        T5Room availableRoom = findAvailableRoom(roomType);
	        if (availableRoom != null) {
	            availableRoom.book();
	            customer.setBookedRoom(availableRoom);
	            System.out.println("Booking successful! Room " + availableRoom.getRoomNumber() + " is booked for " + customer.getName());
	            return new T5Booking(customer, availableRoom, checkIn, checkOut);
	        } else {
	            System.out.println("Sorry, no " + roomType + " rooms are currently available.");
	            return null;
	        }
	    }
	    
	    // Method to check out a customer and free up the room
	    public void checkoutRoom(T5Customer customer) {
	        T5Room room = customer.getBookedRoom();
	        if (room != null) {
	            room.checkout();
	            customer.setBookedRoom(null);
	            System.out.println(customer.getName() + " has checked out from room " + room.getRoomNumber() + ". The room is now available.");
	        } else {
	            System.out.println("No room is currently booked for " + customer.getName());
	        }
	    }

	    // Main method to run the simulation
	    public static void main(String[] args) {
	        T5HotelBookingSystem hotel = new T5HotelBookingSystem();
	        
	        T5Customer customer1 = new T5Customer("Alice Johnson", "555-1234");
	        T5Customer customer2 = new T5Customer("Bob Williams", "555-5678");
	        
	        System.out.println("Simulating Booking Flow");
	        
	        // Alice books a Deluxe room
	        T5Booking aliceBooking = hotel.bookRoom(customer1, "Deluxe", "2024-05-20", "2024-05-22");
	        if (aliceBooking != null) {
	            aliceBooking.displayBookingDetails();
	        }
	        
	        // Bob tries to book a Deluxe room
	        System.out.println("Bob's Booking Attempt");
	        hotel.bookRoom(customer2, "Deluxe", "2024-05-20", "2024-05-22");
	        
	        // Bob tries to book a Suite room
	        System.out.println("Bob's Second Booking Attempt");
	        T5Booking bobBooking = hotel.bookRoom(customer2, "Suite", "2024-05-21", "2024-05-23");
	        if (bobBooking != null) {
	            bobBooking.displayBookingDetails();
	        }
	        
	        // Alice checks out
	        System.out.println("Alice Checks Out");
	        hotel.checkoutRoom(customer1);
	        
	        // Bob tries to book a Deluxe room again (now that one is available)
	        System.out.println("Bob's Final Booking Attempt");
	        hotel.bookRoom(customer2, "Deluxe", "2024-05-25", "2024-05-27");
	    }
	}