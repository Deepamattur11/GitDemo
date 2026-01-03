import java.util.ArrayList;

public class ConditionalLoop {
	public static void main(String[] args) {
		System.out.println("Conditional Loop");
		
		int[] arr= {11,22,33,44,55,66,77,88,99,100};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) 
				System.out.println(arr[i]+" is even");
			else
				System.out.println(arr[i]+" is odd");
				
		}
		
		String s="Welcome to Our Home";
		String[] splittedstring=s.split(" ");
		for(String s1:splittedstring)
			System.out.println(s1);
		
		String[] splittedstring1=s.split("Our");
		for(String s1:splittedstring1)
			System.out.println(s1);
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		
		//Printing String in Reverse Order
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}
}
