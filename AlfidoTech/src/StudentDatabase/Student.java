package StudentDatabase;

import java.util.ArrayList;
import java.util.List;

class Student {
	private String studentId;
	private String name;
	private List<String> courses;

	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		this.courses = new ArrayList<>();
	}

	public String getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void addCourse(String course) {
		courses.add(course);
	}
}