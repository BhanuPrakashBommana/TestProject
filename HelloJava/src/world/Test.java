package world;

import org.testng.reporters.jq.Main;

public class Test extends java.lang.Object{
	
	public static void main(String[] args) {
		
		String str="bhanupraksh";
		
		char ch[]=str.toCharArray();
		
		System.out.println("duplicate characters in the above string are:");
		int c=0;
		for(int i=0;i<str.length();i++){
			
			for(int j=i+1;j<str.length();j++){
				
				if(ch[i]==ch[j]){
					
					System.out.print(ch[j] + " ");
					
					c=c+1;
					
					break;
				}
				
				
			}
			
		}
		
		System.out.println();
		
		System.out.println(c);
	}
}	