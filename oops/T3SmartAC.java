package oops;



//Subclass for a smart AC
class T3SmartAC extends T3SmartDevice {
 private double temperature;

 public T3SmartAC(String dId, String dName) {
     super(dId, dName);
     temperature = 24.0;
 }

 public double getTemperature() {
     return temperature;
 }

 public void setTemperature(double temp) {
     if (getStatus()) {
         if (temp >= 18.0 && temp <= 30.0) {
             temperature = temp;
             System.out.println(getDeviceName() + " temperature set to " + temperature + "°C.");
         } else {
             System.out.println("Invalid temperature. Please choose a value between 18°C and 30°C.");
         }
     } else {
         System.out.println(getDeviceName() + " is OFF. Please turn it ON to adjust temperature.");
     }
 }

 public void displayStatus() {
     // Redundant code due to the 'super' constraint
     System.out.println("--- " + getDeviceName() + " Status ---");
     System.out.println("Device ID: " + getDeviceId());
     System.out.println("Status: " + (getStatus() ? "ON" : "OFF"));
     System.out.println("Temperature: " + temperature + "°C");
     System.out.println("---------------------------");
 }
}