package oops;

public class T6Employee {

	
	    private String name;
	    private double baseSalary;

	    public T6Employee() {
	       
	    }

	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public double getSalary() {
	        return baseSalary;
	    }
	    public void setSalary(double baseSalary) {
	        this.baseSalary = baseSalary;
	    }

	    public double calculateSalary() {
	        return baseSalary;
	    }
	}