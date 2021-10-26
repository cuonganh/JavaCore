1.

- Java là ngôn ngữ "dịch một nơi và chạy ở nhiều nơi":


- Java là ngôn ngữ độc lập nền tảng (hệ điều hành):


2. Chương trình HelloWorld bằng giao diện dòng lệnh::

- Cài đặt jdk, jre và biến môi trường PATH vào hệ điều hành

- Có thể chạy qua commandline hoặc sử dụng Code Editer để viết code như VSCode hoặc IDE như Netbean, Eclipse, IntelliJ, ...

- Tiến hành viết chương trình: HelloWorld.java

#Class HelloWorld.java

public class HelloWorld{

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


3. Lập trình hai class Person và Student (Student kế thừa từ Person) theo biểu đồ.

# Class Person.java

public class Person{

	private String name;
	private String address;
	private String phoneNumber;
	private Date dateOfBirth;	

}



4. Chạy Animals project và giải thích: 

Hello! I am an Animal, I don't know what I want to eat.
Hello! I am a Koala, and I am very sleepy.  Zzzzz...
Hello! I'm a Kangaroo, and I like to bounce around a lot.
Hello! I'm an Emu.  Do you like big birds like me?

- Tính kế thừa (Inheritance) 



- Tính đa hình (Polymorphisme)

