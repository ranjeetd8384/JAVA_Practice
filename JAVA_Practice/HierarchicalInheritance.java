package JFSJD;

public class HierarchicalInheritance {

		public static void main(String[] args) {
			new Employeee();
			new Accounts();
		
		}
		
	}
	 class Company1{
		
		void getname() {
			System.out.println("It is the name of company method");
		}
		
		void getId() {
			System.out.println("Its the getID method");
		}
	}
	 class Accounts1 extends Company{
		 Accounts1(){
			 getAccount();
		 }
		 void getAccount() {
			 System.out.println("It is the getaccount method");
		 }
	 }
	 
	 class Employeee1 extends Company{
		 Employeee1(){
			 super.getname();
			 super.getId();
			
		 }
	 }