// Main outside the class
public class Student1 {
	
	int id=10;
	
	String name="bhanu";
	
	void disp(){
		
		System.out.println(id+" "+name);
	}
}

class Testdemo{
	
	public static void main(String[] args) {
		
		Student1 s=new Student1();
		
		s.disp();
	}
}
