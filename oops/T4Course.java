package oops;

public class T4Course {

	
	    private int courseId;
	    private String title;
	    private String description;
	    private T4Instructor instructor;

	    public T4Course(int courseId, String title, String description, T4Instructor instructor) {
	        this.courseId = courseId;
	        this.title = title;
	        this.description = description;
	        this.instructor = instructor;
	    }

	    // Getters
	    public int getCourseId() {
	        return courseId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public T4Instructor getInstructor() {
	        return instructor;
	    }

	    public void getDetails() {
	        System.out.println("Course ID: " + courseId);
	        System.out.println("Title: " + title);
	        System.out.println("Description: " + description);
	        System.out.println("Instructor: " + instructor.getName());
	    }
	}
