import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcion_elegida;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--BIENVENIDOS AL MUNDO DE WESTEROS");

        System.out.println("1.- Crear personaje");
        System.out.println("2.- Ver personaje");
        System.out.println("3.- Salir");

        System.out.println("Por favor ingrese una opcion: ");

        opcion_elegida = scanner.nextLine();
        System.out.print("La opcion escogida por el usuario es: " + opcion_elegida);

        switch (opcion_elegida) {
            case "1":
                System.out.println("CREACION DE PERSONAJE");
                break;
            case "2":
                System.out.println("VER PERSONAJE");
                break;
            case "3":
                System.out.println("GRACIAS POR JUGAR");
                break;
        
            default:
                System.out.println("POR FAVOR INGRESE UNA DE LAS OPCIONES PERMITIDAS");
                break;
        }

    }
    
}