import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bapp {
	public static void main(String[] args) {
		Student student = new Student();
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.println("Enter Student Id");
			student.setStudentId(Integer.parseInt(bReader.readLine()));
			
			System.out.println("Enter Student Name");		
			student.setStudentName((bReader.readLine()));
			
			System.out.println("Enter Student Description");		
			student.setStudentDescription((bReader.readLine()));
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}


