package main;

import java.util.Scanner;

public class Program {
    
    private static Scanner sc = new Scanner(System.in);
//    private static final String ARANY = "Én rejtem a kincset.";
//    private static final String EZUST = "Nem én rejtem a kincset.";
//    private static final String BRONZ = "Az arany hazudik.";
    private static String[] feliratok = {"Arany: Én rejtem a kincset.", "Ezüst: Nem én rejtem a kincset.", "Bronz: Az arany hazudik."};
    
    public static void main(String[] args) {
        System.out.println("A játék leírása: 3 láda közül az egyik rejti a kincset. Mindegyiken van egy felirat, de csak az egyik láda állítása igaz!");
        
        for (int i = 0; i < 3; i++) {
            System.out.println(feliratok[i]);
        }
        boolean helyes = false;
        do {            
            System.out.print("Add meg, hogy szerinted melyik láda rejti a kincset(1.arany, 2.ezüst, 3.bronz): ");
            int tipp = sc.nextInt();
            if (tipp == 2) {
                System.out.println("Helyes válasz! Megtaláltad a kincset.");
                helyes = true;
            } else {
                System.out.println("Rossz válasz. Próbáld újra!");
            }
        } while (!helyes);
        
    }
    
}
