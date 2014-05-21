

package gy12;
import java.util.Scanner;


public class Taschenrechner 
{ public static void main(String[] args) 
{ Scanner eingabe = new Scanner(System.in); 

double Ergebniss = 0; 

System.out.println("Taschenrechner 1.0"); 
System.out.print("1. Zahl: "); 
String zahlS = eingabe.nextLine(); 
double zahl = Double.parseDouble(zahlS); 
System.out.print("2. Zahl: "); 
String zahl2S = eingabe.nextLine(); 
double zahl2 = Double.parseDouble(zahl2S); 
Ergebniss = zahl * zahl2; 
System.out.println("Das Ergebniss lautet: " +Ergebniss); }
}