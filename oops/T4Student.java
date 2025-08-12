package oops;
import java.util.ArrayList;
import java.util.List;

public class T4Student extends T4User {
	
	    private List<T4Course> enrolledCourses;

	    public T4Student(int id, String name, String email) {
	        super(id, name, email);
	        this.enrolledCourses = new ArrayList<>();
	    }

	    public void enrollCourse(T4Course course) {
	        if (!enrolledCourses.contains(course)) {
	            enrolledCourses.add(course);
	            System.out.println(this.getName() + " has successfully enrolled in '" + course.getTitle() + "'.");
	        } else {
	            System.out.println(this.getName() + " is already enrolled in '" + course.getTitle() + "'.");
	        }
	    }

	    public List<T4Course> getEnrolledCourses() {
	        return enrolledCourses;
	    }
	}
