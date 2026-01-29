/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee dwight  = new Employee(1987,"Dwight","Schrute",4416.66);
		Employee jim  = new Employee(2474,"Jim","Halpert",4416.66);
		Employee pam  = new Employee(2011,"Pam","Beesly",2250.0);
		Employee kevin = new Employee(6900,"Kevin","Malone",4416.67);
	michael.raiseSalary(4);
	dwight.raiseSalary(5);
	jim.raiseSalary(4);
	pam.raiseSalary(60); //why was Pam paid so low?
	kevin.raiseSalary(4);
	
	
	
	
	michael.employeeToString();
	dwight.employeeToString();
	jim.employeeToString();
	pam.employeeToString();
	kevin.employeeToString();
	System.out.println("_________________________________");	
	System.out.println("The annual salery of Michael is: "+michael.getAnnualSalary());
	System.out.println("The annual salery of Dwight is: "+dwight.getAnnualSalary());
	System.out.println("The annual salery of Jim is: "+jim.getAnnualSalary());
	System.out.println("The annual salery of Pam is: "+pam.getAnnualSalary());
	System.out.println("The annual salery of Kevin is: "+kevin.getAnnualSalary());
	System.out.println("_________________________________");
	System.out.println("    ");
	}
}
