package ContactManagerCoursework;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileReader1 {
	public static void main(String[] args) {
		
		
		BufferedReader br = null;


		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("C:\\Users\\CompUser\\Documents\\ContactManager\\test.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		

	}
}

