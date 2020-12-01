package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class seal {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int c = 2;
	int d = 7;
	int e = 7;
	int k = 0;
	int m = 0;
	for (int i = 0; i <100; i++) {
		a = a + b;
		System.out.println(a);
	}
	for (int i = 0; i < 100; i++) {
	a = a - b;
	System.out.println(a);
	}
	for (int i = 0; i < 50; i++) {
		a = a + c;
		System.out.println(a);
	}
	for (int i = 0; i < 49; i++) {
		b = b + c;
		System.out.println(b);
	}
	for (int j = 0; j < 500; j++) {
		if (j%2 == 0) {
			System.out.println(j + " even");
		}
		else {
			System.out.println(j + " odd");
		}
	}
		
		for (int l = 0; l <9999; l++) {
			d = d + e;
			System.out.println(d);
			if (d > 777 ) {
			break;	
			}
		}
		for (int i = 0; i < 9999; i++) {
String f = 			JOptionPane.showInputDialog("wut is ur age");
int g = Integer.parseInt(f);
int h = 2020 -g;
JOptionPane.showMessageDialog(null, "u wer born in " + h);
break;
		}
		for (int i = 0; i < 999999; i++) {
			System.out.println(m +" "+" "+k);
			k = k + 1;
			if (k > 3) {
				m = m + 1;
			k =	k = 0;
				
			}
			if (m > 3) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

