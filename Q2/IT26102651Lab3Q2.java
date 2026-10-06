import java.util.Scanner; 


public class IT26102651Lab3Q2{
	
 
  public static void main(String[]args){
  
    Scanner input = new Scanner (System.in);
	
	System.out.print("Enter the monthly salary:");
	double monthlySalary = input.nextDouble();
	
	System.out.print("Enter the number of OT hours:");
	double othours = input.nextDouble();
	
	System.out.print("Enter the OT hourly rate:");
	double hourlyRate = input.nextDouble();
	
	double otAmount = othours * hourlyRate; 
	double totalAmount = monthlySalary + otAmount;
	 
	System.out.println();
	System.out.println("The total salary including OT is: " + totalAmount);
	
	
  
  }

}