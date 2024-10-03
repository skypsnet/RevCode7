package RenCode7;

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7{

     public static void main(String[] args) {
        
        // Add System.in inside Scannet
        Scanner s = new Scanner(System.in);
        // Add correct types (strings)      
        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("Canadá", "Otawwa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "México DF");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa rica", "San José");
        capitales.put("El Salvador","San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");
    
        String c = "";

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            c = s.nextLine();
            
            if (!c.equals("salir")) {
                if (capitales.containsKey(c)) {
                System.out.print("La capital de " + c);
                System.out.println(" es " + capitales.get(c));
                } else {
                System.out.print("No conozco la respuesta ");
                System.out.print("¿cuál es la capital de " + c + "?: ");
                String ca = s.nextLine();
                capitales.put(c, ca);
                System.out.println("Gracias por enseñarme nuevas capitales");
                }
            }
        } while (!c.equals("salir"));

        s.close();
    
    }

}

