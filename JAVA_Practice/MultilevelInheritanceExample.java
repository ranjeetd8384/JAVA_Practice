package JFSJD;

public class MultilevelInheritanceExample {
	public static void main(String[] args) {
		new Employeee();
	
	}
	
}
 class Company{
	
	void getname() {
		System.out.println("It is the name of company method");
	}
	
	void getId() {
		System.out.println("Its the getID method");
	}
}
 class Accounts extends Company{
	 void getAccount() {
		 System.out.println("It is the getaccount method");
	 }
 }
 
 class Employeee extends Accounts{
	 Employeee(){
		 super.getname();
		 super.getId();
		 super.getAccount();
	 }
 }