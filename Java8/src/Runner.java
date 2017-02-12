import java.util.function.Predicate;

public class Runner {
	
	

	public static void main(String[] args) {
		
		String s1= "abhinav";
	
	System.out.println(	testPradicate(s1,(String arpit)-> arpit.equals(s1)) );
	System.out.println(	testPradicate(s1,(arpit)-> arpit.length()>10) );

	}
public static boolean testPradicate(String argument, Predicate<String> pradicate){
		
	
	String s2= "test";
		return pradicate.test(s2);
		
	}

}
