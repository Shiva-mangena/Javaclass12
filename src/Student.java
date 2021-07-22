import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student marks");
		System.out.println("enter the Maths marks");
		double math = sc.nextDouble();
		System.out.println("enter the English marks");
		double eng = sc.nextDouble();
		System.out.println("enter the Hindi marks");
		double hindi = sc.nextDouble();
		System.out.println("enter the Science marks");
		double science = sc.nextDouble();
		System.out.println("enter the Social marks");
		double social = sc.nextDouble();
		System.out.println("enter the Telugu marks");
		double telugu = sc.nextDouble();
		System.out.println("enter total marks");
	    double total = sc.nextDouble();
		double total_marks = (math + eng + hindi + science + social + telugu);
		
		
		double total_percentage = (total_marks / total) * 100;
		
		System.out.println(total_percentage);
		//conditions to tell that marks should be below or equal to 100
		
		if ((math <= 100) && (eng <= 100) && (hindi <=100) && (science <= 100) && (social <= 100) && (telugu <= 100)) {
			
		// if each subject is greater or equal to 35 then all subjects are passed 
		   if
		((math >= 35) && (eng >= 35) && (hindi >=35) && (science >= 35) && (social >= 35) && (telugu >= 35)) 
		
		{

			System.out.println("passed in all subjects");
			System.out.println("total percentage of all marks is " + total_percentage);
			
			      if (total_percentage>=75) 
				           System.out.println(" Student scored A grade"); // grater or equal to 75 is A grade
		         	else if ((total_percentage>=60)&&(total_percentage<=75)) // greater or equal to 60 and less than or equal 75 is B grade
			     	       System.out.println("student scored B grade");
			        else if ((total_percentage>=50)&&(total_percentage<=60))// gr
				           System.out.println("student scored C grade");
			        else if ((total_percentage>=35)&&(total_percentage<=50))
				           System.out.println("student scored C grade");
			        else if (total_percentage<35)
					       System.out.println("student scored F grade");		
		}

		else 
		{
			
			if (math<35)
				System.out.println("student Failed in maths and his marks are"+math);
			  if (eng<35)
				System.out.println("student Failed in English and his marks are"+eng);
			  if (hindi<35)
				System.out.println("student Failed in Hindi and his marks are"+hindi);
			  if (science<35)
				System.out.println("student Failed in Science and his marks are"+science);
			 if (social<35)
				System.out.println("student Failed in Social and his marks are"+social);
			 if (telugu<35)
				System.out.println("student Failed in Telugu and his marks are"+telugu);
			
			System.out.println("Total student percentage is"+total_percentage);	
			System.out.println("Student is failed");
		}
		
		
	
		}
		
		else {
			
			System.out.println("please make sure marks should not be greater than 100");
		}
			
			
		}
	}

