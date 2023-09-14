package JFSJD;

public class SingleInheritanceExample {
  public String color;
  SingleInheritanceExample()
  {
	  color = "red";
	  System.out.println(color);
  }
  
	 void display()
	 {
		 System.out.println("In display method");
	 }
	public static void main(String[] args) {
		Thar obj = new Thar();
		obj.show();
		obj.display();

	}

}
class Thar extends SingleInheritanceExample{
	void show() {
		System.out.println("In show method");
	}
}