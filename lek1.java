import java.util.*;
import javax.swing.*;

public class lek1 {
	public static void main (String[] args) {
		
		//variabler
		String poang;
		int poang1;
		String betyg;
		
		poang = JOptionPane.showInputDialog(null, "please enter your points on this test here");
		poang1 = Integer.parseInt(poang)d;
		
		JOptionPane.showMessageDialog(null, "On this test you can get either a F, E, D, C, B or A based on your points" "\nE = 25p   D = 30   C = 35  B = 40   A = 45");
		
		switch (poang1){
			case: 0;	
				poang = "F";
				break;
			case: 25;
				poang = "E";
				break;
			case: 30;
				poang = "D";
				break;
			case: 35;
				poang = "C";
				break;
			case: 40;
				poang = "B";
				break;
			case: 45;
				poang = "A";
				break;
		}
		JOptionPane.showMessageDialog(null, "your grade is " + poang);
	}
}