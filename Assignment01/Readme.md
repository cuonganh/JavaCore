## 1. Tổng quan về java:

- Java là ngôn ngữ "dịch một nơi và chạy ở nhiều nơi":
	+ Java code được biên dịch bởi trình biên dịch (javac compiler) thành Bytecode và độc lập với các nền tảng OS.
	+ Bytecode có thể chạy trên tất cả các JVM mà không cần biên dịch lại. 

- Java là ngôn ngữ độc lập nền tảng (hệ điều hành):
	+ Java sử dụng máy ảo JVM (Java Virtual Machine) và chương trình java sẽ chạy trên JVM cứ không chạy trược tiếp trên OS (hệ điều hành).
	+ Để chạy được chương trình, chúng ta cần cài đặt JVM tương ứng với mỗi hệ điều hành được Oracle hỗ trợ và chạy chương trình java trên JVM mà không cần quan tâm đến OS.

## 2. Chương trình HelloWorld bằng giao diện dòng lệnh:

- Cài đặt jdk, jre và biến môi trường PATH vào hệ điều hành

- Có thể chạy qua commandline hoặc sử dụng Code Editer để viết code như VSCode hoặc IDE như Netbean, Eclipse, IntelliJ, ...

- Tiến hành viết chương trình: HelloWorld.java

HelloWorld.java

	public class HelloWorld {

		public static void main(String[] args) {

			System.out.println("HelloWorld in Java!");
	
		}
	}


- Truy cập commandline (cmd, power shell, terminal, ...) tới đường dẫn thư mục chứa HelloWorld.java.
	- Mở thư mục, nhập cmd vào đường dẫn sẽ mở commandline ở thư mục đấy.
	- Sử dụng cd <Diraction Folder> để mở commandline, ví dụ: cd D:/Tmp/HelloWorld.java.
	Trong đó <Diraction Folder> chính là đường dẫn tới thư mục chứa file 

- Tiến hành compiler chương trình tại đường dẫn thư mục chứa file chứa HelloWorld.java.

	javac HelloWorld.java

- Tiến hành chạy chương trình tại đường dẫn thư mục chứa file chứa HelloWorld.java và HelloWorld.class (mới compiler xong).

	java HelloWorld

- Chương trình đã chạy với kết quả hiển thị trên màn hình console:

HelloWorld in Java!


## 3. Lập trình hai class Person và Student (Student kế thừa từ Person) theo biểu đồ.

Class Person.java

	import java.util.Date;

	public class Person {

	    private String name;
	    private String address;
	    private String phoneNumber;
	    private Date dateOfBirth;

	    Person() {
		System.out.println("A person is create.");
	    }

	    Person(String name, String address, String phoneNumber, Date dateOfBirth) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;

		System.out.println("A person is create with name, address, phoneNumber, dateOfBirth");
	    }

	    //Getter
	    public String getName() {
		return name;
	    }

	    public String getAddress() {
		return address;
	    }

	    public String getPhoneNumber() {
		return phoneNumber;
	    }

	    public Date getDateOfBirth() {
		return dateOfBirth;
	    }

	    //Setter
	    public void setName(String name) {
		this.name = name;
	    }

	    public void setAddress(String address) {
		this.address = address;
	    }

	    public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	    }

	    //Method of Person class
	    public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	    }

	    public String changeAddress(String newAddress) {

		return this.address = newAddress;

	    }

	    public int calculateAge() {

		return 2021 - dateOfBirth.getYear();

	    }

	}

Class Student.java
	
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

## 4. Chạy Animals project và giải thích: 

	Hello! I am an Animal, I don't know what I want to eat.
	Hello! I am a Koala, and I am very sleepy.  Zzzzz...
	Hello! I'm a Kangaroo, and I like to bounce around a lot.
	Hello! I'm an Emu. Do you like big birds like me?

- Tính kế thừa (Inheritance):
	+ Các đối tượng Koala, Kangaroo, Emu được kế thừa phương thức talk() từ class Animal mà không cần cài đặt.
	+ Các đối tượng đều tự động được sử dụng phương thức talk() để in ra "Hello!".
	+ Nếu ở các class kế thừa không cài đặt lại, thì phương thức ở class "cha" sẽ được sử dụng.

- Tính đa hình (Polymorphisme):
	+ Các đối tượng Koala, Kangaroo, Emu cùng sử dụng phương thức thoughts() nhưng được cài đặt lại với nội dung khác.
	+ Animal: thoughts() => I don't know what I want to eat.
	+ Koala: thoughts() => I am a Koala, and I am very sleepy.  Zzzzz...
	+ Kangaroo: thoughts() => I'm a Kangaroo, and I like to bounce around a lot.
	+ Emu: thoughts() => I'm an Emu. Do you like big birds like me?
