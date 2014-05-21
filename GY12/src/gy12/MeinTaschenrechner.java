

package gy12;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class MeinTaschenrechner {
    
    public static void main(String[]args){
        
        double var1 = 0;
        double var2 = 0;
        double erg = 0;
        
        String i = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Geben Sie einen Wert für Variable 1 ein:");
        var1= input.nextDouble();
        
        System.out.println("Geben Sie einen Wert für Variable 2 ein:");
        var2= input.nextDouble();
        
        System.out.println("Geben sie 'a' für Addition, 's' für Substraktion, 'm' für Multiplikation und 'd' für Division ein");
        i = input.next();
        
        char choice = i.charAt(0);
        
        switch(choice)
        {
            case 'a' : erg= var1+var2; break;
            case 's' : erg= var1-var2; break;
            case 'm' : erg= var1*var2; break;
            case 'd' : erg= var1/var2;
      
        }
        
        System.out.println("Ergebniss lautet:" +erg);
    }
    
}
