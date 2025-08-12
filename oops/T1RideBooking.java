package oops;

public class T1RideBooking  {

	
	    public static void main(String[] args) {
	        T1Rider r1 = new T1Rider("Swathi", "9876543210", "Bus Stand");
	        T1Trip t1 = r1.requestTrip("Mall", 6.5);
	        System.out.println("Ride Booking");
	        System.out.println("Pickup: " + t1.pickupLocation + ", Drop: " + t1.dropLocation + ", Fare: Rs." + t1.fare);
	        t1.start();
	        t1.end();
	        System.out.println("Trip Status: " + t1.status);
	    }
	}

