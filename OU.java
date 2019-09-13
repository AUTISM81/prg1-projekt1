import javax.swing.*;
import java.util.Scanner;
 
public class OU {
	public static void main (String[] args) {
		
		String s1;
		s1 = System.getProperty("user.name");
		JOptionPane.showMessageDialog(null,s1);
		
		String s2;
		s2 = " Nasfallan 5 ";
		JOptionPane.showMessageDialog(null, s2);
		s2 = "\n Nasfallan 5";
		
		String s3;
		s3 = " 070-3960100";
		JOptionPane.showMessageDialog(null, s3);
		s3 = "\n 070-3960100";
		
		String s4;
		s4 = s1 + s2 + s3;
		JOptionPane.showMessageDialog(null,s4);
	}
}