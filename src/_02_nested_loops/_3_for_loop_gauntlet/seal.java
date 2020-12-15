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
	int n = 3;
	int o = 1;
	int p = 1;
	int q = 2;
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
		/*for (int i = 0; i < 9999; i++) {
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
			k = 0;
				
			}
			if (m > 3) {
				break;
			}
			
			
		}
	*/
	
		//JOptionPane.showMessageDialog(null, "1   2   3 \n" + "4   5   6 \n" + "7   8   9");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
			
				 
			
			
			System.out.println(a+ " " + j);	
			}
			a = a + b;
			
		}
		for (int i = 1; i < 8; i+= 3) {
			System.out.print(i);
			for (int j = i+1; j < i+3; j++) {
				System.out.print( " " + j );
			}
			System.out.println();
		}
			
					
					for (int i = 1; i < 100; i+=10) {
						System.out.print(i + " ");
						for (int j = i+1; j < i+10; j++) {
							System.out.print(j+ " ");
						}
						System.out.println();
					}
				
		
		
		for (int i = 0; i <6 ; i++) {
			System.out.print(i);    //turn i into asterisks
			for (int j = i-1; j > 1; j--) {
				System.out.print(j);  //turn j into asterisks
			}
			System.out.println();
		}
		
		
		
		
		
		










		
		
		
		
		
	
	
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


