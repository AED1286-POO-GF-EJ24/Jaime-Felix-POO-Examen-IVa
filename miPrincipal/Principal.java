package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("Me escuchas");
        System.out.println("===========");

        System.out.println();

        // Llamada entrante
        System.out.println("Llamada Entrante:");
        System.out.print("Proporcione el titular del telefono:");
        System.out.print("Proporcione el numero del telefono:");
        System.out.print("Proporcione el precio de la llamada:");

        // Crear LlamadaTelefonicaEntrante
        LlamadaTelefonica lt1 = new LlamadaTelefonicaEntrante(titular,numero,precio);

        entrada.nextLine();     // Eliminar <Enter> pendiente

        // Llamada saliente

        // Crear LlamadaTelefonicaSaliente
        LlamadaTelefonica lt2 = new LlamadaTelefonicaSaliente(titular,numero,duracion,costoPorMinuto);

        // Mostrar los datos de las llamadas
        System.out.println();

        entrada.close();
    }
}