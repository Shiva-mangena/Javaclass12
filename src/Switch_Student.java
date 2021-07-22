import java.util.Scanner;

public class Switch_Student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student marks");
		System.out.println("enter the Maths marks");
		int math = sc.nextInt();
		System.out.println("enter the English marks");
		int eng = sc.nextInt();
		System.out.println("enter the Hindi marks");
		int hindi = sc.nextInt();
		System.out.println("enter the Science marks");
		int science = sc.nextInt();
		System.out.println("enter the Social marks");
		int social = sc.nextInt();
		System.out.println("enter the Telugu marks");
		int telugu = sc.nextInt();
		int total_marks = (math + eng + hindi + science + social + telugu);
		//int overall= sc.nextInt();
		
		System.out.println(total_marks);
		int percentage = (total_marks/6);
				
		System.out.println("% ="+percentage);
		int choice;

		if (percentage >= 75 && percentage <= 100) {
			choice = 1;
		}

		else if (choice >= 60 && choice < 75) {
			choice = 2;
		} else if (choice >= 50 && choice < 60) {
			choice = 3;
		} else if (choice >= 35 && choice < 50) {
			choice = 4;
		} else if (choice < 35) {
			choice = 5;
		}
		
		System.out.println(choice);
		
		if ((math <= 100) && (eng <= 100) && (hindi <= 100) && (science <= 100) && (social <= 100) && (telugu <= 100)) {

			if ((math >= 35) && (eng >= 35) && (hindi >= 35) && (science >= 35) && (social >= 35) && (telugu >= 35))

			{

				System.out.println("passed in all subjects");
				// System.out.println("total percentage of all marks is " + choice);

				switch (choice) {

				case 1:
					System.out.println("Student scored  A Grade");
					break;
				case 2:
					System.out.println("Student scored B Grade");
					break;
				case 3:
					System.out.println("Student scored C Grade");
					break;
				case 4:
					System.out.println("Student scored D Grade");
					break;
				case 5:
					System.out.println("Student scored F Grade");
					break;

				}
			}

			else {

				if (math < 35)
					System.out.println("student Failed in maths and his marks are" + math);
				if (eng < 35)
					System.out.println("student Failed in English and his marks are" + eng);
				if (hindi < 35)
					System.out.println("student Failed in Hindi and his marks are" + hindi);
				if (science < 35)
					System.out.println("student Failed in Science and his marks are" + science);
				if (social < 35)
					System.out.println("student Failed in Social and his marks are" + social);
				if (telugu < 35)
					System.out.println("student Failed in Telugu and his marks are" + telugu);

				//System.out.println("Total student percentage is" + total_percentage);
				System.out.println("Student is failed");
			}

		}

		else {

			System.out.println("please make sure marks should not be greater than 100");
		}

	}

}
