import java.util.ArrayList;
import java.util.Arrays;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int[] arr1={10,20,30,40,50,60,70,80,90,100};
		System.out.println(arr[3]);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		String[] family= {"papa","maa","asha","deepa","ravi","megha"};
		for(int i=0;i<family.length;i++) {
			System.out.println(family[i]);
		}
		
		//For each loop
		for(String s:family) {
			System.out.println(s);
		}
			
		
		System.out.println("Difference b/w arrays and arraylist(expandable arrays)");
		
		//Difference b/w arrays and arraylist(expandable arrays)
		ArrayList<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Banana");
		a.add("Guava");
		a.add("Grapes");
		a.add("Papaya");
		System.out.println(a.get(4));
		
		System.out.println("Using for loop");
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
	
		System.out.println("Using for each loop");
		for(String s:a)
			System.out.println(s);
		
		System.out.println(a.contains("Guava"));
		System.out.println(a.contains("Mango"));
		
		System.out.println("Converting arrays to arraylist");
		System.out.println(Arrays.asList(family));
		System.out.println(Arrays.asList(family).contains("deepa"));
}

}
