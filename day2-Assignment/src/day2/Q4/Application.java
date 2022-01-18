package day2.Q4;

public class Application {
public static void main(String[] args) {
	Student s1=new Student("111");
	s1.display();
	Student s2=new Student("Akshat","112",10);
	s2.display();
	Student s3=new Student("Akshat","113");
	s3.display();
	s3.display(2000);
}
}
