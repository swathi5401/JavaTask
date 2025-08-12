package oops;

class T1Rider {
    String name;
    String mobileNumber;
    String defaultPickupLocation;

    T1Rider(String n, String m, String d) {
        name = n;
        mobileNumber = m;
        defaultPickupLocation = d;
    }

    T1Trip requestTrip(String dropLocation, double distance) {
        return new T1Trip(defaultPickupLocation, dropLocation, distance);
    }
}