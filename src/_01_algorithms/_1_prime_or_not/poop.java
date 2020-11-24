package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class poop {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("pick a number.");
	int b = Integer.parseInt(a);
	int c = 0;
	int d = 1;
	for (int i = 0; i <= b; i++) {
		c = c + d;
			
		if (b%c==0) {
			if (c != 1 && c != b) {
				
			
			System.out.println(c);
			
		}
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
