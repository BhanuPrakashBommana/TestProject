package world;

import java.util.Scanner;

import org.testng.reporters.jq.Main;

public class Simple {
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		
		Scanner s=new Scanner(System.in);
		
		String x=s.nextLine();
		
		int n=Integer.parseInt(x);
		
		for(int i=1;i<=n;i++){
			
			if(i%3==0){
				
				System.out.print("Fizz"+" ");
			}
			
			else if(i%5==0){
				
				System.out.print("Buzz"+" ");
				
			}
			
			else {
				
				System.out.print(i+" ");
			}
		
		}
		
		
	}
	

}
