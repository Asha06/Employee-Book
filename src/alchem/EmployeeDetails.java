package alchem;

import java.util.Scanner;

public class EmployeeDetails {
	String empDetails[]=new String[7];
	public void showMenu()
	{
		int option;
		Scanner sc=new Scanner(System.in);
		System.out.println("----------Menu----------");
		System.out.println("1.Enter Data");
		System.out.println("2.Display Data");
		System.out.println("3.Exit");
		System.out.println("\nChoose the option: ");
		option=sc.nextInt();

		//switch case
		switch(option)
		
		{
			case 1:enterData();
				break;
			case 2:displayData();
				break;
			case 3:exitMenu();
				break;
			default:System.out.println("Incorrect menu option");
				showMenu();
				break;
		}
	}
	//Method definition
	public void enterData()
	{
		System.out.println("Enter data method is invoked");	
		Scanner ip1=new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		empDetails[0]=ip1.nextLine();
		if(!empDetails[0].charAt[0]=='e')
		{
			System.out.println("Invalid Employee ID");
		}
		
		System.out.println("Enter Employee Name: ");
		empDetails[1]=ip1.nextLine();
		System.out.println("Enter Designation: ");
		empDetails[2]=ip1.nextLine();
		System.out.println("Enter Employee Date of Joining: ");
		empDetails[3]=ip1.nextLine();
		System.out.println("Enter Employee DOB: ");
		empDetails[4]=ip1.nextLine();
		System.out.println("Enter Employee Martial Status: \n");
		System.out.println("s.Single  m.Married");
		empDetails[5]=ip1.nextLine();
		if(empDetails[5].contentEquals("m"))
		{
			System.out.println("Enter Employee Date of Marriage: ");
			empDetails[6]=ip1.nextLine();
		}showMenu();
		
	}
	public void displayData()
	{
		System.out.println("Display Data method is invoked");
		System.out.println("Enter the Employee ID to be viewed: ");
	
		System.out.println("Employee Details::");
		for(int i=0;i<empDetails.length;i++)
		{
			
				System.out.println(empDetails[i]);
		}
		
	//	showMenu();
	}
	
	public void exitMenu()
	{
		System.out.println("Exit Menu method is invoked");
		System.exit(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails ed=new EmployeeDetails ();
		ed.showMenu();
	}
}
