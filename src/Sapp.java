import java.util.Scanner;

public class Sapp {
	public static void main(String[] args) {		
		Student m = new Student();
		Scanner scan = new  Scanner(System.in);
		
		System.out.println("Enter Student Name");
		m.setStudentName(scan.nextLine());
		
		System.out.println("Enter Student description");
		m.setStudentDescription(scan.nextLine());
		
		System.out.println("Enter Student id"); 
		m.setStudentId(scan.nextInt());
		
		
		
		System.out.println("Student Id: "+m.getStudentId());
		System.out.println("Student Name: "+m.getStudentName());
		System.out.println("Student description: "+m.getStudentDescription());

	}

}
