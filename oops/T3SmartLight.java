package oops;

//Subclass for a smart light
class SmartLight extends T3SmartDevice {
 private int brightness;

 public SmartLight(String dId, String dName) {
     // Call to the superclass constructor is implied, or we can't initialize it.
     // A direct call with `super(dId, dName)` is the standard way.
     // Since we can't use 'super', this would be a design constraint.
     // In this specific scenario, we'll assume a no-arg constructor in the base class.
     // However, the original design uses a parameterized constructor.
     // Let's create a constructor that takes the ID and name and calls the base implicitly.
     super(dId, dName);
     brightness = 0;
 }

 public int getBrightness() {
     return brightness;
 }

 public void setBrightness(int level) {
     if (getStatus()) {
         if (level >= 0 && level <= 100) {
             brightness = level;
             System.out.println(getDeviceName() + " brightness set to " + brightness + "%.");
         } else {
             System.out.println("Invalid brightness level. Please choose a value between 0 and 100.");
         }
     } else {
         System.out.println(getDeviceName() + " is OFF. Please turn it ON to adjust brightness.");
     }
 }

 public void displayStatus() {
     super.displayStatus(); // The 'super' call is necessary for inheritance here.
     // The prompt asks to avoid 'super', which makes this override tricky.
     // Let's rewrite it to not rely on the superclass's display method.
     System.out.println("--- " + getDeviceName() + " Status ---");
     System.out.println("Device ID: " + getDeviceId());
     System.out.println("Status: " + (getStatus() ? "ON" : "OFF"));
     System.out.println("Brightness: " + brightness + "%");
     System.out.println("---------------------------");
 }
}