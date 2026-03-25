package day1;

public class Basic {
	
	//Data properties
	int a = 10, b = 20,result;
	
	
	//Behaviour
	public void add(){
		result = a+b;
		System.out.println("Sum of add : " + result);
		
	}
	public void sub(){
		result = a-b;
		System.out.println("Sum of sub : " + result);
		
	}

	public static void main(String[] args) throws Exception {
		Basic b = new Basic(); //object
		b.add();
		b.sub();
		
		System.out.println(b.a);

	}

}
