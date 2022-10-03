package servlets.mvctwo;
import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents() {
		// create an empty list
		List<Student> students = new ArrayList<>();
		// add sample data
		students.add(new Student("Ahmed", "Algebali", "ahmedelgebalywork@gmail.com"));
		students.add(new Student("Mohamed", "Algebali", "mohamedelgebalywork@gmail.com"));
		students.add(new Student("Hamdy", "Algebali", "hamdyelgebalywork@gmail.com"));
		// return the list
		return students;
	}
}







