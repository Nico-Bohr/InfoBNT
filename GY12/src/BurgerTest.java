

public class BurgerTest {
    
    
    public static void main (String[] args) {
        Burger Hamburger = new Burger("Hamburger", 1, false, "Ketchup");
        Burger Cheeseburger = new Burger ("Cheeseburger", 1.29, true, "Ketchup");
        Burger Chickenburger = new Burger ("Chickenburger", 1.39, false, "Chili-Soße");
        
        System.out.println(Hamburger);
        System.out.println(Cheeseburger);
        System.out.println(Chickenburger);
    }
}