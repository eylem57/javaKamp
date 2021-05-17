
public class Main {

	public static void main(String[] args) {
		User user = new User ();
		UserManager userManager = new UserManager();
		userManager.add();
		userManager.delete();
		
		Student student = new Student();
		StudentManager studentManager = new StudentManager();
		studentManager.attend(student);
		
		Instructor instructor = new Instructor();
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.task(instructor);
		

	}

	
}
