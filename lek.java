import java.util.Scanner;
import javax.swing.*;

public class lek {
	public static void main (String[] args) {
	//variabler
	int age;
	String losen;
	String user;
	
	String operation;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter username");
	user = input.nextLine();
	
	if (user.equals ("noob1337")) {
	
	System.out.println("Please enter password");
	losen = input.nextLine();
	
	if (losen.equals ("hej123")) {
		
	System.out.println("Please enter your age");
	
	age = input.nextInt();
	
	if (age >= 18) {
		System.out.println ("Oj du e ju nog gammal att kopa ut, ge mig en 7:a gubbe!");
			}
	if (age < 18) {
		System.out.println("du e inte gammal nog att va hera unge!" + "\nStick!");
			}
		}
	System.out.println("Fel losen din bog!" + "\nStick!");
		}
	}
}