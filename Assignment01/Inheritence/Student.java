public class Student extends Person{

	private String studentNumber;
	private String course;
	private String enrolledSubjects;

	Student(){

	}

	Student(String studentNumber, String course, String enrolledSubjects){

		this.studentNumber = studentNumber;
		this.course = course;
		this.enrolledSubjects = enrolledSubjects;

	}

    
	//Getter
	public String getStudentNumber(){
		return this.studentNumber;
	}
	public String getCourse(){
		return this.course;
	}
	public String getEnrolledSubjects(){
		return this.enrolledSubjects;
	}
	
	//Method
	public String enrolInSubject(){

		return this.enrolledSubjects;

	}

	public String withdrawFromSubject(){

		return this.enrolledSubjects;

	}

	
}
