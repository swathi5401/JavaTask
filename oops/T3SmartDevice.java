package oops;

//Base class for all smart devices
class T3SmartDevice {
 private String deviceId;
 private String deviceName;
 private boolean status;

 public T3SmartDevice(String dId, String dName) {
     deviceId = dId;
     deviceName = dName;
     status = false;
 }

 public String getDeviceId() {
     return deviceId;
 }

 public String getDeviceName() {
     return deviceName;
 }

 public boolean getStatus() {
     return status;
 }

 public void turnOn() {
     if (!status) {
         status = true;
         System.out.println(deviceName + " is now ON.");
     } else {
         System.out.println(deviceName + " is already ON.");
     }
 }

 public void turnOff() {
     if (status) {
         status = false;
         System.out.println(deviceName + " is now OFF.");
     } else {
         System.out.println(deviceName + " is already OFF.");
     }
 }

 public void displayStatus() {
     System.out.println("--- " + deviceName + " Status ---");
     System.out.println("Device ID: " + deviceId);
     System.out.println("Status: " + (status ? "ON" : "OFF"));
 }
}