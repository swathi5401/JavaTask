package oops;

public class T2User {
	
	    String name;
	    double walletBalance;
	    String phoneNumber;
	    T2Transaction[] transactions = new T2Transaction[100];
	    int index = 0;

	    T2User(String n, String p) {
	        name = n;
	        phoneNumber = p;
	        walletBalance = 0.0;
	    }

	    void addMoney(double amt) {
	        walletBalance = walletBalance + amt;
	        transactions[index] = new T2Transaction("T" + index, amt, "Credit");
	        index = index + 1;
	    }

	    void makePayment(T2User receiver, double amt) {
	        if (walletBalance >= amt) {
	            walletBalance = walletBalance - amt;
	            receiver.walletBalance = receiver.walletBalance + amt;
	            transactions[index] = new T2Transaction("T" + index, amt, "Debit");
	            index = index + 1;
	        }
	    }

	    void printHistory() {
	        for (int i = 0; i < index; i++) {
	            System.out.println(transactions[i].transactionId + " - " + transactions[i].type + " - Rs." + transactions[i].amount);
	        }
	    }
	}

