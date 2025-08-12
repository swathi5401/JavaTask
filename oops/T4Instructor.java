package oops;
import java.util.*;


public class T4Instructor extends T4User {
	
	
	    private List<T4Course> coursesCreated;

	    public T4Instructor(int id, String name, String email) {
	        super(id, name, email);
	        this.coursesCreated = new ArrayList<>();
	    }

	    public T4Course createCourse(int courseId, String title, String description) {
	        T4Course newCourse = new T4Course(courseId, title, description, this);
	        coursesCreated.add(newCourse);
	        System.out.println("Instructor " + this.getName() + " has created a new course: '" + newCourse.getTitle() + "'.");
	        return newCourse;
	    }

	    public List<T4Course> getCoursesCreated() {
	        return coursesCreated;
	    }
	}