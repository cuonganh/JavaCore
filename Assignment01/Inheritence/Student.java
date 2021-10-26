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

    public String enrolInSubject(){

        return this.enrolledSubjects;

    }

    public String withdrawFromSubject(){

        return this.enrolledSubjects;

    }


}
