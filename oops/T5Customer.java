package oops;

public class T5Customer {
	
	
	    private String name;
	    private String contact;
	    private T5Room bookedRoom;

	    public T5Customer(String name, String contact) {
	        this.name = name;
	        this.contact = contact;
	        this.bookedRoom = null;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getContact() {
	        return contact;
	    }

	    public T5Room getBookedRoom() {
	        return bookedRoom;
	    }

	    public void setBookedRoom(T5Room room) {
	        this.bookedRoom = room;
	    }
	}