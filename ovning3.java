import javax.swing.*;

public class ovning3 {
	public static void main (String[] args) {
	
	//variabler
	
	int d = 60000000000000;
	
	double pi = 3.1415;
	
	long r = d/2;
	
	double a = r*r*pi;
	
	double o = d*pi;
	
	JOptionPane.showMessageDialog(null, "diameter = " + d + " cm" + "\nradie = " + r + " cm");
	JOptionPane.showMessageDialog(null, "area = " + a + " cm2" + "\nomkrets = " + o + " cm");
	
	}
}