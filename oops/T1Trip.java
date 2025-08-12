package oops;

class T1Trip {
    String pickupLocation;
    String dropLocation;
    double fare;
    String status;

    T1Trip(String p, String d, double dist) {
        pickupLocation = p;
        dropLocation = d;
        fare = dist * 10.0;
        status = "Requested";
    }

    void start() {
        status = "Started";
    }

    void end() {
        status = "Ended";
    }
}