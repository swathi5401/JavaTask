package oops;

public class T2EWalletApp {

	
	    public static void main(String[] args) {
	        T2User u1 = new T2User("Ram", "9990001111");
	        T2User u2 = new T2User("Sam", "8880002222");
	        u1.addMoney(500);
	        u1.makePayment(u2, 200);
	        System.out.println("E-Wallet Transactions ");
	        u1.printHistory();
	    }
	}

