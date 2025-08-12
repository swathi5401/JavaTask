package oops;

public class T3SmartHomeApp {
	// Main class to simulate the control of devices
	    public static void main(String[] args) {
	        SmartLight livingRoomLight = new SmartLight("L-001", "Living Room Light");
	        T3SmartFan bedroomFan = new T3SmartFan("F-001", "Bedroom Fan");
	        T3SmartAC mainAC = new T3SmartAC("A-001", "Main AC Unit");

	        System.out.println("--- Initial Status of Devices ---");
	        livingRoomLight.displayStatus();
	        bedroomFan.displayStatus();
	        mainAC.displayStatus();

	        System.out.println("\n--- Controlling Living Room Light ---");
	        livingRoomLight.turnOn();
	        livingRoomLight.setBrightness(75);
	        livingRoomLight.displayStatus();

	        System.out.println("\n--- Controlling Bedroom Fan ---");
	        bedroomFan.turnOn();
	        bedroomFan.setSpeed(3);
	        bedroomFan.displayStatus();
	        bedroomFan.turnOff();
	        bedroomFan.displayStatus();

	        System.out.println("\n--- Controlling Main AC Unit ---");
	        mainAC.turnOn();
	        mainAC.setTemperature(22.5);
	        mainAC.displayStatus();
	        mainAC.turnOff();
	        mainAC.displayStatus();
	    }
	}