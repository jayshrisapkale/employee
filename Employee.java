

public class Employee {


	int id=5;
	
		   public void display() {
		      System.out.println("employee id" +id);
		   }
		   public static void main(String[] arguments) {
			      wageemployee w = new wageemployee();
			      w.wemployee();
			     w.display();
			   }
		}
		class wageemployee extends Employee {
		   public void wemployee() {
		      System.out.println("wageemployee id is" +id);
		   }
		
		
		   
		}


	




