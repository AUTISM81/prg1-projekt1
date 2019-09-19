/*
 Ett enkelt Hello World i java
 Skapat 2019-09-13
 Programmerare Christian Bäckström
 */
 import javax.swing.*;
 import java.util.Scanner;
 
public class Test2 {
	public static void main (String[] args){
		
		char c1='\u00D8';
		
		char c2='\u00F8';
		
		char c3='\u262D';
		
		JOptionPane.showMessageDialog(null, ""+c1);
		JOptionPane.showMessageDialog(null, ""+c2);			
		JOptionPane.showMessageDialog(null, ""+c3);	

		String a;
		a = "Programspråk";
		
		
		String b;
		b = a.substring(4,8) + a.substring(7);
		
		
		JOptionPane.showMessageDialog(null, b);
		
		// variabeldeklaration
		
		String msg;
		// tilldelning
		
		msg = "Nu har variabeln ett värde";
		// initiering
		
		int tal = 17;
		// dialogruta
		
		msg = JOptionPane.showInputDialog(null,"Skriv ett meddelande");
		JOptionPane.showMessageDialog(null, msg);
		// I teerminalen
		
		System.out.println("Skriv ett meddelande");
		Scanner tgb = new Scanner(System.in);
		msg = tgb.nextLine();
		System.out.println(msg);
	} 
}