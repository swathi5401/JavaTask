package oops;

public class T4LearningPlatform {

	    public static void main(String[] args) {
	        // Create users
	        T4Student student1 = new T4Student(1, "Alice", "alice@example.com");
	        T4Instructor instructor1 = new T4Instructor(101, "Dr. Smith", "smith@example.com");

	        // Instructor creates a course
	        T4Course pythonCourse = instructor1.createCourse(1001, "Python for Beginners", "An introductory course to the Python programming language.");

	        // A student enrolls in the course
	        student1.enrollCourse(pythonCourse);

	        // List the student's enrolled courses
	        System.out.println("\n--- Alice's Enrolled Courses ---");
	        for (T4Course course : student1.getEnrolledCourses()) {
	            course.getDetails();
	        }

	        // Demonstrate listing instructor's created courses
	        System.out.println("\n--- Dr. Smith's Created Courses ---");
	        for (T4Course course : instructor1.getCoursesCreated()) {
	            course.getDetails();
	        }
	    }
	}
