package oops;

public class T6EmployeeMain {

	    public static void main(String[] args) {
	        T6Manager m = new T6Manager();
	        m.setName("Alice");
	        m.setSalary(50000);

	        T6Programmer p = new T6Programmer();
	        p.setName("Bob");
	        p.setSalary(40000);

	        System.out.println(m.getName() + "Salary: " + m.calculateSalary());
	        System.out.println(p.getName() + "Salary: " + p.calculateSalary());
	    }
	}

