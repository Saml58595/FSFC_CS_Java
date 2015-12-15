package ContactManagerCoursework;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
public class Sets {
	public static void main(String[] args) {
		
		
		Set<String> set1= new HashSet<String>();
		
		set1.add("4");
		set1.add("6");
		set1.add("2");
		set1.add("1");
		set1.add("9");
		
		System.out.println(set1);
		
		Set<String> set2= new LinkedHashSet<String>();
		
		set2.add("Dan");
		set2.add("Emily");
		set2.add("Carol");
		set2.add("Ann");
		set2.add("Beatrice");
		set2.add("Dan");
		System.out.println(set2);
	}
}
