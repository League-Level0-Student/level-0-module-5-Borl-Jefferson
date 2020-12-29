package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	static // 2. Add the following variable to the next line: 
	// this will be used to store the happiness of your pet
	String pet = "";
	static int hap = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
 pet = JOptionPane.showInputDialog("what pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
int j = 5		;
 for (int i = 0; i < j; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you do?", "CHOOSE YOUR FATE", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Clean up it's poop.", "Teach it how to fart on command.", "acknowledge it's existance.", "stop" }, null);
System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
if (task == 0) {
	clean();
	JOptionPane.showMessageDialog(null, hap);
}
if (task == 1) {
	fart();
	JOptionPane.showMessageDialog(null, hap);
}
if (task == 2) {
	normal();
	JOptionPane.showMessageDialog(null, hap);
}
if (task == 3) {
	break;
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
j = j + 9;
	}
}
	 // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void clean(){
		JOptionPane.showMessageDialog(null, "Why would you do that!?!? you made your " + pet +" sad :(");
		hap = hap - 5;
	}
	static void fart() {
		JOptionPane.showMessageDialog(null, "\"very smart decision you made. High IQ you have \" Is what Yoda would say.");
		hap = hap + 4;
	}
	static void normal() {
		JOptionPane.showMessageDialog(null, "Now why would you do that? you should be ashamed of yourself.");
		hap = hap -2;
	}
}