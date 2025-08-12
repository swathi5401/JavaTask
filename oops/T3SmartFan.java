package oops;

//Subclass for a smart fan
class T3SmartFan extends T3SmartDevice {
 private int speed;

 public T3SmartFan(String dId, String dName) {
     super(dId, dName);
     speed = 0;
 }

 public int getSpeed() {
     return speed;
 }

 public void setSpeed(int level) {
     if (getStatus()) {
         if (level >= 0 && level <= 5) {
             speed = level;
             System.out.println(getDeviceName() + " speed set to " + speed + ".");
         } else {
             System.out.println("Invalid speed level. Please choose a value between 0 and 5.");
         }
     } else {
         System.out.println(getDeviceName() + " is OFF. Please turn it ON to adjust speed.");
     }
 }

 public void displayStatus() {
     // Redundant code due to the 'super' constraint
     System.out.println("--- " + getDeviceName() + " Status ---");
     System.out.println("Device ID: " + getDeviceId());
     System.out.println("Status: " + (getStatus() ? "ON" : "OFF"));
     System.out.println("Speed: " + speed);
     System.out.println("---------------------------");
 }
}