package logicalexam;

public class RevString {

	public static void main(String[] args) {
		String s="Priyanka";
		String rev="  ";
		int lng=s.length();
		System.out.println(lng);
		for(int i=lng-1; i>=0; i--){
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
