package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class cdfsdzffdzx {
	static Robot a = new Robot();

	public static void main(String[] args) {

		int j = 99;
		a.setSpeed(2099999999);
		a.penDown();
		for (int i = 0; i < j; i++) {

			String b = JOptionPane
					.showInputDialog("wich doo u like moor, ae sirkl, ae skwaer, or ae tringl or doo u want too stoop or doo u want too moov");

			if (b.equals("skwaer")) {
				a.penDown();
				drawsquare();
			}
			if (b.equals("tringl")) {
				a.penDown();
				drawtringle();
			}

			if (b.equals("sirkl")) {
				a.penDown();
				drawsirkl();
			}
			if (b.equals("stoop")) {
				break;
			}
			if (b .equals("moov")) {
				a.move(200);
			}

			j = j + 1;

		}
	}

	private static void drawsirkl() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 45; i++) {
			a.move(16);
			a.turn(8);
		}
		a.penUp();
		a.turn(-120);
		a.move(100);
	}

	public static void drawtringle() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			a.move(200);
			a.turn(120);
		}
		a.penUp();
		a.turn(-120);
		a.move(100);
	}

	public static void drawsquare() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {

			a.move(200);
			a.turn(90);
		}
		a.penUp();
		a.turn(-120);
		a.move(100);

	}

}
