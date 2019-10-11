import javax.swing.*;
import java.util.Scanner;

public class kul1 {
public static void main (String [] args){
	//variabler
	long summa;
	int k = 0;
	int u = 0;
	int o = 1
	
	//scanner
	Scanner input = new Scanner (System.in);
	String N1 = JOptionPane.showInputDialog(null, "Please enter choosen number");
	int n = Integer.parseInt(N1);
	
	//koden
	
	while (k <= n) {
		summa = o/k;
		u = (k+1)*(k+1);
		k = k + 1;
	}
	JOptionPane.showMessageDialog(null, "din summa = " + summa);
	}
}