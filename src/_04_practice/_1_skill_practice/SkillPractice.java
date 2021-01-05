package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;



	
	public class SkillPractice {
		 public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		        /*   skills.skill1();
		           skills.skill2();  */
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		 }

		 void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have




		// Tell them how many cents they have (hint multiply by 10)


	String a = JOptionPane.showInputDialog("we smell dimes,how many?");
	int b = Integer.parseInt(a);
	b = b * 10;
	JOptionPane.showMessageDialog(null, b + " is the amount of cents u have because of dimes.");


		// Ask the user how tall they are (inches)


String c = JOptionPane.showInputDialog("how tall r u in inches?");
int d = Integer.parseInt(c);
if (d < 36) {
	JOptionPane.showMessageDialog(null, "eat ur wheaties.");
}
		// If they are shorter than 36 inches, tell them to eat their Wheaties




		 }

		 void skill2() {// Write a loop to print every third number between 1 and 30 to the console 
int e = 1;
System.out.println(e);
for (int i = 0; i < 99; i++) {
	e = e + 3;
	System.out.println(e);
if (e > 28) {
	break;
}
}




		 }

		 void skill3() {// Get a random number that is less than 20 and print it to the console 

			 Random ran = new Random();
			 int number =ran.nextInt(10-0+0) + 10;
			 int a =ran.nextInt(10-0+1) + 0;
				System.out.println(number);
				System.out.println(a);
		// Get another random number that is less than 10 and print it to the console 



		// Using a pop-up, tell the user the difference between the numbers// Hint: use subtraction 

JOptionPane.showMessageDialog(null, "the differemnce between the two is " + (number-a));

			}

		 void skill4() {// In a pop-up, ask the user for the city they live in 

String a = JOptionPane.showInputDialog("what city do u live in?");
if (a .equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "you live in America's Finest City.");
}
else {
	JOptionPane.showMessageDialog(null, "then move to san diego");
}
		// If they answered "San Diego", tell them they live in America's Finest City 



		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has.// If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int carl = 1000;


		// If there is 1 car, use a pop-up to display the make/model of the car 



		// If there is more than 1 car, use a pop-up to display how many wheels the// cars have between them. 

JOptionPane.showMessageDialog(null, (carl*4));

		 }

		 void skill5() {// In a pop-up, ask the user for the name of their school 
String a = JOptionPane.showInputDialog("what school do you go to?");
JOptionPane.showMessageDialog(null, a + " is a great school");

		// In another pop-up, tell the user, that their school is a fantastic school.// You must include the name of the school in the message. 



		 }
		 
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

