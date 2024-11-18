package oops;

class Book{
	String title;
	int page;
	Book()//const with no parameter
	{
		title="Unknown";
		page=0;
	}
	Book(String title){//const with 1 par
		this .title=title;
		page=0;
	}
	Book(String title ,int page){
		this.title=title;
		this.page=page;
	}
	void display() {
		System.out.println("Title : "+title+" Page : "+page);
	}
}


public class ConstrOverloading {

	public static void main(String[] args) {
		Book book1=new Book();
		Book book2=new Book("java prog");
		Book book3=new Book("pyth prog",50);
		
		book1.display();
		book2.display();
		book3.display();
	}

}
