package BasicsOfJAva;

public class VariableDemo {
	int id =10;//inst var
	void print()
	{
		String msg="hello"; //loc var
		System.out.println(msg);
	}
	static String message="Hello Students";//stat var
	
	
	public static void main(String[] args) {
		VariableDemo obj= new VariableDemo();
		System.out.println(obj.id);
		obj.print();
		System.out.println(message);
	}

}
