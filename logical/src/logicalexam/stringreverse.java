package logicalexam;

public class stringreverse {

	public static void main(String[] args) {
		String name="azmeera";
		 String rev=" ";
		int leng = name.length();
		for(int i=leng-1;i>=0;i--){
			rev=rev+name.charAt(i);
			
		}
		
		System.out.println(rev);
	}

}
