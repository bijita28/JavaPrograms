package test1;

public class StringRevConcept {

	public static void main(String[] args) {
		
		//Reverse string without using reverse function
		String str="BIJITA";
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		//Reverse a string using reverse function
		
		String str1="APPLE";
		StringBuffer cb=new StringBuffer(str1);
		
		System.out.println(cb.reverse());
		
	}

}
