package ContactManagerCoursework;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriter1 {

	public static void main(String[] args) throws Exception {
		
		 Scanner sc = new Scanner (System.in);
		 
		 String name = "Lord Slahington";
		 int age= 69;
		 double id= 420.69;
		 FileWriter fw;
		
		 try {
			 fw = new FileWriter(new File ("C:\\Users\\CompUser\\"
			 		+ "Documents\\ContactManager\\FWtest.txt"));
			 
			 fw.write(String.format(sc.next(), ":name"));
			 
			 fw.write(System.lineSeparator()); 
			 
			 fw.write(String.format(sc.next(),":age"));
			 
			 fw.write(System.lineSeparator()); 
			 
			 fw.write(String.format(sc.next(),":id"));
			 
			 fw.write(System.lineSeparator());
			 	 
			 
			 fw.close();
		 } catch (IOException ex) {
			 ex.printStackTrace();
			 
		 }
	
	
		System.out.println("done");
	
	
}}