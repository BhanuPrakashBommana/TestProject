//By method
public class Student2 {
	
	int id;
	
	String name;
	
	void details(int p,String person){
		
		id=p;
		name=person;
	}
	
	void disp(){
		
		System.out.println(id+" "+name);
	}
}

class Testdemo1{
	
	public static void main(String[] args) {
		
		Student2 s=new Student2();
		
		s.details(10,"bhanu");
		
		s.disp();
	}
}
