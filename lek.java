import java.util.Scanner;
import javax.swing.*;

public class lek {
	public static void main (String[] args) {
	//variabler
	String losen;
	String user;
	
	String operation;
	
	Scanner input = new Scanner(System.in);
	
	user = JOptionPane.showInputDialog(null, "Please enter username");
	
	if (user.equals ("noob1337")) {
	
	losen = JOptionPane.showInputDialog("Please enter password");
	
	if (losen.equals ("hej123")) {
	
	String height = JOptionPane.showInputDialog("Please enter your height in centimeters");
	int height1 = Integer.parseInt(height);
	
	String age = JOptionPane.showInputDialog("Please enter your age");
	int age1 = Integer.parseInt(age);
	
	if (age1 >= 18 || height1 > 185) {
		JOptionPane.showMessageDialog(null, "Oj du se ju nog gammal ut fo u kunna kop ut, ge mig en 7:a!");
			} else if (age1 < 18) {
		JOptionPane.showMessageDialog(null, "du e inte gammal nog att va hera unge!" + "\nStick!");
				}
			}
		}
	}
}