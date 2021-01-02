// By reference variable
public class Student3 {

	int id;
	
	String name;
	
	/*void display(){
		
		System.out.println(s.id+" "+name);
	}*/
}

class Testdemo2{
	
	public static void main(String[] args) {
		
		Student3 s=new Student3();
		
		s.id=15;
		s.name="bhanu";
		
		System.out.println(s.id+" "+s.name);
		
	}
}
